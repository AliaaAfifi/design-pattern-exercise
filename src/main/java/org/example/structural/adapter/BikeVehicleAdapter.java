package org.example.structural.adapter;

public class BikeVehicleAdapter implements Vehicle {
    Bike bike;

    public BikeVehicleAdapter(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void accelerate() {
        bike.pedal();
    }

    @Override
    public void pushBreak() {
        System.out.println("Pushing break by bike");
    }

    @Override
    public void pushHorn() {
        bike.ring();
    }
}
