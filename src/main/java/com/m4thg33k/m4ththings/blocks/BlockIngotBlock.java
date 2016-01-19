package com.m4thg33k.m4ththings.blocks;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngotBlock extends Block {

    public BlockIngotBlock(String unlocalizedName, Material material, float hardness, float resistance)
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(M4thThings.mainM4thTab);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }


}
