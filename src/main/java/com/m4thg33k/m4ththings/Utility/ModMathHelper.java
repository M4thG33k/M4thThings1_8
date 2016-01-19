package com.m4thg33k.m4ththings.Utility;

import java.util.Random;

public class ModMathHelper {

    public static Random rand = new Random();
    public static double pi = 3.14159263538979;

    public static int randomAngle()
    {
        return rand.nextInt(360);
    }

    public static double randomRad()
    {
        return ((double)randomAngle()) * (pi/180.0);
    }
}
