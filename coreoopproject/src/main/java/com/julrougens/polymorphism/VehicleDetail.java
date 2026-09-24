package com.julrougens.polymorphism;

public class VehicleDetail extends Vehicle {
    String color;
    String make;
    String model;
    int year;
    int maxSpeed;

    public VehicleDetail(String color, String brand, String model, int year, int maxSpeed) {
        this.color = color;
        this.make = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void speed() {
        super.speed();
        System.out.println(make + " " + model + " " + year+ " " + color +" Can go up to "+ maxSpeed +" mph");
    }

    void printColor() {
        System.out.println("This Is a "+color + " " +make);
    }
    void printModel() {
        System.out.println(make + " Is a " +model);
    }

}
