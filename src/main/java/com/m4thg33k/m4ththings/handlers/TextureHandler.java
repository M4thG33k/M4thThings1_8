package com.m4thg33k.m4ththings.handlers;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.Utility.NameHelper;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TextureHandler {

    public static TextureAtlasSprite tankOverlays;


    @SubscribeEvent
    public void stitchTexture(TextureStitchEvent.Pre pre)
    {
        LogHelper.info("Stitching misc textures to the map");
        pre.map.registerSprite(new ResourceLocation("m4ththings","blocks/blockBaseTank"));
        pre.map.registerSprite(new ResourceLocation("m4ththings","blocks/blockAdvancedTank"));

//        pre.map.registerSprite(NameHelper.newLocation("blocks/drainOverlay"));
//        pre.map.registerSprite(NameHelper.newLocation("blocks/placeOverlay"));
        tankOverlays = pre.map.registerSprite(NameHelper.newLocation("blocks/tankOverlays"));
    }
}
