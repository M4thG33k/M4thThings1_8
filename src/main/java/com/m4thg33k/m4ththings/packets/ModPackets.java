package com.m4thg33k.m4ththings.packets;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModPackets {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(M4thThings.MOD_ID);

    public static void init()
    {
        INSTANCE.registerMessage(PacketHandlerNBT.class, PacketNBT.class, 0, Side.CLIENT);
        INSTANCE.registerMessage(PacketHandlerFilling.class, PacketFilling.class, 1, Side.CLIENT);
    }


    public static void sendNBTPacket(World world,NBTTagCompound tagCompound, BlockPos pos, int distance)
    {
        INSTANCE.sendToAllAround(new PacketNBT(pos,tagCompound),new NetworkRegistry.TargetPoint(world.provider.getDimensionId(),pos.getX(),pos.getY(),pos.getZ(),distance));
    }

}
