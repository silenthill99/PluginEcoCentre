package fr.silenthill99.pluginecocentre;

import fr.silenthill99.pluginecocentre.commands.TestCommand;
import fr.silenthill99.pluginecocentre.inventory.InventoryManager;
import fr.silenthill99.pluginecocentre.listener.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin
{
    private static Main instance;

    public static Main getInstance()
    {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("Le plugin est opérationnel !");
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryManager(), this);
        pm.registerEvents(new Events(), this);
        getCommand("menu").setExecutor(new MenuCommand());
        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
