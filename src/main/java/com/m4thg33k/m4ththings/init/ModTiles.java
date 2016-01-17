package com.m4thg33k.m4ththings.init;

import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTiles {

    public static void init()
    {
        GameRegistry.registerTileEntity(TileBaseTank.class, "tileBaseTank");
    }
}
