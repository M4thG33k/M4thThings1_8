package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModItemRenderers {

    public static void init()
    {
        reg(ModItems.itemWrench);
    }

    public static void reg(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(M4thThings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
