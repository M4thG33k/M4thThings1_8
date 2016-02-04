package com.m4thg33k.m4ththings.renderers.tiles;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.Utility.NameHelper;
import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.handlers.TextureHandler;
import com.m4thg33k.m4ththings.interfaces.IBaseTankModel;
import com.m4thg33k.m4ththings.models.ModelBaseTank;
import com.m4thg33k.m4ththings.models.ModelHelper;
import com.m4thg33k.m4ththings.models.ModelSphere;
import com.m4thg33k.m4ththings.renderers.tiles.utilities.RendererHelper;
import com.m4thg33k.m4ththings.renderers.tiles.utilities.SphereRenderer;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.model.Attributes;
import net.minecraftforge.client.model.IFlexibleBakedModel;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;

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
//        GlStateManager.color(0.0f,0.0f,0.0f, 1.0f);

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
        //model.renderValves(te.isAdvanced()); //RENDER THE VALVES

        //attempt to model the sphere
        if (te.getAmount()>0)
        {
            double perc = te.getPercentFilled();
            double scale = perc*0.75;
            GlStateManager.pushMatrix();
//            GlStateManager.enableBlend();
//            GlStateManager.blendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
            GlStateManager.enableRescaleNormal();
            GlStateManager.color(1,1,1,1);
            GlStateManager.translate(0,0.05*perc*Math.sin(worldTime/20),0);
            GlStateManager.rotate((float)worldTime,0.0f,1.0f,0.0f);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.enablePolygonOffset();


//            Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
            sphere = new ModelSphere(te.getFluid().getFluid().getStill());
            sphere.renderSphere(true);
            //IBakedModel sphereModel = sphere.getSphere();




            //GlStateManager.enableColorMaterial();
            //Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelRenderer().renderModelBrightnessColor(sphereModel,1.0f,0.1f,0,0);

            GlStateManager.popMatrix();


//            Vec3 fluidColor = RendererHelper.getFluidRGB(te.getFluid().getFluid().getName());
//            GlStateManager.pushMatrix();
//            SphereRenderer.renderSolidColorSphere(0,0.05*perc*Math.sin(worldTime/20),0,worldTime,scale,fluidColor);

            //M4thThings.proxy.renderFillParticles(te.getWorld(),te.getPos(),te.getFluid().getFluid().getName());


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


        if (Minecraft.getMinecraft().thePlayer.getDistanceSq(te.getPos())<40) {        //render the overlays (hopefully)
            renderOverlay(x, y, z, te.getMode());
        }

    }

    public void renderOverlay(double x, double y, double z, int mode)
    {
        if (mode==0)
        {
            return;
        }
//        switch (mode)
//        {
//            case 1:
//                //bindTexture(NameHelper.newLocation("blocks/drainOverlay.png"));
//                //bindTexture(drainOverlay);
//                //break;
//            case 2:
//
//                bindTexture(NameHelper.newLocation("blocks/tankOverlays.png"));
//                //bindTexture(NameHelper.newLocation("blocks/placeOverlay.png"));
//                //bindTexture(placeOverlay);
//                break;
//            default:
//                return;
//        }

        bindTexture(TextureMap.locationBlocksTexture);

        TextureAtlasSprite tas;
        switch (mode)
        {
            case 2:
                tas = TextureHandler.placeOverlay;
                break;
            default:
                tas = TextureHandler.drainOverlay;
                break;
        }

        float umin = tas.getMinU();
        float vmin = tas.getMinV();
        float umax = tas.getMaxU();
        float vmax = tas.getMaxV();


        float temp = (float)(21.0/64.0)*(umax-umin);
        float temp2 = (float)(42.0/64.0)*(umax-umin);
        umax = umin + temp2;
        umin += temp;
//        umax = temp2;



        //draw overlays
        Tessellator tess = Tessellator.getInstance();
        WorldRenderer renderer = tess.getWorldRenderer();
        GlStateManager.pushMatrix();
//        GlStateManager.enableAlpha();
        GlStateManager.translate(x,y,z);

        renderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        renderer.pos(0.33,0,0.33).tex(umin,vmax).endVertex();
        renderer.pos(0.33,1.0,0.33).tex(umax,vmin).endVertex();
        renderer.pos(0.67,1.0,0.33).tex(umax,vmin).endVertex();
        renderer.pos(0.67,0,0.33).tex(umax,vmax).endVertex();
        tess.draw();

        renderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        renderer.pos(0.67,0,0.33).tex(umin,vmax).endVertex();
        renderer.pos(0.67,1.0,0.33).tex(umax,vmin).endVertex();
        renderer.pos(0.67,1.0,0.67).tex(umax,vmin).endVertex();
        renderer.pos(0.67,0,0.67).tex(umax,vmax).endVertex();
        tess.draw();

        renderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        renderer.pos(0.67,0,0.67).tex(umin,vmax).endVertex();
        renderer.pos(0.67,1.0,0.67).tex(umax,vmin).endVertex();
        renderer.pos(0.33,1.0,0.67).tex(umax,vmin).endVertex();
        renderer.pos(0.33,0,0.67).tex(umax,vmax).endVertex();
        tess.draw();
//
        renderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
        renderer.pos(0.33,0,0.67).tex(umin,vmax).endVertex();
        renderer.pos(0.33,1.0,0.67).tex(umax,vmin).endVertex();
        renderer.pos(0.33,1.0,0.33).tex(umax,vmin).endVertex();
        renderer.pos(0.33,0,0.33).tex(umax,vmax).endVertex();
        tess.draw();

//        GlStateManager.disableAlpha();
        GlStateManager.popMatrix();
    }
}
