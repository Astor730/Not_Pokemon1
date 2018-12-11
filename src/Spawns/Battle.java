package Spawns;

import Living_Things.Battler;
import Living_Things.Player;

public class Battle
{
    private Player player;
    private Battler creature;

    public Battle(Player player, Battler creature)
    {
        this.creature=creature;
        this.player=player;
    }
}
