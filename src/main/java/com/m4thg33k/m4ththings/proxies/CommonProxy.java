package com.m4thg33k.m4ththings.proxies;

import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.handlers.ModEventHandler;
import com.m4thg33k.m4ththings.init.ModBlocks;
import com.m4thg33k.m4ththings.init.ModItems;
import com.m4thg33k.m4ththings.init.ModRecipes;
import com.m4thg33k.m4ththings.init.ModTiles;
import com.m4thg33k.m4ththings.packets.ModPackets;
import com.m4thg33k.m4ththings.packets.PacketFilling;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
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
        ModRecipes.init();
    }

    public void postInit()
    {

    }

    public void handleNBTPacket(PacketNBT message) {

    }

    public void tankFillParticles(PacketFilling message)
    {

    }

    //temporary function
    public void renderFillParticles(World world, BlockPos blockPos, String fluidName)
    {

    }
}
