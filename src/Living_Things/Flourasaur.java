package Living_Things;

public class Flourasaur extends Battler
{
    public Flourasaur(int health, int attack, int defense, String[] attacks)
    {
        super(health, attack, defense, attacks);
    }

    public String useHeal()
    {
        health = health+3;
        return "Flourasaur used heal" + "\nFlourasaur's health is now " + health;
    }
    public String useSlam()
    {
        return "Flourasaur used slam";
    }
}
