package fr.silenthill99.pluginecocentre.listener;

import fr.silenthill99.pluginecocentre.timer.StandTimer;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class Events implements Listener
{

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onTchat(PlayerChatEvent event)
    {
        Player player = event.getPlayer();
        ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        stand.setCustomName(event.getMessage());
        stand.setCustomNameVisible(true);
        stand.setGravity(false);
        stand.setVisible(false);
        stand.setInvulnerable(true);
        new StandTimer(player, stand);
    }
}
