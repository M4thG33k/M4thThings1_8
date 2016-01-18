package com.m4thg33k.m4ththings.api.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

//copied from COFH TEAM
public interface IDismantleable {
    List<ItemStack> dismantleBlock(EntityPlayer player, World world, BlockPos blockPos, boolean bool);

    boolean canDismantle(EntityPlayer player, World world, BlockPos blockPos);
}
