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
        int health1 = creature.getHealth();
        int health2 = creature1.getHealth();
        Scanner in = new Scanner(System.in);
        while (health1>0&& health2>0)
        {
            String input = "";
            int cpuAttack = 0;
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
            else if(input.equalsIgnoreCase("2")|| input.equalsIgnoreCase(creature.attacks[1]))
            {
                System.out.println(creature.toString()+" used "+creature.attacks[1]);
                a = creature.move2();
                health2 = health2 - creature1.getHit(a);
            }
            cpuAttack = (int) (Math.random()*2);
            if(cpuAttack == 0)
            {
                System.out.println(creature1.toString()+" used "+creature1.attacks[0]);
                creature1.move1();
            }
            else if(cpuAttack==1)
            {
                System.out.println(creature1.toString()+ " used "+creature1.attacks[1]);
                a = creature1.move2();
                health1 = health1 - creature.getHit(a);
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
