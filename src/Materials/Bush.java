package Materials;

import Living_Things.Player;
import Living_Things.Battler;
import Living_Things.Splashle;
import Spawns.Battle;

public class Bush extends Material
{
    Player there;
    int LocX,LocY;
    private Battler Splashle;

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
            new Battle(Player.CreaturetoBattle(), Splashle);
        }
    }
    public void stepsOff(Player x)
    {
        there = null;
    }
}
