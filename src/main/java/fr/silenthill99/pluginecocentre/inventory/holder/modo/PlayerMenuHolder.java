package fr.silenthill99.pluginecocentre.inventory.holder.modo;

import fr.silenthill99.pluginecocentre.inventory.SilenthillHolder;
import org.bukkit.OfflinePlayer;

public class PlayerMenuHolder extends SilenthillHolder
{
    private final OfflinePlayer target;

    public PlayerMenuHolder(OfflinePlayer target)
    {
        this.target = target;
    }

    public OfflinePlayer getTarget()
    {
        return this.target;
    }
}
