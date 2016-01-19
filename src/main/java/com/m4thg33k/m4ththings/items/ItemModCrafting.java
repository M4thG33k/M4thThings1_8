package com.m4thg33k.m4ththings.items;

import com.m4thg33k.m4ththings.Utility.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemModCrafting extends Item {

    public ItemModCrafting()
    {
        setUnlocalizedName(NameHelper.blockItemName("itemModCrafting"));
        setMaxStackSize(64);
    }

    @Override
    public String getUnlocalizedNameInefficiently(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add(EnumChatFormatting.ITALIC + "Crafting item - no other use");
    }
}
