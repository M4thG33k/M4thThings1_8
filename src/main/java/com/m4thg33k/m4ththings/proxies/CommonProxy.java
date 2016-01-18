package com.m4thg33k.m4ththings.proxies;

import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.handlers.ModEventHandler;
import com.m4thg33k.m4ththings.init.ModBlocks;
import com.m4thg33k.m4ththings.init.ModItems;
import com.m4thg33k.m4ththings.init.ModTiles;
import com.m4thg33k.m4ththings.packets.ModPackets;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

    public void preInit()
    {
        ModEventHandler.init();
        ModPackets.init();

        ModBlocks.init();
        ModItems.init();
        ModTiles.init();
    }

    public void init()
    {

    }

    public void postInit()
    {

    }

    public void handleNBTPacket(PacketNBT message) {

    }
}
