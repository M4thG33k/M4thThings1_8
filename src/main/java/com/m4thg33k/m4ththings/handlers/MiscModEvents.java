package com.m4thg33k.m4ththings.handlers;

import com.m4thg33k.m4ththings.Utility.LogHelper;
import com.m4thg33k.m4ththings.renderers.tiles.utilities.RendererHelper;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MiscModEvents {

    @SubscribeEvent
    public void makeMap(TextureStitchEvent.Post event) throws Exception
    {
        //LogHelper.info("Starting to make the map!");
        RendererHelper.postTextureStitch(event);
    }
}
