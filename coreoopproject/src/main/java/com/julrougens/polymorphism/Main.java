package com.julrougens.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.add(1, 2);
//        System.out.println(calculator.add(1, 2.8));
//        calculator.add(1, 3);
//        System.out.println(calculator.add(1.4, 2));
//
//        EmailNotification emailNotification = new EmailNotification();
//        emailNotification.send();
//
//        SMSNotification smsNotification = new SMSNotification();
//        smsNotification.send();

        Car car = new Car("RED","Toyota", "Corolla", 2000, 130);
        car.speed();
        car.printColor();
    }
}
