package com.m4thg33k.m4ththings.models;

import com.google.common.base.Function;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.pipeline.LightUtil;

import java.util.List;

public class ModelHelper {

    public static final Function<ResourceLocation, TextureAtlasSprite> TEXTUREGETTER = input -> Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(input.toString());

    public static TextureAtlasSprite getTAS(Block block, World world)
    {
        return Minecraft.getMinecraft().getBlockRendererDispatcher().getModelFromBlockState(block.getDefaultState(),world, null).getParticleTexture();
    }

    public static void renderQuads(WorldRenderer renderer, List<BakedQuad> quads, int color)
    {
        for (BakedQuad bakedQuad : quads)
        {
            LightUtil.renderQuadColor(renderer, bakedQuad, color);
        }
    }
}
