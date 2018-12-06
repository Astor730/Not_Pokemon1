package Materials;

import Living_Things.Player;
import Living_Things.Fighter;

public class Bush
{
    Player there;
    int LocX,LocY;

    public Bush(int x, int y)
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
