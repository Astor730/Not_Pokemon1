package Living_Things;

public class Splashle extends Battler
{

    public Splashle()
    {
        this.health = 20;
        this.attack = 7;
        this.defense = 9;
        this.attacks = new String[]{"Defend", "ShellSlam"};
    }

    public String useDefend()
    {
        this.defense++;
        return"Splashle used defend";
    }
    public String useShellSlam()
    {
        return"Splashle used shell slam";
    }

    @Override
    public String showSummary() {
        return ("Health: " +health+ "\n Attack: "+attack+"\nDefense: "+defense + "\n"+attacks);
    }

    @Override
    public int getHit(int a) {
        return 0;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String toString()
    {
        return "Splashle";
    }
}