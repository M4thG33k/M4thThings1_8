package com.m4thg33k.m4ththings.handlers;

import com.m4thg33k.m4ththings.renderers.tiles.utilities.RendererHelper;
import net.minecraftforge.common.MinecraftForge;

public class ModEventHandler {

    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new ClientTickHandler());
    }

    public static void clientPreInit()
    {
        MinecraftForge.EVENT_BUS.register(new TextureHandler());
        MinecraftForge.EVENT_BUS.register(new MiscModEvents());
    }
}
