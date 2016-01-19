package com.m4thg33k.m4ththings.Utility;

import com.m4thg33k.m4ththings.M4thThings;
import net.minecraft.util.ResourceLocation;

public class NameHelper {

    public static String blockItemName(String end)
    {
        return M4thThings.MOD_ID + "_" + end;
    }

    public static ResourceLocation newLocation(String end)
    {
        return new ResourceLocation(M4thThings.MOD_ID,end);
    }
}
