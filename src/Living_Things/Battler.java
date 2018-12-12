package Living_Things;

public abstract class Battler
{
    public int health;
    public int attack;
    public int defense;
    public String[] attacks={"",""};

    public static String showSummary()
    {
        int[] summary = {health,attack,defense};
        return ("Health: "+health+"\nAttack: "+attack+"\nDefense: "+defense);
    }
    public static int getHit(int a)
    {
        return health - a/defense;
    }
}


