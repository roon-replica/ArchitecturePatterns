package roon.architecture.patterns.ch2_repository.domain.order;

import org.springframework.data.annotation.Id;
import roon.architecture.patterns.ch2_repository.domain.product.Product;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {
    @Id
    private String id;
    private String orderer;

    @ElementCollection
    @CollectionTable(
            name = "items",
            joinColumns = @JoinColumn(name = "id")
    )
    List<Product> products;

    private Order(String id, String orderer, List<Product> products) {
        this.id = id;
        this.orderer = orderer;
        this.products = products;
    }

    public static Order createOrder(String id, String orderer, List<Product> products) {
        return new Order(id, orderer, products);
    }

    public static String generateId(){
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String of() {
        return this.id;
    }

}
