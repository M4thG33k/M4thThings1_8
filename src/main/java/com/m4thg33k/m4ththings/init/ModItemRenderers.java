package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.Utility.NameHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModItemRenderers {

    public static void preinit()
    {
        ModelBakery.registerItemVariants(ModItems.itemModIngot, NameHelper.newLocation("itemModIngot_0"));
        ModelBakery.registerItemVariants(ModItems.itemWrench, NameHelper.newLocation("itemWrench"), NameHelper.newLocation("itemWrenchOpposite"));
        ModelBakery.registerItemVariants(ModItems.itemModCrafting,NameHelper.newLocation("itemCraftingValve") );
        ModelBakery.registerItemVariants(ModItems.itemModNugget,NameHelper.newLocation("itemModNugget_0"));
    }

    public static void init()
    {
        reg(ModItems.itemWrench,0,"itemWrench");
        reg(ModItems.itemWrench,1,"itemWrenchOpposite");
        reg(ModItems.itemModIngot,0,"itemModIngot_0");
        reg(ModItems.itemModNugget,0,"itemModNugget_0");
        reg(ModItems.itemModCrafting,0,"itemCraftingValve");
    }

    //used for items without metadata
    public static void reg(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(M4thThings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    //used for items with metadata
    public static void reg(Item item, int meta, String file)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,meta,new ModelResourceLocation(M4thThings.MOD_ID + ":" + file, "inventory"));
    }

    public static void reg(Item item, int meta, String itemName, String variantName)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,meta, new ModelResourceLocation(M4thThings.MOD_ID + ":" + itemName, variantName));
    }
}
