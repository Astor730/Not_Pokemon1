import Living_Things.Battler;
import Living_Things.Firemander;
import Living_Things.Player;
import java.util.Scanner;
import Maps.Town_1;
import Maps.Route_A;
import Living_Things.Splashle;
import Materials.Gravel;
import Materials.Material;
import Materials.Bush;
import Spawns.Battle;

public class Game
{
    private static boolean gameOn = true;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, hello, is this thing on?.\nYou should be able to hear me.");
        System.out.println("Listen I don't have much time but you need to get up.");
        System.out.println("Do you remember your name? Tell me your name so I can make sure.");
        String name = in.nextLine();
        System.out.println("Ok good.\nThere should be three battlers near you, find them and start moving.");
        System.out.println("Make your way south.\n Hurry, I'll explain everything when you get here.");
        Player player1 = new Player(name,0,0);

        Material[][] map1= new Material[15][30];
        Town_1 town1 = new Town_1(map1);
        town1.makeMap(15,30);
        map1[0][0].stepsOn(player1);
        Material[][] map2=new Material[0][0];
        Route_A route_a = new Route_A(map2);
        route_a.makeRoute();
        while (gameOn)
        {
            town1.print();
            System.out.println("Where would you like to move?(Choose N,S,E,W)");
            String move = in.nextLine();
            if (validMove(move,player1,map1))
            {

            }
        }
    }
    public static boolean validMove(String move, Player p, Material[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getLocX() > 0)
                {
                    map[p.getLocX()][p.getLocY()].stepsOff(p);
                    map[p.getLocX()-1][p.getLocY()].stepsOn(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getLocY()< map[p.getLocY()].length -1)
                {
                    map[p.getLocX()][p.getLocY()].stepsOff(p);
                    map[p.getLocX()][p.getLocY() + 1].stepsOn(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getLocX() < map.length - 1)
                {
                    map[p.getLocX()][p.getLocY()].stepsOff(p);
                    map[p.getLocX()+1][p.getLocY()].stepsOn(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getLocY() > 0)
                {
                    map[p.getLocX()][p.getLocY()].stepsOff(p);
                    map[p.getLocX()][p.getLocY()-1].stepsOn(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff(){gameOn = false;}
}
