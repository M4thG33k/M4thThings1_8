package com.m4thg33k.m4ththings.Utility;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.Stack;

public class BasicTools {

    public static TileEntity getTEOnSide(World world, BlockPos pos, int side)
    {
        return world.getTileEntity(pos.add(EnumFacing.VALUES[side].getDirectionVec()));
    }

    public static TileEntity getTEAtRelLoc(World world,BlockPos start, BlockPos trans)
    {
        return world.getTileEntity(start.add(trans));
    }

    public static int[] stackToIntArray(Stack<BlockPos> stack)
    {
        int[] ret = new int[stack.size()-1];
        for (int i=0;i<stack.size()-1;i++)
        {
            ret[i] = getFacingFromPositionSubtraction(stack.elementAt(i+1),stack.elementAt(i)).ordinal();
        }

        return ret;
    }

    public static boolean[] intToBoolArray(int[] array)
    {
        boolean[] ret = new boolean[array.length];
        for (int i=0;i<array.length;i++)
        {
            ret[i] = array[i]==1;
        }

        return ret;
    }

    public static int[] boolToIntArray(boolean[] array)
    {
        int[] ret = new int[array.length];

        for (int i=0;i<array.length;i++)
        {
            ret[i] = array[i]?1:0;
        }

        return ret;
    }

    public static EnumFacing getFacingFromPositionSubtraction(BlockPos first, BlockPos second)
    {
        BlockPos temp = new BlockPos(first.subtract(second));
        return EnumFacing.getFacingFromVector(temp.getX(),temp.getY(),temp.getZ());
    }
}
