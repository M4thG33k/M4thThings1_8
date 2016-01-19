package com.m4thg33k.m4ththings.renderers.tiles.utilities;

import com.google.common.collect.HashBiMap;
import com.m4thg33k.m4ththings.Utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IWorldAccess;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Map;

public class RendererHelper {

    private static BufferedImage blockTextures;
    private static int WIDTH, HEIGHT;
    public static boolean colorMapGenerated = false;
    public static Map<String,Vec3> colorMap;
    //public static Vec3[] colorMap;

    //the following methods are "borrowed" and adapted from LexManos: https://gist.github.com/LexManos/3c700306331080598daf
    public static void saveGlTexture(String fileName, int textureID, int mipmapLevels, boolean saveFile)
    {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D,textureID);

        GL11.glPixelStorei(GL11.GL_PACK_ALIGNMENT,1);
        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT,1);

        for (int level = 0;level<=mipmapLevels;level++)
        {
            int width = GL11.glGetTexLevelParameteri(GL11.GL_TEXTURE_2D,level,GL11.GL_TEXTURE_WIDTH);
            int height = GL11.glGetTexLevelParameteri(GL11.GL_TEXTURE_2D,level,GL11.GL_TEXTURE_HEIGHT);
            int size = width * height;

            BufferedImage bufferedImage = new BufferedImage(width,height,2);
            File output = new File(fileName + "_" + textureID + ".png");

            IntBuffer buffer = BufferUtils.createIntBuffer(size);
            int[] data = new int[size];

            GL11.glGetTexImage(GL11.GL_TEXTURE_2D, level, GL12.GL_BGRA, GL12.GL_UNSIGNED_INT_8_8_8_8_REV, buffer);
            buffer.get(data);
            bufferedImage.setRGB(0, 0, width, height, data, 0, width);

            if (textureID == 8)
            {
                blockTextures = bufferedImage;
                WIDTH = width;
                HEIGHT = height;
            }

            if (saveFile)
            {
                try
                {
                    ImageIO.write(bufferedImage,"png",output);
                    LogHelper.info("Wrote file: " + fileName);
                }
                catch (IOException e)
                {
                    LogHelper.info("Failed to write file: " + fileName);
                }
            }

            //Map<String,Fluid> fluidMap = FluidRegistry.getRegisteredFluids();

        }
    }

    public static void postTextureStitch(TextureStitchEvent.Post e) throws Exception{
        saveGlTexture("test",e.map.getGlTextureId(),0,true);
    }

    public static void createFluidColorMaps()
    {
        if (colorMapGenerated)
        {
            return;
        }

        colorMapGenerated = true;

        int numFluids = FluidRegistry.getMaxID();
        colorMap = HashBiMap.create();

        TextureAtlasSprite icon;
        int umin,umax,vmin,vmax,numPix,r,g,b,pixel;

        Map<String,Fluid> map = FluidRegistry.getRegisteredFluids();
        BlockRendererDispatcher dispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();

        for (String key : map.keySet())
        {
            IBlockState blockState = map.get(key).getBlock().getDefaultState();

            icon = dispatcher.getBlockModelShapes().getTexture(blockState);



            umin = (int)(WIDTH*icon.getMinU());
            umax = (int)(WIDTH*icon.getMaxU());
            vmin = (int)(HEIGHT*icon.getMinV());
            vmax = (int)(HEIGHT*icon.getMaxV());
            numPix = (umax-umin+1)*(vmax-vmin+1);
            r = g = b = 0;
            for (int u=umin;u<=umax;u++)
            {
                for (int v=vmin;v<=vmax;v++)
                {
                    pixel = blockTextures.getRGB(u,v);
                    b += pixel & 255;
                    g += (pixel>>8) & 255;
                    r += (pixel>>16) & 255;
                }
            }
            r = r/numPix;
            g = g/numPix;
            b = b/numPix;

            colorMap.put(key, new Vec3(r/256.0,g/256.0,b/256.0));
        }
    }

    public static Vec3 getFluidRGB(String fluidName)
    {
        if (!colorMapGenerated)
        {
            createFluidColorMaps();
        }

        return colorMap.get(fluidName);
    }

}
