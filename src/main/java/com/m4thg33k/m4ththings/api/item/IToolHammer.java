package com.m4thg33k.m4ththings.api.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

//copied from COFH TEAM
public interface IToolHammer {
    boolean isUsable(ItemStack stack, EntityLivingBase entity, int x, int y, int z);

    void toolUsed(ItemStack stack, EntityLivingBase entity, int x, int y, int z);
}
