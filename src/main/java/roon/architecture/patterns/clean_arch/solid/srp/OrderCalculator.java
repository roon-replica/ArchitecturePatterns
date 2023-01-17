package roon.architecture.patterns.clean_arch.solid.srp;


import java.util.Map;

public class OrderCalculator {
    public int calculateTotalCost(Order order){
        return order.orderedItems.values().stream()
                .map(item -> item.price * item.count)
                .mapToInt(x -> x).sum();
    }

    public class Order{
        Map<String, OrderItem> orderedItems;
    }

    public class OrderItem{
        String itemId;
        int price;
        int count;
    }
}
