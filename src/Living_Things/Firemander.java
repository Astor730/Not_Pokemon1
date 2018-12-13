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
    public String move1()
    {
        this.attack++;
        return "Firemander used strengthen";
    }
    public int move2() {
        System.out.println("Firemander used Scale Whip");
        return this.attack;
    }

    @Override
    public String showSummary() {
        return ("Health: " +health+ "\n Attack: "+attack+"\nDefense: "+defense + "\n"+attacks);
    }

    @Override
    public int getHit(int a)
    {

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
