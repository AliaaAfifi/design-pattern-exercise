package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    List<Item> items;

    public Box() {
        items = new ArrayList<>();
    }

    public Box(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    @Override
    public Double calculatePrice() {
        Double totalPrice = 0D;
        for (int i = 0; i < items.size(); i++)
            totalPrice += items.get(i).calculatePrice();
        return totalPrice;
    }

}
