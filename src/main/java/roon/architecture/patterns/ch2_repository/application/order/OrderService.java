package roon.architecture.patterns.ch2_repository.application.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roon.architecture.patterns.ch2_repository.domain.order.Order;
import roon.architecture.patterns.ch2_repository.domain.order.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public String createOrder(Order order){
        return orderRepository.save(order);
    }
}
