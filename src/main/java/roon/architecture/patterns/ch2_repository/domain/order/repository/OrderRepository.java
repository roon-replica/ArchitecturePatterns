package roon.architecture.patterns.ch2_repository.domain.order.repository;

import roon.architecture.patterns.ch2_repository.domain.order.Order;

public interface OrderRepository {
    String save(Order order);
}
