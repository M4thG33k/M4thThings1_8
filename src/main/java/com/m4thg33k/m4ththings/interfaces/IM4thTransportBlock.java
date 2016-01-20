package com.m4thg33k.m4ththings.interfaces;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.fluids.FluidStack;

public interface IM4thTransportBlock {

    boolean isSideConnected(EnumFacing side);

    void setConnection(EnumFacing side, boolean makeThis, boolean attemptNeighbor);

    void attemptToSetNeighborConnection(EnumFacing side, boolean makeThis);

    void toggleConnection(EnumFacing side, boolean attemptNeighbor);

    boolean[] getConnections();

    int isValidFluidConnection(EnumFacing side, FluidStack fluidStack);

    void breakInvalidConnections();
}
