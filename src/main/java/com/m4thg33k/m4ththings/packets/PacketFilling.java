package com.m4thg33k.m4ththings.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PacketFilling implements IMessage {
    public int direction;
    public int isFilling;
    public int x;
    public int y;
    public int z;
    public String fluidName;
    public int amount;

    public PacketFilling()
    {

    }

    public PacketFilling(BlockPos blockPos, int direc, int filling, String fName, int amount)
    {
        this.x = blockPos.getX();
        this.y = blockPos.getY();
        this.z = blockPos.getZ();
        this.direction = direc;
        this.isFilling = filling;
        this.fluidName = fName;
        this.amount = amount;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        x = ByteBufUtils.readVarInt(buf,5);
        y = ByteBufUtils.readVarInt(buf,5);
        z = ByteBufUtils.readVarInt(buf,5);
        direction = ByteBufUtils.readVarInt(buf,1);
        isFilling = ByteBufUtils.readVarInt(buf,1);
        fluidName = ByteBufUtils.readUTF8String(buf);
        amount = ByteBufUtils.readVarInt(buf,5);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeVarInt(buf,x,5);
        ByteBufUtils.writeVarInt(buf,y,5);
        ByteBufUtils.writeVarInt(buf,z,5);
        ByteBufUtils.writeVarInt(buf,direction,1);
        ByteBufUtils.writeVarInt(buf,isFilling,1);
        ByteBufUtils.writeUTF8String(buf,fluidName);
        ByteBufUtils.writeVarInt(buf,amount,5);
    }
}
