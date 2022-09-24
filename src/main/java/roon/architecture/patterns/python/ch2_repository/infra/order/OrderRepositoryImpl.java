package roon.architecture.patterns.python.ch2_repository.infra.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import roon.architecture.patterns.python.ch2_repository.domain.order.Order;
import roon.architecture.patterns.python.ch2_repository.domain.order.repository.OrderRepository;
import roon.architecture.patterns.python.ch2_repository.infra.order.jpa.JpaOrderRepository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    private JpaOrderRepository jpaOrderRepository;

    @Override
    public String save(Order order) {
        return jpaOrderRepository.save(order).of();
    }
}
