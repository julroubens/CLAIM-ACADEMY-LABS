package com.julrougens.inheritance.innerpackage;

import com.julrougens.inheritance.interfaces.Flyable;
import com.julrougens.inheritance.interfaces.Nest;
import com.julrougens.inheritance.interfaces.Runnable;

public class Bird extends Animal implements Flyable, Nest, Runnable {

    private int numberOfBirds;
    @Override
    public void fly() {
        System.out.println("The Bird is flying...");
    }


    @Override
    public void addBird() {
        numberOfBirds++;
        System.out.println("bird entered the nest. " + numberOfBirds);
    }

    @Override
    public void removeBird() {
        if (numberOfBirds > 0) {
            numberOfBirds--;
            System.out.println("A bird left the nest. "  + numberOfBirds);
        }
    }

    @Override
    public boolean hasBird() {
        return numberOfBirds > 0;
    }

    @Override
    public void run() {
        System.out.println("the bird is running...");
    }

    @Override
    public void stop() {
        System.out.println("the bird is stopping...");
    }
}
