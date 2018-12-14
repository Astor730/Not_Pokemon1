import Living_Things.Battler;
import Living_Things.Firemander;
import Living_Things.Player;
import java.util.Scanner;
import Maps.Town_1;
import Maps.Route_A;
import Living_Things.Splashle;
import Spawns.Battle;

public class Game

{
    private static Battler Splashle ;
    private static Battler Firemander;

    public static void main(String[] args)
    {
        new Battle(Firemander,Splashle);
    }
}
