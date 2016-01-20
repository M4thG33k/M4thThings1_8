package com.m4thg33k.m4ththings.tiles;

import com.m4thg33k.m4ththings.Utility.BasicTools;
import com.m4thg33k.m4ththings.interfaces.IM4thNBTSync;
import com.m4thg33k.m4ththings.interfaces.IM4thTransportBlock;
import com.m4thg33k.m4ththings.packets.ModPackets;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class TileTransportBlock extends TileEntity implements IM4thTransportBlock, IM4thNBTSync{
    boolean[] connections = new boolean[6];
    EnumFacing[] directions = EnumFacing.VALUES;


    public TileTransportBlock()
    {
        super();
        for (int i=0;i<6;i++)
        {
            connections[i] = false;
        }
    }


    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        if (tagCompound.hasKey("Connections"))
        {
            connections = BasicTools.intToBoolArray(tagCompound.getIntArray("Connections"));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setIntArray("Connections",BasicTools.boolToIntArray(connections));
    }

    @Override
    public boolean isSideConnected(EnumFacing side)
    {
        return side.ordinal()<6 && connections[side.ordinal()];
    }

    @Override
    public void setConnection(EnumFacing side, boolean makeThis, boolean attemptNeighbor)
    {
        if (worldObj.isRemote || side.ordinal()>6 || connections[side.ordinal()]==makeThis)
        {
            return;
        }

        connections[side.ordinal()] = makeThis;
        if (attemptNeighbor)
        {
            attemptToSetNeighborConnection(side,makeThis);
        }
        prepareSync();
    }


    @Override
    public void attemptToSetNeighborConnection(EnumFacing side, boolean makeThis)
    {
        TileEntity tileEntity = BasicTools.getTEOnSide(worldObj,pos,side.ordinal());
        if (tileEntity!=null && tileEntity instanceof IM4thTransportBlock)
        {
            ((IM4thTransportBlock) tileEntity).setConnection(side.getOpposite(),makeThis,false);
        }
    }

    @Override
    public void toggleConnection(EnumFacing side, boolean attemptNeighbor) {
        if (side.ordinal()>=6)
        {
            return;
        }
        this.setConnection(side,!connections[side.ordinal()],true);
    }

    @Override
    public boolean[] getConnections() {
        return connections;
    }

    //IM4thNBTSync
    @Override
    public void receiveNBTPacket(NBTTagCompound tagCompound) {
        this.readFromNBT(tagCompound);
    }

    @Override
    public void prepareSync() {
        if (!worldObj.isRemote)
        {
            NBTTagCompound tagCompound = new NBTTagCompound();
            this.writeToNBT(tagCompound);
            ModPackets.sendNBTPacket(worldObj,tagCompound,pos,32);
            this.markDirty();
        }
    }

    //End IM4thNBTSync


    @Override
    public Packet getDescriptionPacket() {
        prepareSync();
        NBTTagCompound tagCompound = new NBTTagCompound();
        this.writeToNBT(tagCompound);
        return new S35PacketUpdateTileEntity(pos,1,tagCompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    public void connectToAllTransportBlocks()
    {
        TileEntity tileEntity;
        for (int i=0;i<6;i++)
        {
            tileEntity = BasicTools.getTEOnSide(worldObj,pos,i);
            if (tileEntity!=null && tileEntity instanceof IM4thTransportBlock)
            {
                setConnection(directions[i],true,true);
            }
        }
    }

    public void connectToAllIFluidHandlers()
    {
        TileEntity tileEntity;
        for (int i=0;i<6;i++)
        {
            tileEntity = BasicTools.getTEOnSide(worldObj,pos,i);
            if (tileEntity!=null && tileEntity instanceof IFluidHandler)
            {
                setConnection(directions[i],true,true);
            }
        }
    }

    public void breakAllConnections()
    {
        for (int i=0;i<6;i++)
        {
            setConnection(directions[i],false,true);
        }
    }

    /*checks to see if the given side leads to a valid connection
        if ANS is the return value for this method,
        ANS&1==1 if the side is connected
        ANS&2==2 if the side is connected to an IFluidHandler
        ANS&4==4 if the side is connected to an ITransportBlock
     */

    @Override
    public int isValidFluidConnection(EnumFacing side, FluidStack fluidStack)
    {
        int ANS = 0;
        if (side.ordinal()>=6 || !connections[side.ordinal()])
        {
            return ANS;
        }
        TileEntity tileEntity = BasicTools.getTEOnSide(worldObj,pos,side.ordinal());
        if (tileEntity!=null)
        {
            if (tileEntity instanceof IFluidHandler && ((IFluidHandler) tileEntity).fill(side.getOpposite(),fluidStack,false)>0)
            {
                ANS += 2;
            }
            if (tileEntity instanceof IM4thTransportBlock)
            {
                ANS += 4;
            }
        }
        if (ANS>0)
        {
            ANS += 1;
        }
        return ANS;
    }

    @Override
    public void breakInvalidConnections()
    {
        TileEntity tileEntity;
        for (int i=0;i<6;i++)
        {
            if (connections[i])
            {
                tileEntity = BasicTools.getTEOnSide(worldObj,pos,i);
                if (tileEntity==null || !(tileEntity instanceof IM4thTransportBlock || tileEntity instanceof IFluidHandler))
                {
                    toggleConnection(directions[i],false);
                }
            }
        }
    }


    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.fromBounds(pos.getX(),pos.getY(),pos.getZ(),pos.getX()+1,pos.getY()+1,pos.getZ()+1);
    }
}
