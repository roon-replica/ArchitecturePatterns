package roon.architecture.patterns.ch2_repository.ui;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import roon.architecture.patterns.ch2_repository.application.order.OrderService;
import roon.architecture.patterns.ch2_repository.domain.order.Order;
import roon.architecture.patterns.ch2_repository.domain.order.dto.OrderRequest;
import roon.architecture.patterns.ch2_repository.domain.order.dto.OrderResponse;
import roon.architecture.patterns.ch2_repository.domain.product.Product;

import java.util.stream.Collectors;

@RequestMapping("/ch2")
@RestController
@RequiredArgsConstructor
public class OrderEndPoint {
    private final OrderService orderService;

    @PostMapping(value = "/create-order")
    public ResponseEntity<String> order(@RequestBody OrderRequest request) {
        var items = request.getOrders().stream()
                .map(order -> Product.builder()
                        .name(order.getProductName())
                        .price(order.getPrice())
                        .currencyType(order.getCurrencyType())
                        .build()
                ).collect(Collectors.toList());

        Order order = Order.createOrder(Order.generateId(), request.getOrderer(), items);

        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(order));
    }

}
