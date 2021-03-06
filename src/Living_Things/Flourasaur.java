package Living_Things;

public class Flourasaur extends Battler
{

    public Flourasaur()
    {
        super.health = 21;
        super.attack = 8;
        super.defense = 8;
        super.attacks = new String[]{"Heal","Slam"};
    }

    public String move1()
    {
        this.health = health+5;
        return "Flourasaur used heal" + "\nFlourasaur's health is now " + health;
    }
    public int move2()
    {
        System.out.println("Flourasaur used slam");
        return this.attack;
    }

    @Override
    public String showSummary() {
        return ("Health: " +health+ "\n Attack: "+attack+"\nDefense: "+defense + "\n"+attacks);
    }

    @Override
    public int getHit(int a)
    {
        int damage = (int) a/this.defense;
        return damage;
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
        return "Flourasaur";
    }
}
