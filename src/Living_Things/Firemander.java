package Living_Things;

public class Firemander extends Battler
{

    public Firemander()
    {

        super.health = 19;
        super.attack = 9;
        super.defense = 7;
        super.attacks = new String[]{"Strengthen", "ScaleWhip"};
    }
    public String useStrengthen()
    {
        this.attack++;
        return "Firemander used strengthen";
    }
    public String useScaleWhip()
    {
        return "Firemander used Scale Whip";
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
        return "Firemander";
    }
}
