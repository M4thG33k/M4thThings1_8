package com.m4thg33k.m4ththings.renderers.tiles;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustomData;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.client.model.obj.OBJModel;

public class BaseTankRenderer extends TileEntitySpecialRenderer{

    private OBJModel tankBody;
    private ResourceLocation tankTexture;

    public BaseTankRenderer()
    {
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {

    }
}
