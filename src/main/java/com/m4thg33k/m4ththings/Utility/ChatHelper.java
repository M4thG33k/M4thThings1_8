package com.m4thg33k.m4ththings.Utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ChatHelper {

    public static void sayMessage(World world, EntityPlayer player, String text)
    {
        if(!world.isRemote)
        {
            player.addChatMessage(new ChatComponentText(text));
        }
    }
}
