package fr.silenthill99.pluginecocentre.inventory.holder.modo;

import fr.silenthill99.pluginecocentre.inventory.SilenthillHolder;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerChooseHolder extends SilenthillHolder
{
    public HashMap<Integer, Player> target = new HashMap<>();
}
