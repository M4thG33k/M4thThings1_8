package com.m4thg33k.m4ththings;

import com.m4thg33k.m4ththings.init.ModBlocks;
import com.m4thg33k.m4ththings.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = M4thThings.MOD_ID, name = M4thThings.MOD_NAME, version = M4thThings.VERSION)
public class M4thThings {
    public static final String MOD_ID = "m4ththings";
    public static final String MOD_NAME = "M4th Things";
    public static final String VERSION = "@VERSION@";


    @Mod.Instance
    public static M4thThings instance = new M4thThings();

    @SidedProxy(clientSide = "com.m4thg33k.m4ththings.proxies.ClientProxy", serverSide = "com.m4thg33k.m4ththings.proxies.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent e)
    {
        proxy.postInit();
    }
}
