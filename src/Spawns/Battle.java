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
            System.out.println(creature.toString()+ ":" + creature.getHealth());
            System.out.println(creature1.toString()+ ":"+ creature1.getHealth());
            System.out.println("1)"+creature.attacks[0]);
            System.out.println("2)"+creature.attacks[1]);
            input = in.nextLine();
            if(input.equalsIgnoreCase("1")|| input.equalsIgnoreCase(creature.attacks[0]))
            {

            }
            else if(input.equalsIgnoreCase("2)")|| input.equalsIgnoreCase(creature.attacks[1]))
            {

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
