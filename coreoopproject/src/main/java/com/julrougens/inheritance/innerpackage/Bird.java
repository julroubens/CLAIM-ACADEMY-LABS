package com.julrougens.inheritance.innerpackage;

import com.julrougens.inheritance.interfaces.Flyable;
import com.julrougens.inheritance.interfaces.Nest;

public class Bird extends Animal implements Flyable, Nest {

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
}
