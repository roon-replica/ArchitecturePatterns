package roon.architecture.patterns.ch2_repository.domain.order.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderDTO {
    private String productName;
    private double price;
    private String currencyType;
    private int amount;

    public Double calcPrice() {
        return this.price * amount;
    }
}
