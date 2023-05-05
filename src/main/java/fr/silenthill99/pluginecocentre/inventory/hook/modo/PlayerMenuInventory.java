package fr.silenthill99.pluginecocentre.inventory.hook.modo;

import fr.silenthill99.pluginecocentre.inventory.AbstractInventory;
import fr.silenthill99.pluginecocentre.inventory.holder.modo.PlayerMenuHolder;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PlayerMenuInventory extends AbstractInventory<PlayerMenuHolder> {
    public PlayerMenuInventory()
    {
        super(PlayerMenuHolder.class);
    }

    @Override
    public void openInventory(Player player, Object... args)
    {
        OfflinePlayer target = (OfflinePlayer) args[0];
        PlayerMenuHolder holder = new PlayerMenuHolder(target);
        Inventory inv = createInventory(holder, 27, "Menu de " + target.getName());
        player.openInventory(inv);
    }
}
