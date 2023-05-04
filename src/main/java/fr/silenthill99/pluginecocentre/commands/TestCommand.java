package fr.silenthill99.pluginecocentre.commands;

import fr.silenthill99.pluginecocentre.inventory.InventoryManager;
import fr.silenthill99.pluginecocentre.inventory.InventoryType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            System.out.println("Cette commande ne peut être éxécutée par la console !");
            return false;
        }

        Player player = (Player) sender;

        InventoryManager.openInventory(player, InventoryType.TEST);
        player.sendMessage("essai");

        return false;
    }
}
