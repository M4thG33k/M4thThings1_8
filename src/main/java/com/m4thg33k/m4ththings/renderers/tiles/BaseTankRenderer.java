package com.m4thg33k.m4ththings.renderers.tiles;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.interfaces.IBaseTankModel;
import com.m4thg33k.m4ththings.models.ModelBaseTank;
import com.m4thg33k.m4ththings.models.ModelHelper;
import com.m4thg33k.m4ththings.models.ModelSphere;
import com.m4thg33k.m4ththings.renderers.tiles.utilities.SphereRenderer;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class BaseTankRenderer extends TileEntitySpecialRenderer<TileBaseTank>{


    private static final ResourceLocation texture = new ResourceLocation("m4ththings:models/block/blockBaseTank.png");

    ModelBaseTank model;
    ModelSphere sphere;

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
        GlStateManager.enableRescaleNormal();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(0.0f,0.0f,0.0f, 1.0f);

        Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        //Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        double worldTime = (te.getWorld() == null) ? 0 : (double) (ClientTickHandler.ticksInGame + partialTicks) + new Random(te.getPos().hashCode()).nextInt(360);

        //LogHelper.info(worldTime);

//        worldTime += new Random(te.getPos().hashCode()).nextInt(360);

        GlStateManager.translate(x + 0.5, y + 0.5, z + 0.5);
        //GlStateManager.scale(1000,1000,1000);

        //GlStateManager.pushMatrix();
        //GlStateManager.rotate((float) worldTime * 1.5f, 0f, 1f, 0f);

        //GlStateManager.disableCull();
        model.renderValves(te.isAdvanced());

        //attempt to model the sphere
        if (te.getAmount()>0)
        {
            double perc = te.getPercentFilled();
            double scale = perc*0.75;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0,0.05*perc*Math.sin(worldTime/20),0);
            GlStateManager.rotate((float)worldTime,0.0f,1.0f,0.0f);
            GlStateManager.scale(scale,scale,scale);
            sphere = new ModelSphere(te.getFluid().getFluid().getStill());
            sphere.renderSphere();
            GlStateManager.popMatrix();
        }



//        GlStateManager.pushMatrix();
//        GlStateManager.translate(0.0,Math.sin(worldTime/20)*0.1,0.0);
//        GlStateManager.rotate((float)worldTime,0.0f,1.0f,0.0f);
//        GlStateManager.scale(0.5,0.5,0.5);
//        //GlStateManager.enableAlpha();
//        Fluid fluid = FluidRegistry.LAVA;
//        sphere = new ModelSphere(fluid.getStill());
//        sphere.renderSphere();
//        //IBakedModel model = Minecraft.getMinecraft().getBlockRendererDispatcher().getModelFromBlockState(block.getDefaultState(),te.getWorld(),null);
//        //SphereRenderer.renderSphere(0,0,0,0,1.0,model.getParticleTexture());
//        GlStateManager.popMatrix();

        //GlStateManager.popMatrix();
        //GlStateManager.disableBlend();
        GlStateManager.enableRescaleNormal();
        //GlStateManager.enableCull();
        GlStateManager.popMatrix();


    }
}
