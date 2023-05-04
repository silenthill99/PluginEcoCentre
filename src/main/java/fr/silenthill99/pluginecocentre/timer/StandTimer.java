package fr.silenthill99.pluginecocentre.timer;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class StandTimer implements Runnable {
    private final Player player;
    private final ArmorStand stand;

    public StandTimer(Player player, ArmorStand stand)
    {
        this.player = player;
        this.stand = stand;
    }

    int timer = 100;

    @Override
    public void run()
    {
        stand.teleport(player.getLocation());
        if (timer == 0)
        {
            stand.damage(stand.getHealth());
            stand.setCustomNameVisible(false);
        }
        timer--;
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public ArmorStand getArmorStand()
    {
        return this.stand;
    }
}
