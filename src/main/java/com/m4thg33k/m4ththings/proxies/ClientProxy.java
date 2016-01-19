package com.m4thg33k.m4ththings.proxies;

import com.m4thg33k.m4ththings.M4thThings;
import com.m4thg33k.m4ththings.init.ModBlockRenderers;
import com.m4thg33k.m4ththings.init.ModItemRenderers;
import com.m4thg33k.m4ththings.init.ModTERenderers;
import com.m4thg33k.m4ththings.interfaces.IM4thNBTSync;
import com.m4thg33k.m4ththings.packets.PacketFilling;
import com.m4thg33k.m4ththings.packets.PacketNBT;
import com.m4thg33k.m4ththings.particles.ParticleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();

        ModItemRenderers.preinit();
        OBJLoader.instance.addDomain(M4thThings.MOD_ID);
    }

    @Override
    public void init() {
        super.init();

        ModBlockRenderers.init();
        ModItemRenderers.init();
        ModTERenderers.init();
    }

    @Override
    public void handleNBTPacket(PacketNBT message) {
        if (message==null)
        {
            return;
        }

        TileEntity tileEntity = Minecraft.getMinecraft().theWorld.getTileEntity(message.blockPos);

        if (tileEntity!=null && tileEntity instanceof IM4thNBTSync)
        {
            ((IM4thNBTSync)tileEntity).receiveNBTPacket(message.tagCompound);
        }
    }

    @Override
    public void tankFillParticles(PacketFilling message) {
        ParticleManager.tankFillParticles(Minecraft.getMinecraft().theWorld, new BlockPos(message.x,message.y,message.z), message.direction, message.isFilling, message.fluidName, message.amount);
    }

    //temp function

//    @Override
//    public void renderFillParticles(World world, BlockPos blockPos, String fluidName) {
//        ParticleManager.renderFillParticles(world, blockPos, fluidName);
//    }
}
