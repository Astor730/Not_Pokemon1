import Living_Things.*;

import java.util.Scanner;
import Maps.Town_1;
import Maps.Route_A;
import Materials.Gravel;
import Materials.Material;
import Materials.Bush;
import Spawns.Battle;
import Living_Things.Player;

public class Game
{
    private static boolean gameOn = true;
    static boolean inTown1 = true;
    static boolean inRouteA = false;
    private static Battler Flourasaur;
    private static Battler Firemander;
    private static Battler Splashle;

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Hello, hello, is this thing on?.\nYou should be able to hear me.");
        System.out.println("Listen I don't have much time but you need to get up.");
        System.out.println("Do you remember your name? Tell me your name so I can make sure.");
        String name = in.nextLine();
        System.out.println("Ok good, "+name+"."+"\nThere should be three battlers near you, find them and start moving.");
        System.out.println("Make your way south.\nHurry, I'll explain everything when you get here.");
        Player player1 = new Player(name,0,0);
        player1.inizializeParty();

        Material[][] map1= new Material[15][30];
        Town_1 town1 = new Town_1(map1);
        town1.makeMap();
        map1[0][0].stepsOn(player1);
        Material[][] map2=new Material[15][30];
        Route_A route_a = new Route_A(map2);
        route_a.makeRoute();
        while (gameOn)
        {
            town1.print();
            System.out.println("Where would you like to move?(Choose N,S,E,W)");
            String move = in.nextLine();
            if (inTown1)
            {
                if(validMove(move,player1,map1))
                {
                    town1.print();
                    if(player1.Party.length<2)
                    {
                        if(player1.getLocY()>12&&player1.getLocY()<18&&player1.getLocX()>8&& player1.getLocX()<12)
                        {
                            System.out.println("You've stumbled across the Battlers that the mystery man was talking about");
                            System.out.println("Would you like the flower dinosaur, 1)Flourasaur,");
                            System.out.println("The flame salamander, 2)Firemander, or the water turtle, 3)Splashle?");
                            while(player1.Party.length<2) {
                                move = in.nextLine();
                                if (move.equalsIgnoreCase("flourasaur") || move.equalsIgnoreCase("1")) {
                                    player1.addToParty(Flourasaur);
                                } else if (move.equalsIgnoreCase("firemander") || move.equalsIgnoreCase("2")) {
                                    player1.addToParty(Firemander);
                                } else if (move.equalsIgnoreCase("splashle") || move.equalsIgnoreCase("3")) {
                                    player1.addToParty(Splashle);
                                } else {
                                    System.out.println("That's not a choice, try again");
                                }
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("That's not a valid move try again");
                }
            }

            if (inRouteA== true)
            {
                if(validMove(move,player1,map2)) {
                    route_a.print();
                }
                else
                {
                    System.out.println("That's not a valid move try again.");
                }
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
                else if(p.getLocX() > 0 == false&& inRouteA)
                {
                    inRouteA = false;
                    inTown1 = true;
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
                else if((p.getLocX() < map.length - 1) == false && inTown1)
                {
                    inTown1 = false;
                    inRouteA = true;
                    return false;
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
