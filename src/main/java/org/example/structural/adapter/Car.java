package org.example.structural.adapter;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Accelerating car");
    }

    @Override
    public void pushBreak() {
        System.out.println("Stopping car");
    }

    @Override
    public void pushHorn() {
        System.out.println("beep beep...");
    }
}
