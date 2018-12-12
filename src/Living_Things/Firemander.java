package Living_Things;

public class Firemander extends Battler
{

    public Firemander(int health, int attack, int defense, String[] attacks)
    {
        super(health, attack, defense, attacks);
    }
    public String useStrengthen()
    {
        attack++;
        return "Firemander used strengthen";
    }
    public String useScaleWhip()
    {
        return "Firemander used Scale Whip";
    }
}
