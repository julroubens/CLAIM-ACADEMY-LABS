package com.julrougens.polymorphism.abstractdemo;

public class AbstractClassDemo {
    public static void main(String[] args) {

    }
}

abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();


}
