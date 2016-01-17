package com.m4thg33k.m4ththings.blocks.tanks;

import com.m4thg33k.m4ththings.api.block.IDismantleable;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockBaseTank extends Block implements ITileEntityProvider, IDismantleable {

    public static final String blockName = "blockBaseTank";

    public BlockBaseTank(Material material)
    {
        super(material);
        setHardness(2.0F);
        setResistance(5.0F);
        setUnlocalizedName(blockName);
        setStepSound(Blocks.glass.stepSound);
        setHarvestLevel("pickaxe",2);
    }

    public String getBlockName()
    {
        return blockName;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileBaseTank();
    }

    @Override
    public boolean isBlockNormalCube() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) {
        this.setBlockBounds(0.333f,0,0.333f,0.667f,1,0.667f);
    }

    @Override
    public ArrayList<ItemStack> dismantleBlock(EntityPlayer player, World world, BlockPos blockPos, boolean bool) {
        return null;
    }

    @Override
    public boolean canDismantle(EntityPlayer player, World world, BlockPos blockPos) {
        return true;
    }

    @Override
    public int getRenderType() {
        return -1;
    }
}
