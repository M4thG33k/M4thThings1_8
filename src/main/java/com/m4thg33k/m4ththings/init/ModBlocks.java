package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.blocks.BlockIngotBlock;
import com.m4thg33k.m4ththings.blocks.tanks.BlockAdvancedTank;
import com.m4thg33k.m4ththings.blocks.tanks.BlockBaseTank;
import com.m4thg33k.m4ththings.items.ItemAdvancedTank;
import com.m4thg33k.m4ththings.items.ItemBaseTank;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

    public static Block blockIngotBlock = new BlockIngotBlock("blockIngotBlock", Material.iron,5.0f,10.0f);
    public static Block blockBaseTank = new BlockBaseTank(Material.glass);
    public static Block blockAdvancedTank = new BlockAdvancedTank(Material.glass);

    public static void init()
    {
        GameRegistry.registerBlock(blockIngotBlock, "blockIngotBlock");
        GameRegistry.registerBlock(blockBaseTank, ItemBaseTank.class, "blockBaseTank");
        GameRegistry.registerBlock(blockAdvancedTank, ItemAdvancedTank.class, "blockAdvancedTank");
    }
}
