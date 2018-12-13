package Living_Things;

public abstract class Battler
{
    public int health;
    public int attack;
    public int defense;
    public String[] attacks={"",""};

    public abstract String showSummary();
    public abstract int getHit(int a);
    public abstract int getHealth();
    public abstract int getAttack();
    public abstract int getDefense();
}


