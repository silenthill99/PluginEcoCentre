package fr.silenthill99.pluginecocentre.inventory.hook.modo;

import fr.silenthill99.pluginecocentre.ItemBuilder;
import fr.silenthill99.pluginecocentre.inventory.AbstractInventory;
import fr.silenthill99.pluginecocentre.inventory.InventoryManager;
import fr.silenthill99.pluginecocentre.inventory.InventoryType;
import fr.silenthill99.pluginecocentre.inventory.holder.modo.PlayerChooseHolder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PlayerChooseInventory extends AbstractInventory<PlayerChooseHolder>
{
    public PlayerChooseInventory()
    {
        super(PlayerChooseHolder.class);
    }

    @Override
    public void openInventory(Player player, Object... args)
    {
        PlayerChooseHolder holder = new PlayerChooseHolder();
        Inventory inv = createInventory(holder, 56, "Choix du joueur");
        int slot = 0;
        for (Player target : Bukkit.getOnlinePlayers())
        {
            holder.target.put(slot, target);
            inv.setItem(slot++, new ItemBuilder(Material.PLAYER_HEAD).setName(ChatColor.YELLOW + "Choisissez " + target.getName()).toItemStack());
        }
        player.openInventory(inv);
    }

    @Override
    public void manageInventory(InventoryClickEvent event, ItemStack current, Player player, PlayerChooseHolder holder)
    {
        OfflinePlayer target = holder.target.get(event.getSlot());
        switch (current.getType())
        {
            case PLAYER_HEAD:
                InventoryManager.openInventory(player, InventoryType.PLAYER_MENU_INVENTORY, target);
                break;
        }
    }
}
