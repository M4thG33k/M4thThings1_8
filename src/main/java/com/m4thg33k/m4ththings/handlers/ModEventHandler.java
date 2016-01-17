package com.m4thg33k.m4ththings.handlers;

import net.minecraftforge.common.MinecraftForge;

public class ModEventHandler {

    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new ClientTickHandler());
        MinecraftForge.EVENT_BUS.register(new TextureHandler());
    }
}
