package com.julrougens;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 0);
        car.accelerate(50);
        car.accelerate(20);

        System.out.println("Car Model: " + car.model + ", Car speed: " + car.speed + " mph");

        Car car2 = new Car("Honda", 0);
        car2.accelerate(30);
        car2.accelerate(20);
        System.out.println("Car2 Model: " + car2.model + ", Car2 speed: " + car2.speed + " mph");

        // System.out.println("Car speed: " + car.getSpeed());
        // System.out.println("Car2 speed: " + car2.getSpeed());

        // car.stop();
        // System.out.println("Car speed after stopping: " + car.getSpeed() + " mph");

        car.decelerate(5);
        System.out.println("Car speed after decelerating by 5: " + car.getSpeed() + " mph");
    }
}