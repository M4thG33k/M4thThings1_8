package com.m4thg33k.m4ththings.handlers;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TextureHandler {


    @SubscribeEvent
    public void stitchTexture(TextureStitchEvent pre)
    {
        pre.map.registerSprite(new ResourceLocation("m4ththings","blocks/blockBaseTank"));
        LogHelper.info("Registered the block tank texture!");
    }
}
