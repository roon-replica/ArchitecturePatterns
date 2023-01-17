package roon.architecture.patterns.clean_arch.solid.srp;

public class OrderFacade {
    private InventoryChecker inventoryChecker;
    private OrderValidator orderValidator;
    private OrderCalculator orderCalculator;

    public boolean hasItem(String itemId) {
        return inventoryChecker.hasItem(itemId);
    }

    public void validateShippingAddress(String address) {
        orderValidator.validateShippingAddress(address);
    }

    public int calculateTotalCost(OrderCalculator.Order order){
        return orderCalculator.calculateTotalCost(order);
    }


}
