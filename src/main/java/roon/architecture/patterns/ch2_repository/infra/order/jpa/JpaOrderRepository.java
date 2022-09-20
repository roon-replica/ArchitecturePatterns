package roon.architecture.patterns.ch2_repository.infra.order.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import roon.architecture.patterns.ch2_repository.domain.order.Order;

public interface JpaOrderRepository extends JpaRepository<Order, String> {
}
