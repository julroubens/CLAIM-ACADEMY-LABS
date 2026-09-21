package com.julrougens;

public class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void accelerate(int increment) {
        speed += increment;
    }

    int decelerate(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0; // Apply a penalty of 5 mph if speed goes below 0
        }
        return speed;
    }

    int getSpeed() {
        return speed;
    }

    int stop() {
        speed = 0;
        return speed;
    }

}
