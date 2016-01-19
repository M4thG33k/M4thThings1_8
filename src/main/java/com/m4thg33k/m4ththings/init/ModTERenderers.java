package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.renderers.tiles.BaseTankRenderer;
import com.m4thg33k.m4ththings.tiles.TileAdvancedTank;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ModTERenderers {

    public static void init()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileBaseTank.class, new BaseTankRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileAdvancedTank.class, new BaseTankRenderer());
    }
}
