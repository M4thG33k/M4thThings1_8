package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.items.ItemModCrafting;
import com.m4thg33k.m4ththings.items.ItemModIngot;
import com.m4thg33k.m4ththings.items.ItemModNugget;
import com.m4thg33k.m4ththings.items.ItemWrench;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item itemWrench = new ItemWrench();
    public static Item itemModIngot = new ItemModIngot();
    public static Item itemModCrafting = new ItemModCrafting();
    public static Item itemModNugget = new ItemModNugget();

    public static void init()
    {
        GameRegistry.registerItem(itemModIngot, "itemModIngot");
        GameRegistry.registerItem(itemModNugget, "itemModNugget");
        GameRegistry.registerItem(itemModCrafting, "itemModCrafting");
        GameRegistry.registerItem(itemWrench, "itemWrench");
    }
}
