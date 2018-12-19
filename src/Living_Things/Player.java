package Living_Things;

import Living_Things.Battler;
import Living_Things.Firemander;

public class Player
{
    private String playerName;
    public int LocX;
    public int LocY;
    public static Battler[] Party = {null};
    private Battler Firemander;

    public Player(String playerName, int LocX, int LocY)
    {
        this.playerName = playerName;
        this.LocX = LocX;
        this.LocY = LocY;
    }
    public String getName()
    {
        return playerName;
    }
    public int getLocX()
    {
        return LocX;
    }
    public int getLocY()
    {
        return LocY;
    }
    public void setLocX(int x)
    {
        this.LocX = x;
    }
    public void setLocY(int y)
    {
        this.LocY = y;
    }
    public void inizializeParty()
    {
        Party [0] = Firemander;
    }
    public String addToParty(Battler toAdd)
    {
        if (Party.length<6)
        {
            Party[0] = toAdd;
            return toAdd.toString() + "Was added to your party";
        }
        else{return "Your party is full";}
    }
    public static Battler CreaturetoBattle()
    {
        return Party[0];
    }
}
