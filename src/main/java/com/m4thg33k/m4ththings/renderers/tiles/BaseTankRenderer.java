package com.m4thg33k.m4ththings.renderers.tiles;

import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.interfaces.IBaseTankModel;
import com.m4thg33k.m4ththings.models.ModelBaseTank;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustomData;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import org.lwjgl.opengl.GL11;

public class BaseTankRenderer extends TileEntitySpecialRenderer<TileBaseTank>{


    private static final ResourceLocation texture = new ResourceLocation("m4ththings:models/block/blockBaseTank.png");

    IBaseTankModel model;

    public BaseTankRenderer()
    {

    }

    @Override
    public void renderTileEntityAt(TileBaseTank te, double x, double y, double z, float partialTicks, int destroyStage) {
        if (te != null && te.getWorld() != null && !te.getWorld().isBlockLoaded(te.getPos(),false))
        {
            return;
        }

        if (model==null)
        {
            model = new ModelBaseTank();
        }

        GlStateManager.pushMatrix();
        //GlStateManager.enableRescaleNormal();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1f,1f,1f, 1f);

        Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        //Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        double worldTime = (te.getWorld() == null) ? 0 : (double) (ClientTickHandler.ticksInGame + partialTicks);

        GlStateManager.translate(x + 0.5, y + 0.5, z + 0.5);
        GlStateManager.scale(1000,1000,1000);

        //GlStateManager.pushMatrix();
        //GlStateManager.rotate((float) worldTime * 1.5f, 0f, 1f, 0f);

        //GlStateManager.disableCull();
        model.renderValves();

        //GlStateManager.popMatrix();
        //GlStateManager.disableBlend();
        //GlStateManager.enableRescaleNormal();
        //GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }
}
