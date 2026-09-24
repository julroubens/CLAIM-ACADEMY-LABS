package com.julrougens.inheritance.innerpackage;

import com.julrougens.util.Utility;

public class Goat extends Animal {
    public void run() {
        Utility.print("Goat is running...");
    }

    @Override
    public void makeSound(String name) {
        super.makeSound(name);
        System.out.println("Goat! Goat!!");
    }
}
