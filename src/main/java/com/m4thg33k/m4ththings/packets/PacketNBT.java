package com.m4thg33k.m4ththings.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketNBT implements IMessage {

    public NBTTagCompound tagCompound;
    public BlockPos blockPos;

    public PacketNBT()
    {

    }

    public PacketNBT(BlockPos pos, NBTTagCompound compound)
    {
        this.blockPos = pos;
        this.tagCompound = compound;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        int x = ByteBufUtils.readVarInt(buf,5);
        int y = ByteBufUtils.readVarInt(buf,5);
        int z = ByteBufUtils.readVarInt(buf,5);
        this.blockPos = new BlockPos(x,y,z);
        this.tagCompound = ByteBufUtils.readTag(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf,blockPos.getX(),5);
        ByteBufUtils.writeVarInt(buf,blockPos.getY(),5);
        ByteBufUtils.writeVarInt(buf,blockPos.getZ(),5);
        ByteBufUtils.writeTag(buf,tagCompound);
    }
}
