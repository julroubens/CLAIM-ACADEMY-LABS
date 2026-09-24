package com.julrougens.inheritance.innerpackage;

public class Cat extends Animal {
    public void makeNoise() {
        System.out.println("Making noise");
    }

    public void scratches() {
        System.out.println("Scratches");
    }

    @Override
    public void makeSound(String name) {
        super.makeSound(name);
        System.out.println("Meow! Meow!!");
    }
}
