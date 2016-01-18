/**
 *
 * This class is basically a rewrite of <Vaskii>'s class with the same name adapted to my environment.
 * All credit for the creation of the class goes to <Vaskii>.
 *
 */

package com.m4thg33k.m4ththings.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ClientTickHandler {

    public static int ticksInGame = 0;
    public static float partialTicks = 0;
    public static float delta = 0;
    public static float total = 0;

    private void calcDelta()
    {
        float oldTotal = total;
        total = ticksInGame + partialTicks;
        delta = total - oldTotal;
    }

    @SubscribeEvent
    public void renderTick(TickEvent.RenderTickEvent event)
    {
        if (event.phase == TickEvent.Phase.START)
        {
            partialTicks = event.renderTickTime;
        }
        else
        {
            //TooltipAdditionDisplayHandler.render();
            calcDelta();
        }
    }

    @SubscribeEvent
    public void clientTickEnd(TickEvent.ClientTickEvent event)
    {
        if (event.phase == TickEvent.Phase.END)
        {

            GuiScreen gui = Minecraft.getMinecraft().currentScreen;
            if (gui == null || !gui.doesGuiPauseGame())
            {
                ticksInGame++;
                partialTicks = 0;
            }
            calcDelta();
        }
    }
}
