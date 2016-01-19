package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModBlockRenderers {

    public static String modid = M4thThings.MOD_ID;

    public static void init()
    {
        reg(ModBlocks.blockIngotBlock);
        reg(ModBlocks.blockBaseTank);
        reg(ModBlocks.blockAdvancedTank);
    }

    public static void reg(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5),"inventory"));
    }
}
