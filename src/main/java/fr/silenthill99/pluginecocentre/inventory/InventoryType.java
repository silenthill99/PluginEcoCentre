package fr.silenthill99.pluginecocentre.inventory;

import fr.silenthill99.pluginecocentre.inventory.hook.TestInventory;

public enum InventoryType
{
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
