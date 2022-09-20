package roon.architecture.patterns.ch2_repository.order.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class OrderRequest {
    private List<OrderDTO> orders;
    private String shippingAddress;
    private String orderer;
}
