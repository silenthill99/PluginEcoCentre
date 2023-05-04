package fr.silenthill99.pluginecocentre;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class ItemBuilder
{
    private final ItemStack is;

    public ItemBuilder(ItemStack is)
    {
        this.is = is;
    }

    public ItemBuilder(Material m, int amount)
    {
        is = new ItemStack(m, amount);
    }

    public ItemBuilder(Material m)
    {
        this(m, 1);
    }

    public ItemBuilder clone()
    {
        return new ItemBuilder(is);
    }

    public ItemBuilder setName(String name)
    {
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(name);
        is.setItemMeta(im);
        return this;
    }

    public ItemBuilder setLore(String... lore)
    {
        ItemMeta im = is.getItemMeta();
        im.setLore(Arrays.asList(lore));
        is.setItemMeta(im);
        return this;
    }

    public ItemBuilder setOwner(OfflinePlayer owner)
    {
        SkullMeta skull = (SkullMeta) is.getItemMeta();
        skull.setOwningPlayer(owner);
        is.setItemMeta(skull);
        return this;
    }

    public ItemStack toItemStack()
    {
        return is;
    }
}
