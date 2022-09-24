package roon.architecture.patterns.python.ch2_repository.domain.order.dto;

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
