package com.m4thg33k.m4ththings.items;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.Utility.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemModIngot extends Item {

    public ItemModIngot()
    {
        setUnlocalizedName(NameHelper.blockItemName("itemModIngot"));
        setCreativeTab(M4thThings.mainM4thTab);
        setMaxStackSize(64);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
        subItems.add(new ItemStack(itemIn, 1, 0));
    }
}
