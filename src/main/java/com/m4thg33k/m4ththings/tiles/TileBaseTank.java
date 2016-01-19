package com.m4thg33k.m4ththings.tiles;

import com.m4thg33k.m4ththings.interfaces.IM4thNBTSync;
import com.m4thg33k.m4ththings.packets.ModPackets;
import com.m4thg33k.m4ththings.packets.PacketFilling;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class TileBaseTank extends TileFluidHandler implements ITickable, IM4thNBTSync{

    //protected int timer;
//    protected FluidTank oldTank;
    protected int cap;
    protected int tankSize;
    protected int mode;
    protected int numModes = 3;
    protected boolean advanced;
    protected int timer = 0;
    protected int placeTime = 60;

    public TileBaseTank()
    {
        super();
        cap = 8000;
        tankSize = 0;
        //timer = 0;
        tank = new FluidTank(cap);
        mode = 0;
        advanced = false;
    }

    //public void advanceTimer()
//    {
//        timer = (timer+1)%360;
//    }

    @Override
    public void update() {
        timer = (timer+1)%placeTime;
//        if (oldTank==null)
//        {
//            oldTank = new FluidTank(cap);
//        }
//        NBTTagCompound tagCompound = new NBTTagCompound();
//        tank.writeToNBT(tagCompound);
//        oldTank.readFromNBT(tagCompound);

//        advanceTimer();
        if (tank.getFluidAmount()>cap)
        {
            tank.setFluid(new FluidStack(tank.getFluid(),cap));
        }

        if (mode==1)
        {
            attemptPush();
        }
        else if (mode==2 && timer==0)
        {
            attemptPlacement();
        }

        prepareSync();
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        if (tag.hasKey("x"))
        {
            super.readFromNBT(tag);
        }
        else
        {
            tank.readFromNBT(tag);
        }

        if (tag.hasKey("Mode"))
        {
            mode = tag.getInteger("Mode");
        }

        if (tag.hasKey("Timer"))
        {
            timer = tag.getInteger("Timer");
        }

//        if (tag.hasKey("Timer"))
//        {
//            timer = tag.getInteger("Timer")%360;
//        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setInteger("Mode",mode);
        tag.setInteger("Timer",timer);
//        tag.setInteger("Timer",timer);
    }

    public boolean isAdvanced()
    {
        return advanced;
    }

    public int getMode()
    {
        return mode;
    }

    public void setEmpty()
    {
        tank.setFluid(null);
    }

    @Override
    public int fill(EnumFacing from, FluidStack resource, boolean doFill) {
        if (resource==null || resource.amount==0)
        {
            return 0;
        }

        if (canFill(from,resource.getFluid()))
        {
            int toReturn = super.fill(from, resource, doFill);
            if (doFill && toReturn>0)
            {
                int direction = (from==null ? 6 : from.ordinal());

                ModPackets.INSTANCE.sendToAllAround(new PacketFilling(pos,direction,1,resource.getFluid().getName(),toReturn),new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
            }
            if (toReturn != resource.amount && from!= EnumFacing.UP && resource.isFluidEqual(tank.getFluid())) //if we have "leftovers"
            {
                TileEntity tileEntity = worldObj.getTileEntity(this.pos.up());
                int pushing = 0;
                if (tileEntity!=null && tileEntity instanceof TileBaseTank && ((TileBaseTank)tileEntity).getMode()==1)
                {
                    pushing = ((TileBaseTank)tileEntity).fill(EnumFacing.DOWN, new FluidStack(resource,resource.amount-toReturn),false);
                }
                if (pushing > 0)
                {
                    ModPackets.INSTANCE.sendToAllAround(new PacketFilling(pos,EnumFacing.UP.ordinal(),0,resource.getFluid().getName(),toReturn), new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
                    toReturn += ((TileBaseTank)tileEntity).fill(EnumFacing.DOWN, new FluidStack(resource, resource.amount-toReturn), doFill);
                }
            }
            return toReturn;
        }
        return 0;
    }

    @Override
    public FluidStack drain(EnumFacing from, FluidStack resource, boolean doDrain) {
        if (resource==null || resource.amount==0)
        {
            return null;
        }

        if (canDrain(from, resource.getFluid()))
        {
            FluidStack ret = super.drain(from,resource,doDrain);
            if (doDrain && ret.amount>0)
            {
                int direction = (from==null ? 6 : from.ordinal());
                ModPackets.INSTANCE.sendToAllAround(new PacketFilling(pos,direction,0,resource.getFluid().getName(),ret.amount), new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
            }
            return ret;
        }
        return null;
    }

    @Override
    public FluidStack drain(EnumFacing from, int maxDrain, boolean doDrain) {
        if (canDrain(from,null))
        {
            FluidStack ret = super.drain(from,maxDrain,doDrain);
            if (doDrain && ret != null && ret.amount > 0)
            {
                int direction = (from == null ? 6 : from.ordinal());
                ModPackets.INSTANCE.sendToAllAround(new PacketFilling(pos,direction,0,ret.getFluid().getName(),ret.amount), new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
            }
            return ret;
        }
        return null;
    }

    @Override
    public boolean canFill(EnumFacing from, Fluid fluid) {
        //we shouldn't allow filling from below if we are in drain mode and the block below is not another tank
        TileEntity tileEntity = worldObj.getTileEntity(pos.down());
        return (from == null || from == EnumFacing.UP || (from == EnumFacing.DOWN && ((mode!=1) || (tileEntity != null && tileEntity instanceof TileBaseTank ))));
    }

    @Override
    public boolean canDrain(EnumFacing from, Fluid fluid) {
        return (from == EnumFacing.DOWN || from == EnumFacing.UP || from == null);
    }

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
            ModPackets.INSTANCE.sendToAllAround(new PacketNBT(pos,tagCompound), new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
        }
    }

    public double getPercentFilled()
    {
        return (1.0*tank.getFluidAmount())/tank.getCapacity();
    }

    //attempts to push fluid in the tank to a fluid handler beneath it
    public void attemptPush()
    {
        if (tank.getFluidAmount()==0)
        {
            return;
        }

        TileEntity tileEntity = worldObj.getTileEntity(pos.down());
        if (tileEntity==null || !(tileEntity instanceof IFluidHandler) || !((IFluidHandler)tileEntity).canFill(EnumFacing.UP,tank.getFluid().getFluid()))
        {
            return;
        }

        int validAmount = ((IFluidHandler)tileEntity).fill(EnumFacing.UP, new FluidStack(tank.getFluid(),Math.min(tank.getFluidAmount(),(int)(tank.getCapacity()*0.25))),false);
        if (validAmount>0)
            ((IFluidHandler)tileEntity).fill(EnumFacing.UP,new FluidStack(tank.getFluid(),validAmount),true);
        this.drain(EnumFacing.DOWN,validAmount,true);
    }

    public int switchMode(boolean allowAdvanced)
    {
        if (allowAdvanced)
        {
            mode = (mode+1)%numModes;
        }
        else
        {
            mode = (mode+1)%2;
        }
        return mode;
    }

    //attempts to place the fluid in the world below the tank
    public void attemptPlacement()
    {
        if (worldObj.isRemote || tank.getFluidAmount()<1000 || worldObj.getBlockState(pos.down()).getBlock()!= Blocks.air || !tank.getFluid().getFluid().canBePlacedInWorld())
        {
            return;
        }
        Block toPlace = tank.getFluid().getFluid().getBlock();
        worldObj.setBlockState(pos.down(),toPlace.getDefaultState());
        IBlockState placed = worldObj.getBlockState(pos.down());
//        Block placedBlock = placed.getBlock();
//        placedBlock.onNeighborBlockChange(worldObj,pos.down(),null,null);
        worldObj.getBlockState(pos.down()).getBlock().onNeighborBlockChange(worldObj,pos.down(),placed,null);
//        worldObj.getBlockState(pos.down()).getBlock().onNeighborChange(worldObj,pos.down(),pos);
        drain(EnumFacing.DOWN,1000,true);
    }

    public void setFluid(FluidStack fluidStack)
    {
        tank.setFluid(fluidStack);
    }

    public void writeAllButLocationToNBT(NBTTagCompound tagCompound)
    {
        tank.writeToNBT(tagCompound);
        tagCompound.setInteger("Mode",mode);
    }

    public void setMode(int m)
    {
        mode = m%numModes;
    }

    public int getAmount()
    {
        return tank.getFluidAmount();
    }

    public int getCap()
    {
        return cap;
    }

    public FluidStack getFluid()
    {
        return tank.getFluid();
    }

    public double getRoundedPercentFilled()
    {
        int percent = (int)(getPercentFilled()*10000);
        return ((double)percent/100.0);
    }


}
