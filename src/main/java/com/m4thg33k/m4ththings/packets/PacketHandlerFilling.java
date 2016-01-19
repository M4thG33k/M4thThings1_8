package com.m4thg33k.m4ththings.packets;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketHandlerFilling implements IMessageHandler<PacketFilling,IMessage>{

    @Override
    public IMessage onMessage(PacketFilling message, MessageContext ctx) {
        M4thThings.proxy.tankFillParticles(message);
        return null;
    }
}
