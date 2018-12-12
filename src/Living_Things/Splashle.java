package Living_Things;

public class Splashle extends Battler
{

    public Splashle(int health, int attack, int defense, String[] attacks)
    {
        super(health, attack, defense, attacks);
    }
    public String useDefend()
    {
        defense++;
        return"Splashle used defend";
    }
    public String useShellSlam()
    {
        return"Splashle used shell slam";
    }
}
