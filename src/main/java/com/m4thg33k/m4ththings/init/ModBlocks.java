package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.blocks.BlockIngotBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block blockIngotBlock = new BlockIngotBlock("blockIngotBlock", Material.iron,5.0f,10.0f);

    public static void init()
    {
        GameRegistry.registerBlock(blockIngotBlock, "blockIngotBlock");
    }
}
