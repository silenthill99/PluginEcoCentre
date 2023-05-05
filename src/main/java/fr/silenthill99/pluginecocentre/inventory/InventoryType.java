package fr.silenthill99.pluginecocentre.inventory;

import fr.silenthill99.pluginecocentre.inventory.hook.TestInventory;
import fr.silenthill99.pluginecocentre.inventory.hook.modo.PlayerChooseInventory;
import fr.silenthill99.pluginecocentre.inventory.hook.modo.PlayerMenuInventory;

public enum InventoryType
{
    PLAYER_CHOOSE(new PlayerChooseInventory()),
    PLAYER_MENU_INVENTORY(new PlayerMenuInventory()),
    TEST(new TestInventory())
    ;
    private final AbstractInventory<?> inv;

    InventoryType(AbstractInventory<?> inv)
    {
        this.inv = inv;
    }

    public AbstractInventory<?> getInv()
    {
        return this.inv;
    }
}
