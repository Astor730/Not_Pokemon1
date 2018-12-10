package Living_Things;

public class Player
{
    String playerName;
    public int LocX;
    public int LocY;
    Battler[][] Party;
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
    public void addToParty()
    {

    }
}
