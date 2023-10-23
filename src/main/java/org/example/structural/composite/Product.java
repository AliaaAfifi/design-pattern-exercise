package org.example.structural.composite;

public class Product implements Item {

    Double price;

    public Product(Double price) {
        this.price = price;
    }
    @Override
    public Double calculatePrice() {
        return this.price;
    }
}
