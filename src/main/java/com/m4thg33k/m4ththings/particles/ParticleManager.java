package com.m4thg33k.m4ththings.particles;

import com.m4thg33k.m4ththings.Utility.ModMathHelper;
import com.m4thg33k.m4ththings.handlers.ClientTickHandler;
import com.m4thg33k.m4ththings.renderers.tiles.utilities.RendererHelper;
import com.m4thg33k.m4ththings.tiles.TileBaseTank;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import java.util.Random;

public class ParticleManager {

//    public static void renderFillParticles(World world, BlockPos blockPos,String fluidName)
//    {
//        EffectRenderer renderer = Minecraft.getMinecraft().effectRenderer;
//        Vec3 color = RendererHelper.getFluidRGB(fluidName);
//        EntityFX particle = new ParticleFluidOrb(world,blockPos.getX()+0.5,blockPos.getY()+1.5,blockPos.getZ()+0.5,0.0,0.05,0.0,(float)color.xCoord, (float)color.yCoord,(float)color.zCoord);
//        renderer.addEffect(particle);
//    }

    public static void tankFillParticles(World world, BlockPos pos, int direction, int isFilling, String fluidName, int amount)
    {
        if (!world.isRemote)
        {
            return;
        }

        Vec3 fluidColor = RendererHelper.getFluidRGB(fluidName);

        EffectRenderer renderer = Minecraft.getMinecraft().effectRenderer;
        TileBaseTank tileBaseTank = (TileBaseTank)(world.getTileEntity(pos));

        double radius = 0.375*tileBaseTank.getPercentFilled();//0.5+0.325*tileBaseTank.getPercentFilled();
        double rad;
        double d1,d2;
        EntityFX fluidOrb;
        double worldTime = (double) (ClientTickHandler.ticksInGame ) + new Random(tileBaseTank.getPos().hashCode()).nextInt(360);
        double verticalOffset = tileBaseTank.getPercentFilled() * 0.5 * Math.sin(worldTime/20);
        double randomHelper;
        double baseLifeLength = 10.0;

        double theta, phi, myLife, x1, y1, z1, xVel, yVel, zVel;

        switch (direction)
        {
            case 6: //used for NULL
                if (isFilling==1)
                {
                    for (int i=0;i<amount;i+=10)
                    {
                        theta = ModMathHelper.randomRad();
                        phi = ModMathHelper.randomRad()/2;
                        randomHelper = 1.0 - 0.1*Math.random();
                        myLife = baseLifeLength*randomHelper;
                        x1 = pos.getX()+0.5+0.4*Math.cos(theta)*Math.sin(phi);
                        y1 = pos.getY()+0.5+0.05*verticalOffset+0.4*Math.cos(phi);
                        z1 = pos.getZ()+0.5+0.4*Math.sin(theta)*Math.sin(phi);

                        xVel = (0.4-radius)*Math.cos(theta)*Math.sin(phi)/myLife;
                        yVel = (0.4-radius)*Math.cos(phi)/myLife;
                        zVel = (0.4-radius)*Math.sin(theta)*Math.sin(phi)/myLife;

                        fluidOrb = new ParticleFluidOrb(world,x1,y1,z1,-xVel,-yVel,-zVel,2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
                else
                {
                    for (int i=0;i<amount;i+=10)
                    {
                        theta = ModMathHelper.randomRad();
                        phi = ModMathHelper.randomRad()/2.0;
                        randomHelper = 1.0 - 0.1*Math.random();
                        myLife = baseLifeLength*randomHelper;
                        x1 = pos.getX()+0.5+radius*Math.cos(theta)*Math.sin(phi);
                        y1 = pos.getY()+0.5+0.05*verticalOffset+radius*Math.cos(phi);
                        z1 = pos.getZ()+0.5+radius*Math.sin(theta)*Math.sin(phi);
                        xVel = (0.4-radius)*Math.cos(theta)*Math.sin(phi)/myLife;
                        yVel = (0.4-radius)*Math.cos(phi)/myLife;
                        zVel = (0.4-radius)*Math.sin(theta)*Math.sin(phi)/myLife;
                        fluidOrb = new ParticleFluidOrb(world,x1,y1,z1,xVel,yVel,zVel,2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
                break;
            case 0: //from DOWN (0)
                if (isFilling==1) // we are filling from DOWN
                {
                    for (int i=0;i<amount;i+=100)
                    {
                        rad = ModMathHelper.randomRad();
                        randomHelper = 1.0 - 0.1*Math.random();
                        myLife = baseLifeLength*randomHelper;
                        d1 = radius*Math.sin(rad);
                        d2 = radius*Math.cos(rad);
                        //LogHelper.info("(" + d1 + ", " + d2 + ")");
                        fluidOrb = new ParticleFluidOrb(world,pos.getX()+0.5,pos.getY()+0.05,pos.getZ()+0.5,(d1/myLife),(0.45+0.05*verticalOffset)/(myLife),d2/myLife,2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
                else
                {
                    for (int i=0;i<amount;i+=100)
                    {
                        rad = ModMathHelper.randomRad();
                        randomHelper = 1.0 - 0.1*Math.random();
                        myLife = baseLifeLength*randomHelper;
                        d1 = radius*Math.sin(rad);
                        d2 = radius*Math.cos(rad);
                        fluidOrb = new ParticleFluidOrb(world,pos.getX()+0.5+d1,pos.getY()+0.5+0.05*verticalOffset,pos.getZ()+0.5+d2,-d1/myLife,-(0.45+0.05*verticalOffset)/(myLife),-d2/myLife,2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
                break;
            default: //from UP (1)
                if (isFilling==1) {
                    for (int i = 0; i < amount; i += 100) {
                        rad = ModMathHelper.randomRad();
                        randomHelper = 1.0 - 0.1 * Math.random();
                        myLife = baseLifeLength * randomHelper;
                        d1 = radius * Math.sin(rad);
                        d2 = radius * Math.cos(rad);
                        //LogHelper.info("(" + d1 + ", " + d2 + ")");
                        fluidOrb = new ParticleFluidOrb(world, pos.getX() + 0.5, pos.getY() + 0.95, pos.getZ() + 0.5, d1 / myLife, -(0.45 + 0.05 * verticalOffset) / (myLife), d2 / myLife, 2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
                else
                {
                    for (int i=0;i<amount;i+=100)
                    {
                        rad = ModMathHelper.randomRad();
                        randomHelper = 1.0 - 0.1*Math.random();
                        myLife = baseLifeLength*randomHelper;
                        d1 = radius*Math.sin(rad);
                        d2 = radius*Math.cos(rad);
                        fluidOrb = new ParticleFluidOrb(world,pos.getX()+0.5+d1,pos.getY()+0.5+0.05*verticalOffset,pos.getZ()+0.5+d2,-d1/myLife,(0.45+0.05*verticalOffset)/(myLife),-d2/myLife,2,(int)myLife,(float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord);
                        renderer.addEffect(fluidOrb);
                    }
                }
        }
    }
}
