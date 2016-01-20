package com.m4thg33k.m4ththings.interfaces;

import com.m4thg33k.m4ththings.Utility.BasicTools;
import com.m4thg33k.m4ththings.packets.ModPackets;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.util.Stack;
import java.util.Vector;

public class TileFluidTransportEntry extends TileFluidHandler implements IM4thTransportBlock, IM4thNBTSync, ITickable {

    private boolean[] connections = new boolean[6];
    private int attachedSide;
    private EnumFacing[] directions = EnumFacing.VALUES;
    private int timer;
    //private int randomocity;
    private int MAX_TIMER = 20;
    private int AMOUNT = 100;

    public TileFluidTransportEntry()
    {
        super();
        attachedSide = 0;
        tank = new FluidTank(8000);
        timer = 0;
    }

    public TileFluidTransportEntry(int meta)
    {
        super();
        attachedSide = meta;
        timer = 0;
    }

    @Override
    public void update() {
        timer = (timer+1)%MAX_TIMER;

        if (!worldObj.isRemote && timer==0)
        {
            attemptFill();
            attemptPlace();
        }
    }

    public void attemptFill()
    {
        TileEntity tileEntity = BasicTools.getTEOnSide(worldObj,pos,attachedSide);
        if (tileEntity != null && tileEntity instanceof IFluidHandler)
        {
            if (fill(getSide(),((IFluidHandler) tileEntity).drain(getSide().getOpposite(),AMOUNT,false),false)>0)
            {
                fill(getSide(),((IFluidHandler) tileEntity).drain(getSide().getOpposite(),AMOUNT,true),true);
            }
        }
    }

    public EnumFacing getSide()
    {
        return directions[attachedSide];
    }

    public void attemptPlace()
    {
        if (tank.getFluidAmount()==0)
        {
            return;
        }

        Stack<BlockPos> stack = findPath();
        if (stack.size() < 2)
        {
            return;
        }

        TileEntity tileEntity = worldObj.getTileEntity(stack.lastElement());
        EnumFacing fillDir = BasicTools.getFacingFromPositionSubtraction(stack.elementAt(stack.size()-2),stack.lastElement()); //directions[stack.lastElement()].getOpposite();
        EnumFacing drainDir = getSide().getOpposite();
        FluidStack drained;
        if (tileEntity!=null && tileEntity instanceof IFluidHandler)
        {
            drained = drain(drainDir,((IFluidHandler) tileEntity).fill(fillDir,tank.getFluid(),true),true);
            if (drained != null && drained.amount>0)
            {
                int[] data = BasicTools.stackToIntArray(stack);
                //// TODO: 1/19/2016 send path data to client for rendering purposes
            }
        }

    }

