package com.m4thg33k.m4ththings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockIngotBlock extends Block {

    public BlockIngotBlock(String unlocalizedName, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
}
