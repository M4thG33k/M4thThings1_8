package com.m4thg33k.m4ththings.proxies;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.init.ModBlockRenderers;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();

        OBJLoader.instance.addDomain(M4thThings.MOD_ID);
    }

    @Override
    public void init() {
        super.init();

        ModBlockRenderers.init();
    }
}
