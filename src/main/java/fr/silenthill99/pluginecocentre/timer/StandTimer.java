package fr.silenthill99.pluginecocentre.timer;

import fr.silenthill99.pluginecocentre.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class StandTimer implements Runnable {
    private final Player player;
    private final ArmorStand stand;
    private final BukkitTask task;

    Main main = Main.getInstance();

    public StandTimer(Player player, ArmorStand stand)
    {
        this.player = player;
        this.stand = stand;
        this.task = Bukkit.getScheduler().runTaskTimer(main, this, 0, 1);
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
            task.cancel();
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
