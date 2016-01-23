package com.m4thg33k.m4ththings.renderers.tiles.utilities;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.model.Attributes;
import org.lwjgl.opengl.GL11;

public class SphereRenderer {

    public static void renderSphere(double x, double y, double z, double rotation, double scale, TextureAtlasSprite icon)
    {
        Tessellator tess = Tessellator.getInstance();
        WorldRenderer worldRenderer = tess.getWorldRenderer();

        GlStateManager.pushMatrix();
        GlStateManager.translate(x,y,z);
        GlStateManager.rotate((float)rotation, 0.0f, 1.0f, 0.0f);
        GlStateManager.scale(scale,scale,scale);

        worldRenderer.begin(GL11.GL_TRIANGLES, Attributes.DEFAULT_BAKED_FORMAT);

        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,0.485471,-0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.485471,-0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,0.485471,-0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431922,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,0.485471,-0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.119658,0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330578,0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,0.485471,0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.485471,0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,0.485471,0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.110549,0.485471,-0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,0.485471,-0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.485471,-0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,0.485471,-0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,0.485471,-0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.119658,0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,0.485471,0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.485471,0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,0.485471,0.11055).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.110549,0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.119658,-0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.411492,-0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,-0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.084611,-0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,-0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,-0.485471,-0.110549).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,-0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178907,-0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189946,-0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189946,0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.485471,-0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.374255,-0.331561).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.284032,-0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.060268,-0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.060268,-0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.284032,-0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.374255,-0.331562).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.442728,-0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,-0.485471,-0.110549).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,-0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,-0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,-0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,0.060268,-0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,0.284032,-0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,0.374255,-0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,0.442728,-0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,-0.485471,-0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.23445,-0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,-0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,-0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,0.060268,-0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,0.284032,-0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.23445,0.374255,-0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,0.442728,-0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,-0.485471,-0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,-0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,-0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431922,-0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,-0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,0.060268,-0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,0.284032,-0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,0.374255,-0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,0.442728,-0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.119658,-0.485471,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,-0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.411492,-0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.496355,-0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.496355,0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.411492,0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.331562,0.374255,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.232362,0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.11055,-0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,-0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,-0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,-0.060268,0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.458572,0.060268,0.189947).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330578,0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.380169,0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.306323,0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.214674,0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.084611,-0.485471,0.084611).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.234449,-0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,-0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.350976,-0.060268,0.350976).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.290969,0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.234449,0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.164305,0.442728,0.164305).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.045791,-0.485471,0.110549).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,-0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,-0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.178908,-0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,-0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.157471,0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.126883,0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.088921,0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.485471,0.119658).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.374255,0.331561).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,-0.284032,0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,-0.177302,0.467508).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,-0.060268,0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.0,0.060268,0.496355).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.284032,0.411492).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.374255,0.331561).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(0.0,0.442728,0.232362).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.045791,-0.485471,0.110549).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.126883,-0.374255,0.306323).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.178908,-0.177302,0.431921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189947,-0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.189947,0.060268,0.458572).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.157471,0.284032,0.380169).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.088921,0.442728,0.214674).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,-0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,0.350975).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.350976,0.060268,0.350975).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.330578,0.177302,0.330578).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.290969,0.284032,0.290969).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.234449,0.374255,0.234449).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.164304,0.442728,0.164304).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,0.045791).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,0.178907).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,0.189946).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.306323,0.374255,0.126883).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).tex(icon.getMinU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).tex(icon.getMaxU(),icon.getMaxV()).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).tex(icon.getMaxU(),icon.getMinV()).endVertex();

        tess.draw();

        GlStateManager.popMatrix();

    }

    public static void renderSolidColorSphere(double x, double y, double z, double rotation, double scale, Vec3 fluidColor)
    {

        Tessellator tess = Tessellator.getInstance();
        WorldRenderer worldRenderer = tess.getWorldRenderer();

        GlStateManager.pushMatrix();
        GlStateManager.translate(x,y,z);
        GlStateManager.rotate((float)rotation, 0.0f, 1.0f, 0.0f);
        GlStateManager.scale(scale,scale,scale);

        worldRenderer.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_COLOR);

        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431922,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.110549,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.110549,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.5,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.110549,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178907,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189946,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189946,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178907,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.374255,-0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.060268,-0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.177302,-0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.284032,-0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.374255,-0.331562).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.442728,-0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,-0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,-0.485471,-0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,-0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,-0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,-0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,0.060268,-0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,-0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,0.284032,-0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,0.374255,-0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,0.442728,-0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,-0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,-0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,-0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.23445,-0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,-0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,-0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,-0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,0.060268,-0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330579,0.177302,-0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,0.284032,-0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.23445,0.374255,-0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,0.442728,-0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,-0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,-0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,-0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,-0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431922,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431922,-0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,-0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,0.060268,-0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431922,0.177302,-0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,0.284032,-0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,0.374255,-0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,0.442728,-0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,-0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.496355,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.496355,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.331562,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.11055,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,-0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,-0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.458572,0.060268,0.189947).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.431921,0.177302,0.178908).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.11055,0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,-0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.350976,-0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.350976,0.060268,0.350976).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.164305,0.442728,0.164305).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,-0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,-0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,-0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.0,0.060268,0.496355).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.0,0.177302,0.467508).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.284032,0.411492).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.374255,0.331561).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(0.0,0.442728,0.232362).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(0.0,0.485471,0.119658).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.045791,-0.485471,0.110549).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,-0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.088921,-0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.126883,-0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.157471,-0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.178908,-0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189947,-0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.189947,0.060268,0.458572).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.178908,0.177302,0.431921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.157471,0.284032,0.380169).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.126883,0.374255,0.306323).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.088921,0.442728,0.214674).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.045791,0.485471,0.11055).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,-0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,-0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,-0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,-0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,-0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,-0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.350976,0.060268,0.350975).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.330578,0.177302,0.330578).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.290969,0.284032,0.290969).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.234449,0.374255,0.234449).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.164304,0.442728,0.164304).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.084611,0.485471,0.084611).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.110549,-0.485471,0.045791).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,-0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.214674,-0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.232362,-0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,-0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,-0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.380169,-0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,-0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.431921,-0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,-0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.458572,-0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.496354,-0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.496354,0.060268,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.458572,0.060268,0.189946).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.467508,0.177302,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.431921,0.177302,0.178907).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.411492,0.284032,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.380169,0.284032,0.157471).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.306323,0.374255,0.126883).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.331561,0.374255,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        worldRenderer.pos(-0.232362,0.442728,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.214674,0.442728,0.088921).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();
        worldRenderer.pos(-0.119658,0.485471,0.0).color((float)fluidColor.xCoord,(float)fluidColor.yCoord,(float)fluidColor.zCoord,1.0f).endVertex();

        tess.draw();

        GlStateManager.popMatrix();
    }
}
