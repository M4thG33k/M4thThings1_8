package com.m4thg33k.m4ththings.tiles;

import net.minecraftforge.fluids.FluidTank;

public class TileAdvancedTank extends TileBaseTank {

    public TileAdvancedTank()
    {
        super();
        cap = 256000;
        tankSize = 0;
        tank = new FluidTank(cap);
        mode = 0;
        advanced = true;
    }
}
