package com.julrougens.inheritance.innerpackage;

public class Animal {
    private final String color = "Green";
    private int age;

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void walk() {
        System.out.println("Walking");
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

