package Living_Things;

public class Battler
{
    public int health;
    public int attack;
    public int defense;
    public String[] attacks;

    public Battler(int health, int attack, int defense, String[] attacks)
    {
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.attacks=attacks;
    }

    public String showSummary()
    {
        int[] summary = {health,attack,defense};
        return ("Health: "+health+"\nAttack: "+attack+"\nDefense: "+defense);
    }
    public int getHit(int a)
    {
        return health - a/defense;
    }
}


