package com.m4thg33k.m4ththings.items;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.api.block.IDismantleable;
import com.m4thg33k.m4ththings.api.item.IToolHammer;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.List;

public class ItemWrench extends Item implements IToolHammer {

    public ItemWrench()
    {
        setUnlocalizedName("itemWrench");
        setMaxStackSize(1);
        setCreativeTab(M4thThings.mainM4thTab);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        Block block = world.getBlockState(pos).getBlock();
        if (player.isSneaking() && block!=null && block instanceof IDismantleable)
        {
            if (((IDismantleable)block).canDismantle(player, world, pos) && !world.isRemote)
            {
                ((IDismantleable)block).dismantleBlock(player, world, pos, false);
            }
        }
        return false;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        Block block = worldIn.getBlockState(pos).getBlock();
        if (playerIn.isSneaking() && (block==null) || block.isAir(worldIn,pos))
        {
            stack.setItemDamage((stack.getItemDamage()+1)%2);
            LogHelper.info("Damage set to: " + stack.getItemDamage());
        }
        return true;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return stack.getItem().getUnlocalizedName()+"_"+stack.getItemDamage();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
        if (worldIn.isRemote)
        {
            return itemStackIn;
        }

        if (playerIn.isSneaking())
        {
            itemStackIn.setItemDamage((itemStackIn.getItemDamage()+1)%2);
        }
        return itemStackIn;
    }

    @Override
    public boolean isUsable(ItemStack stack, EntityLivingBase entity, int x, int y, int z) {
        return true;
    }

    @Override
    public void toolUsed(ItemStack stack, EntityLivingBase entity, int x, int y, int z) {

    }

    @Override
    public Item getContainerItem() {
        return super.getContainerItem();
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }


    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        int meta = stack.getItemDamage();

        switch (meta)
        {
            case 1:
                tooltip.add(EnumChatFormatting.ITALIC + "Has an opposite effect on some blocks...");
                break;
            default:
                tooltip.add(EnumChatFormatting.ITALIC + "Hit things like you normally do!");
                break;
        }

    }
}
