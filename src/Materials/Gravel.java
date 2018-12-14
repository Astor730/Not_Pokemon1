package Materials;

import Living_Things.Player;

public class Gravel extends Material
{
    Player there;
    int LocX,LocY;

    public Gravel(int x, int y)
    {
        LocX = x;
        LocY = y;
    }

    public void stepsOn(Player x)
    {
        there = x;
        x.setLocX(this.LocX);
        x.setLocY(this.LocY);
    }
    public void stepsOff(Player x)
    {
        there = null;
    }
}
