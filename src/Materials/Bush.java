package Materials;

import Living_Things.Player;
import Living_Things.Battler;

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
        if(Math.random()*10>5)
        {

        }
    }
    public void stepsOff(Player x)
    {
        there = null;
    }
}
