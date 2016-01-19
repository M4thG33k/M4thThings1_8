package com.m4thg33k.m4ththings.items;

import com.m4thg33k.m4ththings.Utility.NameHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemModNugget extends Item {

    public ItemModNugget()
    {
        setUnlocalizedName(NameHelper.blockItemName("itemModNugget"));
        setMaxStackSize(64);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
}
