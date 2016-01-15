package com.m4thg33k.m4ththings.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.TileFluidHandler;

public class TileBaseTank extends TileFluidHandler implements ITickable{

    protected int timer;
    protected int cap;
    protected int tankSize;
    protected int mode;
    protected int numModes = 3;
    protected boolean advanced;

    public TileBaseTank()
    {
        super();
        cap = 8000;
        tankSize = 0;
        timer = 0;
        tank = new FluidTank(cap);
        mode = 0;
        advanced = false;
    }

    public void advanceTimer()
    {
        timer = (timer+1)%360;
    }

    @Override
    public void update() {
        advanceTimer();
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);

        if (tag.hasKey("Timer"))
        {
            timer = tag.getInteger("Timer")%360;
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);

        tag.setInteger("Timer",timer);
    }
}
