package Materials;

import Living_Things.Player;

public abstract class Material
{
    public static double Rand()
    {
        return Math.random();
    }
    public abstract void stepsOn(Player x);
    public abstract String getName();
    public abstract void stepsOff(Player x);
}
