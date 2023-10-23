package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        showVehicle(car);

        BikeVehicleAdapter bike = new BikeVehicleAdapter(new Bike());
        showVehicle(bike);
    }

    private static void showVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.pushHorn();
    }
}
