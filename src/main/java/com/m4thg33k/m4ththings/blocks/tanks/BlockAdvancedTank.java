package com.m4thg33k.m4ththings.blocks.tanks;

import com.m4thg33k.m4ththings.tiles.TileAdvancedTank;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAdvancedTank extends BlockBaseTank {

    public BlockAdvancedTank(Material material)
    {
        super(material);
        setUnlocalizedName("blockAdvancedTank");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileAdvancedTank();
    }

    @Override
    public boolean amAdvanced() {
        return true;
    }
}
