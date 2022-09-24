package roon.architecture.patterns.python.ch2_repository.domain.order.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
public class OrderResponse {
    private List<OrderDTO> orders;
    private String shippingAddress;
    private String orderer;
    private double totalPrice;

    @Builder
    public OrderResponse(List<OrderDTO> orders, String orderer, String shippingAddress) {
        this.orders = orders;
        this.orderer = orderer;
        this.shippingAddress = shippingAddress;
        this.totalPrice = calcTotalPrice();
    }

    private double calcTotalPrice() {
        return orders.stream()
                .mapToDouble(OrderDTO::calcPrice)
                .sum();
    }
}
