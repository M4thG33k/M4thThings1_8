package com.m4thg33k.m4ththings.models;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
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
import java.util.Set;


public class ModelBaseTank{

    private IFlexibleBakedModel tankValves;
    private IFlexibleBakedModel advancedTankValves;

    //private static final Function<ResourceLocation, TextureAtlasSprite> TEXTUREGETTER = input -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(input.toString());

    private static final Set<String> GROUP_NAMES = ImmutableSet.of("Valves");

    public ModelBaseTank()
    {
        try
        {
            //loading the obj
            OBJModel model = ((OBJModel) OBJLoader.instance.loadModel(new ResourceLocation("m4ththings:models/block/blockBaseTank.obj")));

            //apply the texture and orient correctly
            IModel valveModel = ((OBJModel) model.retexture(ImmutableMap.of("#None", "m4ththings:blocks/blockBaseTank"))).process(ImmutableMap.of("flip-v", "true"));
            IModel advancedValveModel = ((OBJModel) model.retexture(ImmutableMap.of("#None", "m4ththings:blocks/blockAdvancedTank"))).process(ImmutableMap.of("flip-v", "true"));

            //IModel valveModel = model.process(ImmutableMap.of("flip-v","true"));

            //turn on valves
            //tankValves = valveModel.bake(new OBJModel.OBJState(ImmutableList.of("Valves"),false), Attributes.DEFAULT_BAKED_FORMAT, TEXTUREGETTER);
            tankValves = valveModel.bake(TRSRTransformation.identity(), Attributes.DEFAULT_BAKED_FORMAT, ModelHelper.TEXTUREGETTER); //TEXTUREGETTER);
            advancedTankValves = advancedValveModel.bake(TRSRTransformation.identity(), Attributes.DEFAULT_BAKED_FORMAT, ModelHelper.TEXTUREGETTER);

        } catch (IOException e)
        {
            throw new ReportedException(new CrashReport("Error making model for BaseTank!",e));
        }
    }

    public void renderValves(boolean isAdvanced)
    {
        if(isAdvanced)
        {
            renderModel(advancedTankValves);
        }
        else
        {
            renderModel(tankValves);
        }
    }

    public void renderModel(IFlexibleBakedModel model)
    {
        renderModel(model, -1);
    }

    private void renderModel(IFlexibleBakedModel model, int color)
    {
        Tessellator tessellator = Tessellator.getInstance();
        WorldRenderer worldrenderer = tessellator.getWorldRenderer();
        worldrenderer.begin(GL11.GL_QUADS, model.getFormat());

        ModelHelper.renderQuads(worldrenderer, model.getGeneralQuads(), color);
        //this.renderQuads(worldrenderer, model.getGeneralQuads(), color);
        tessellator.draw();
    }

//    private void renderQuads(WorldRenderer renderer, List<BakedQuad> quads, int color)
//    {
//        for (BakedQuad bakedQuad : quads)
//        {
//            LightUtil.renderQuadColor(renderer, bakedQuad, color);
//        }
//    }

}
