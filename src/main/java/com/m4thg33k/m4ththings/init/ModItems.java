package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.items.ItemWrench;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item itemWrench = new ItemWrench();

    public static void init()
    {
        GameRegistry.registerItem(itemWrench, "itemWrench");
    }
}
