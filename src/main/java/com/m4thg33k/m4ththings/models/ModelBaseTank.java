package com.m4thg33k.m4ththings.models;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.m4thg33k.m4ththings.interfaces.IBaseTankModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.model.Attributes;
import net.minecraftforge.client.model.IFlexibleBakedModel;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;
import net.minecraftforge.client.model.pipeline.LightUtil;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
import java.util.List;


public class ModelBaseTank implements IBaseTankModel{

    private IFlexibleBakedModel tankValves;

    private static final Function<ResourceLocation, TextureAtlasSprite> TEXTUREGETTER = input -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(input.toString());

    public ModelBaseTank()
    {
        try
        {
            //loading the obj
            OBJModel model = ((OBJModel) OBJLoader.instance.loadModel(new ResourceLocation("m4ththings:models/block/blockBaseTank.obj")));

            //apply the texture and orient correctly
            //IModel valveModel = ((OBJModel) model.retexture(ImmutableMap.of("#None","m4ththings:blocks/blockBaseTank"))).process(ImmutableMap.of("flip-v", "true"));
            IModel valveModel = model.process(ImmutableMap.of("flip-v","true"));

            //turn on valves
            tankValves = valveModel.bake(new OBJModel.OBJState(ImmutableList.of("Valves"),false), Attributes.DEFAULT_BAKED_FORMAT, TEXTUREGETTER);

        } catch (IOException e)
        {
            throw new ReportedException(new CrashReport("Error making model for BaseTank!",e));
        }
    }

    @Override
    public void renderValves()
    {
        renderModel(tankValves);
    }

    public void renderModel(IFlexibleBakedModel model)
    {
        renderModel(model, -1);
    }

    public void renderModel(IFlexibleBakedModel model, int color)
    {
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
        worldrenderer.func_181668_a(GL11.GL_QUADS, model.getFormat());
//        worldrenderer.begin(GL11.GL_QUADS, model.getFormat());

        this.renderQuads(worldrenderer, model.getGeneralQuads(), color);
        tessellator.draw();
    }

    private void renderQuads(WorldRenderer renderer, List<BakedQuad> quads, int color)
    {
        for (BakedQuad bakedQuad : quads)
        {
            LightUtil.renderQuadColor(renderer, bakedQuad, color);
        }
    }

}
