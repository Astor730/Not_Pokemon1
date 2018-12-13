package Spawns;

import java.util.Scanner;
import Living_Things.Battler;

public class Battle
{
    private Battler creature1;
    private Battler creature;

    public Battle(Battler creature1, Battler creature)
    {
        this.creature=creature;
        this.creature1=creature1;
    }

    public String battleStart()
    {
        while (creature.health>0&&creature1.health>0)
        {
            Scanner in = new Scanner(System.in);
            String input = "";
            int cpuAttack = 0;
            int health1 = creature.getHealth();
            int health2 = creature1.getHealth();
            int a = 0;
            System.out.println(creature.toString()+ ": " + health1);
            System.out.println(creature1.toString()+ ": "+ health2);
            System.out.println("1)"+creature.attacks[0]);
            System.out.println("2)"+creature.attacks[1]);
            input = in.nextLine();
            if(input.equalsIgnoreCase("1")|| input.equalsIgnoreCase(creature.attacks[0]))
            {
                System.out.println(creature.toString()+ " used "+creature.attacks[0]);
                creature.move1();
            }
            else if(input.equalsIgnoreCase("2)")|| input.equalsIgnoreCase(creature.attacks[1]))
            {
                a = creature.move2();
                creature1.getHit(a);
            }
            cpuAttack = (int) (Math.random()*2);
            if(cpuAttack == 0)
            {
                creature1.move1();
            }
            else if(cpuAttack==1)
            {
                creature1.move2();
            }
        }
        if (creature1.health>0)
        {
            return creature1.toString()+" Wins";
        }
        else if(creature.health>0)
        {
            return "You win";
        }
        else
        {
            return "Your Battle was a tie";
        }
    }
}
