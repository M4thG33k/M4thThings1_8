package com.m4thg33k.m4ththings.particles;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class ParticleFluidOrb extends EntityFX {

    public static final int MAX_AGE = 10;
    public static final int MAX_SCALE = 10;

    protected ParticleFluidOrb(World world, double posX, double posY, double posZ)
    {
        this(world, posX, posY, posZ, 0.0, 0.0, 0.0, MAX_SCALE, MAX_AGE, 0.0f, 0.3f, 0.8f);
    }

    public ParticleFluidOrb(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float RED, float GREEN, float BLUE)
    {
        this(world, posX, posY, posZ, motionX, motionY, motionZ, MAX_SCALE, MAX_AGE, RED, GREEN, BLUE);
    }

    public ParticleFluidOrb(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ, float scale, int maxAge, float red, float green, float blue)
    {
        super(world, posX, posY, posZ, 0, 0, 0);
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        this.particleTextureIndexX = 4;
        this.particleTextureIndexY = 2;
        this.particleRed = red;
        this.particleGreen = green;
        this.particleBlue = blue;
        this.particleScale = scale;
        this.particleMaxAge = Math.min(maxAge,MAX_AGE);
        this.noClip = true;
        this.particleGravity = 0.05f;
        this.particleAlpha = 0.9f;

        this.particleScale = Math.min(0.1f * scale,MAX_SCALE);
    }

    @Override
    public void onUpdate() {
        if (this.particleAge++ >= this.particleMaxAge)
        {
            this.setDead();
        }

        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        this.moveEntity(this.motionX,this.motionY,this.motionZ);

        //this.particleScale = MAX_SCALE*(this.particleAge%3);
        //this.particleAlpha -= 0.05f / (MAX_AGE*1.25f);
    }

//    @Override
//    public void renderParticle(WorldRenderer worldRendererIn, Entity entityIn, float partialTicks, float p_180434_4_, float p_180434_5_, float p_180434_6_, float p_180434_7_, float p_180434_8_) {
//        super.renderParticle(worldRendererIn, entityIn, partialTicks, p_180434_4_, p_180434_5_, p_180434_6_, p_180434_7_, p_180434_8_);
//    }

    @Override
    public void renderParticle(WorldRenderer worldRendererIn, Entity entityIn, float partialTicks, float p_180434_4_, float p_180434_5_, float p_180434_6_, float p_180434_7_, float p_180434_8_)
    {
        float f = (float)this.particleTextureIndexX / 16.0F;
        float f1 = f + 0.25f;//0.0624375F;
        float f2 = (float)this.particleTextureIndexY / 16.0F;
        float f3 = f2 + 0.25f;//0.0624375F;
        float f4 = 0.1F * this.particleScale;

        if (this.particleIcon != null)
        {
            f = this.particleIcon.getMinU();
            f1 = this.particleIcon.getMaxU();
            f2 = this.particleIcon.getMinV();
            f3 = this.particleIcon.getMaxV();
        }

        float f5 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)partialTicks - interpPosX);
        float f6 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)partialTicks - interpPosY);
        float f7 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)partialTicks - interpPosZ);
        int i = this.getBrightnessForRender(partialTicks);
        int j = i >> 16 & 65535;
        int k = i & 65535;
        worldRendererIn.pos((double)(f5 - p_180434_4_ * f4 - p_180434_7_ * f4), (double)(f6 - p_180434_5_ * f4), (double)(f7 - p_180434_6_ * f4 - p_180434_8_ * f4)).tex((double)f1, (double)f3).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,k).endVertex();
        worldRendererIn.pos((double)(f5 - p_180434_4_ * f4 + p_180434_7_ * f4), (double)(f6 + p_180434_5_ * f4), (double)(f7 - p_180434_6_ * f4 + p_180434_8_ * f4)).tex((double)f1, (double)f2).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,k).endVertex();
        worldRendererIn.pos((double)(f5 + p_180434_4_ * f4 + p_180434_7_ * f4), (double)(f6 + p_180434_5_ * f4), (double)(f7 + p_180434_6_ * f4 + p_180434_8_ * f4)).tex((double)f, (double)f2).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,k).endVertex();
        worldRendererIn.pos((double)(f5 + p_180434_4_ * f4 - p_180434_7_ * f4), (double)(f6 - p_180434_5_ * f4), (double)(f7 + p_180434_6_ * f4 - p_180434_8_ * f4)).tex((double)f, (double)f3).color(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha).lightmap(j,k).endVertex();
    }

//    @Override
//    public void renderParticle(WorldRenderer worldRenderer, Entity entity, float posX, float posY, float posZ, float par5, float par6, float par7) {
//        super.renderParticle(worldRenderer, entity, posX, posY, posZ, par5, par6, par7);
//
////        float uMin = (float)this.particleTextureIndexX / 16.0F;
////        float uMax = uMin + 0.25f;
////        float vMin = (float)this.particleTextureIndexY / 16.0F;
////        float vMax = vMin + 0.25f;
////        float f10 = 0.1F * this.particleScale;
////
////        if (this.particleIcon != null)
////        {
////            //LogHelper.info("We have a particle!");
////            uMin = this.particleIcon.getMinU();
////            //umax = umin+1;
////            uMax = this.particleIcon.getMaxU();
////            vMin = this.particleIcon.getMinV();
////            //vmax = vmin+1;
////            vMax = this.particleIcon.getMaxV();
////        }
////
////        //LogHelper.info("UV: (" + umin + ", " + umax + ", " + vmin + ", " + vmax + ")");
////
////        //par5 = 0;
////        float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)posX - interpPosX);
////        float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)posX - interpPosY);
////        float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)posX - interpPosZ);
//////        tess.setColorRGBA_F(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha);
////        //worldRenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);
////        //worldRenderer.color(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha);
////        //LogHelper.info(StringHelper.coordinates(this.particleRed,this.particleGreen, this.particleBlue));
////        worldRenderer.pos(f11 - posY * f10 - par6 * f10, f12 - posZ * f10, f13 - par5 * f10 - par7 * f10).tex(uMax, vMax).color(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha).endVertex();
////        worldRenderer.pos(f11 - posY * f10 + par6 * f10, f12 + posZ * f10, f13 - par5 * f10 + par7 * f10).tex(uMax, vMax).color(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha).endVertex();
////        worldRenderer.pos(f11 + posY * f10 + par6 * f10, f12 + posZ * f10, f13 + par5 * f10 + par7 * f10).tex( uMin, vMin).color(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha).endVertex();
////        worldRenderer.pos(f11 + posY * f10 - par6 * f10, f12 - posZ * f10, f13 + par5 * f10 - par7 * f10).tex(uMin, vMax).color(this.particleRed,this.particleGreen,this.particleBlue,this.particleAlpha).endVertex();
//////        tess.addVertexWithUV(f11 - posY * f10 - par6 * f10, f12 - posZ * f10, f13 - par5 * f10 - par7 * f10, uMax, vMax);
//////        tess.addVertexWithUV(f11 - posY * f10 + par6 * f10, f12 + posZ * f10, f13 - par5 * f10 + par7 * f10, uMax, vMin);
//////        tess.addVertexWithUV(f11 + posY * f10 + par6 * f10, f12 + posZ * f10, f13 + par5 * f10 + par7 * f10, uMin, vMin);
//////        tess.addVertexWithUV(f11 + posY * f10 - par6 * f10, f12 - posZ * f10, f13 + par5 * f10 - par7 * f10, uMin, vMax);
//
//    }
}
