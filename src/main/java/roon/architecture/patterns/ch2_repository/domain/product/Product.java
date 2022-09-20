package roon.architecture.patterns.ch2_repository.domain.product;

import lombok.Builder;

import javax.persistence.Embeddable;

@Embeddable
public class Product {
    private String name;
    private double price;
    private String currencyType;

    @Builder
    public Product(String name, double price, String currencyType){
        this.name = name;
        this.price = price;
        this.currencyType = currencyType;
    }

    //todo: equals, hashcode 재정의 꼭 필요하려나?
}
