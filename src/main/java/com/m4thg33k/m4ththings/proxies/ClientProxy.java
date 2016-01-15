package com.m4thg33k.m4ththings.proxies;

import com.m4thg33k.m4ththings.init.ModBlockRenderers;

public class ClientProxy extends CommonProxy {


    @Override
    public void init() {
        super.init();

        ModBlockRenderers.init();
    }
}
