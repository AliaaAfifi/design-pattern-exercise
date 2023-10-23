package org.example.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Item product1 = new Product(100D);
        Item product2 = new Product(200D);
        Item product3 = new Product(350D);
        Item box1 = new Box(new ArrayList<>(Arrays.asList(product1, product2)));

        Item box2 = new Box(new ArrayList<>(Arrays.asList(box1, product3)));

        System.out.println("Box2 totalPrice: " + box2.calculatePrice());

    }
}
