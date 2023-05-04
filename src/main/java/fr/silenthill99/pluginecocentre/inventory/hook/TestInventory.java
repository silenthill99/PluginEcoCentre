package fr.silenthill99.pluginecocentre.inventory.hook;

import fr.silenthill99.pluginecocentre.inventory.AbstractInventory;
import fr.silenthill99.pluginecocentre.inventory.holder.TestHolder;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TestInventory extends AbstractInventory<TestHolder>
{

    public TestInventory() {
        super(TestHolder.class);
    }

    @Override
    public void openInventory(Player player, Object... args)
    {
        TestHolder holder = new TestHolder();
        Inventory inv = createInventory(holder, 9, "Test");
        inv.setItem(0, AbstractInventory.RETOUR);
        inv.setItem(8, AbstractInventory.CLOSE);
        player.openInventory(inv);
    }
}
