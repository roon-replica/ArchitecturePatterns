package roon.architecture.patterns.ch2_repository.ui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roon.architecture.patterns.ch2_repository.domain.order.dto.OrderRequest;
import roon.architecture.patterns.ch2_repository.domain.order.dto.OrderResponse;

@RequestMapping("/ch2")
@RestController
public class OrderEndPoint {
    @PostMapping(value = "/create-order")
    public ResponseEntity<OrderResponse> order(@RequestBody OrderRequest request) {
        var receipt = OrderResponse.builder()
                .orders(request.getOrders())
                .orderer(request.getOrderer())
                .shippingAddress(request.getShippingAddress())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(receipt);
    }

}
