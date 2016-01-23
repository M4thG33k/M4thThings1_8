package com.m4thg33k.m4ththings.models;

import com.google.common.collect.ImmutableMap;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.Attributes;
import net.minecraftforge.client.model.IFlexibleBakedModel;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.TRSRTransformation;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

public class ModelSphere {

    private IFlexibleBakedModel sphere;

    //private static final Function<ResourceLocation, TextureAtlasSprite> TEXTUREGETTER = input -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(input.toString());

    public ModelSphere(ResourceLocation textureLocation)
    {
        try
        {
            //load the obj
            //OBJModel model = ((OBJModel) OBJLoader.instance.loadModel(new ResourceLocation("m4ththings:models/block/standardSphere.obj")));
            OBJModel model = ((OBJModel) OBJLoader.instance.loadModel(new ResourceLocation("m4ththings:models/block/fancySphere.obj")));


            //attempt to texture the model
//            IModel sphereModel = ((OBJModel) model.retexture(ImmutableMap.of("#fancySphere",textureLocation.toString())));
            IModel sphereModel = ((OBJModel) model.retexture(ImmutableMap.of("#fancySphere","minecraft:white")));


            //turn on sphere
            sphere = sphereModel.bake(TRSRTransformation.identity(), Attributes.DEFAULT_BAKED_FORMAT, ModelHelper.TEXTUREGETTER);


        } catch (IOException e)
        {
            throw new ReportedException(new CrashReport("Error making model for the standard sphere!",e));
        }
    }

    public void renderSphere(boolean isSolidColor)
    {
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldRenderer = tessellator.getWorldRenderer();
        worldRenderer.begin(GL11.GL_QUADS, sphere.getFormat());
        //worldRenderer.begin(GL11.GL_TRIANGLES,sphere.getFormat());

        ModelHelper.renderQuads(worldRenderer, sphere.getGeneralQuads(), -1);
        //this.renderQuads(worldRenderer, sphere.getGeneralQuads(),-1);
        tessellator.draw();
    }

    public IFlexibleBakedModel getSphere()
    {
        return sphere;
    }



}
