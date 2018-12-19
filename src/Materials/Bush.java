package Materials;

import Living_Things.Player;
import Living_Things.Battler;
import Living_Things.Splashle;
import Living_Things.Flourasaur;
import Living_Things.Firemander;
import Spawns.Battle;

public class Bush extends Material
{
    Player there;
    int LocX,LocY;
    private Battler Splashle;
    private Battler Firemander;
    private Battler Flourasaur;
    private Battler wildBattler;

    public Bush(int x, int y)
    {
        LocX = x;
        LocY = y;
    }

    @Override
    public void stepsOn(Player x)
    {
        there = x;
        x.setLocX(this.LocX);
        x.setLocY(this.LocY);
        if((Rand()*10)>7)
        {
            System.out.println("A wild Battler has appeared");
            int a = (int) Rand()*2;
            if(a < 1)
            {
                wildBattler = Flourasaur;
            }
            else if (1<a&& a<2)
            {
                wildBattler = Splashle;
            }
            else if(a>2)
            {
                wildBattler = Firemander;
            }
            new Battle(Player.CreaturetoBattle(), wildBattler);
        }
        else
        {
            System.out.println("You are in a bush");
        }
    }
    @Override
    public void stepsOff(Player x)
    {
        there = null;
    }
    public String getString()
    {
        return "";
    }
    public String getName()
    {
        String name = "";
        if(there == null)
        {
            return name;
        }
        else
        {
            return "X";
        }
    }
}
