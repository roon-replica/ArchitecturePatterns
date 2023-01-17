package roon.architecture.patterns.clean_arch.solid.non_srp;

import org.springframework.util.ObjectUtils;

import java.util.Map;

public class OrderProcessor {
    private Map<String, Integer> inventory = Map.of("id1", 10, "id2", 20);

    public void validateShippingAddress(String address) {
        if (ObjectUtils.isEmpty(address)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateItemId(String itemId) {
        if (!inventory.containsKey(itemId)) throw new IllegalArgumentException();
    }

    public boolean hasItem(String itemId) {
        validateItemId(itemId);
        return inventory.get(itemId) > 0;
    }

    public int calculateTotalCost(Order order){
        return order.orderedItems.values().stream()
                .map(item -> item.price * item.count)
                .mapToInt(x -> x).sum();
    }

    private class Order{
        Map<String, OrderItem> orderedItems;
    }

    private class OrderItem{
        String itemId;
        int price;
        int count;
    }
}
