package roon.architecture.patterns.clean_arch.solid.srp;


public class InventoryChecker {
    private InventoryDataSource inventoryDataSource;

    private void validateItemId(String itemId) {
        if (!inventoryDataSource.getInventory().containsKey(itemId)) throw new IllegalArgumentException();
    }

    public boolean hasItem(String itemId) {
        validateItemId(itemId);
        return inventoryDataSource.getInventory().get(itemId) > 0;
    }
}