    public BlockPos followPath(Stack<Integer> path)
    {
        BlockPos location = new BlockPos(pos);

        for (int i=0;i<path.size();i++)
        {
            location.add(directions[path.elementAt(i)].getDirectionVec());
        }

        return location;
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        if (tag.hasKey("AttachedSide"))
        {
            attachedSide = tag.getInteger("AttachedSide");
        }
        if (tag.hasKey("Connections"))
        {
            connections = BasicTools.intToBoolArray(tag.getIntArray("Connections"));
        }
        if (tag.hasKey("Timer"))
        {
            timer = tag.getInteger("Timer");
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setInteger("AttachedSide",attachedSide);
        tag.setIntArray("Connections",BasicTools.boolToIntArray(connections));
        tag.setInteger("Timer",timer);
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
            ModPackets.INSTANCE.sendToAllAround(new PacketNBT(pos,tagCompound),new NetworkRegistry.TargetPoint(worldObj.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),32));
            this.markDirty();
        }
    }
    //END IM4thNBTSync

    //ITransportBlock
    @Override
    public boolean isSideConnected(EnumFacing side) {
        return side.ordinal()<6 && connections[side.ordinal()];
    }

    @Override
    public void setConnection(EnumFacing side, boolean makeThis, boolean attemptNeighbor) {
        if (worldObj.isRemote || side.ordinal()>6 || side.ordinal()==attachedSide || connections[side.ordinal()]==makeThis)
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
    public void attemptToSetNeighborConnection(EnumFacing side, boolean makeThis) {
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
    //END ITransportBlock

    public int getAttachedSide()
    {
        return attachedSide;
    }

    public void connectToAllTransportBlocks()
    {
        TileEntity tileEntity;
        for (int i=0;i<6;i++)
        {
            tileEntity = BasicTools.getTEOnSide(worldObj, pos, i);
            if (tileEntity != null && tileEntity instanceof IM4thTransportBlock) {
                setConnection(directions[i], true, true);
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

    @Override
    public int fill(EnumFacing from, FluidStack resource, boolean doFill) {
        if (resource==null)
        {
            return 0;
        }
        if (canFill(from,resource.getFluid())) {
            return super.fill(from, resource, doFill);
        }
        return 0;
    }

    @Override
    public FluidStack drain(EnumFacing from, FluidStack resource, boolean doDrain) {
        if (canDrain(from,resource.getFluid())) {
            return super.drain(from, resource, doDrain);
        }
        return null;
    }

    @Override
    public FluidStack drain(EnumFacing from, int maxDrain, boolean doDrain) {
        if (canDrain(from,null)) {
            return super.drain(from, maxDrain, doDrain);
        }
        return null;
    }

    @Override
    public boolean canFill(EnumFacing from, Fluid fluid) {
        return directions[attachedSide]==from;
    }

    @Override
    public boolean canDrain(EnumFacing from, Fluid fluid) {
        return directions[attachedSide]!=from;
    }

    /*checks to see if the given side leads to a valid connection
        if ANS is the return value for this method,
        ANS&1==1 if the side is connected
        ANS&2==2 if the side is connected to an IFluidHandler
        ANS&4==4 if the side is connected to an ITransportBlock
     */
    @Override
    public int isValidFluidConnection(EnumFacing side,FluidStack fluidStack)
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

    public Stack<BlockPos> findPath()
    {
        //Vector<LocVec> visited = new Vector<LocVec>();
        //visited.add(new LocVec(0,0,0));
//
        //LocVec currentLocation = new LocVec(0,0,0);

        IM4thTransportBlock transportBlock;
        int index;
        int validate;
        int currentLevel;
        BlockPos searchLocation;
        Vector<BlockPos> visited = new Vector<>();
        Stack<BlockPos> stack = new Stack<>();
        Stack<Integer> level = new Stack<>();
        Stack<BlockPos> path = new Stack<>();
        BlockPos currentLocation = BlockPos.ORIGIN;
        stack.push(currentLocation);
        level.push(0);
        while (stack.size()!=0)
        {
            currentLocation = stack.pop();
            currentLevel = level.pop();
            while (path.size()>currentLevel)
            {
                path.pop();
            }
            if (!visited.contains(currentLocation)) {
                visited.add(currentLocation);
                path.push(currentLocation);
                transportBlock = (IM4thTransportBlock) BasicTools.getTEAtRelLoc(worldObj, pos, currentLocation);

                for (int i = 0; i < 6; i++) {
                    index = i;//(i+randomocity)%6;
                    searchLocation = new BlockPos(currentLocation);
                    searchLocation.add(directions[index].getDirectionVec());
                    if (visited.contains(searchLocation)) //if we've already been here, skip the rest of the calculations
                    {
                        continue;
                    }
                    validate = transportBlock.isValidFluidConnection(directions[index], tank.getFluid());
                    if ((validate & 1) == 1) //we have a valid connection
                    {
                        if ((validate & 2) != 2) //we are not connecting to an IFluidHandler
                        {
                            stack.push(searchLocation);
                            level.push(path.size());
                        }
                        else
                        {
                            path.push(searchLocation);
                            return path;
                        }
                    }
                }
            }
//            else
//            {
//                path.pop();
//            }
        }
        return path;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return AxisAlignedBB.fromBounds(pos.getX(),pos.getY(),pos.getZ(),pos.getX()+1,pos.getY()+1,pos.getZ()+1);
    }

//    private void checkWork(Stack<Integer> stack)
//    {
//        int norm;
//        for (int i=0;i<stack.size()-1;i++)
//        {
//            norm = (stack.elementAt(i+1).difference(stack.elementAt(i))).oneNorm();
//            if (norm!=1)
//            {
//                LogHelper.info("Something ain't right...");
//            }
//        }
//    }

    @Override
    public void breakInvalidConnections()
    {
        TileEntity tileEntity;
        for (int i=0;i<6;i++)
        {
            if (connections[i])
            {
                tileEntity = BasicTools.getTEOnSide(worldObj,pos,i);
                if (tileEntity==null || !(tileEntity instanceof IM4thTransportBlock|| tileEntity instanceof IFluidHandler))
                {
                    toggleConnection(directions[i],false);
                }
            }
        }
    }
}
