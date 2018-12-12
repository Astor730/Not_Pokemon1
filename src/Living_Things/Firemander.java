package Living_Things;

public class Firemander extends Battler
{

    public Firemander()
    {
        super.health = 19;
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
