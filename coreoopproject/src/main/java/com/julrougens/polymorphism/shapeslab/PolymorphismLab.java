package com.julrougens.polymorphism.shapeslab;

interface Shape {
    double area();
}


public class PolymorphismLab {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Rectangle area: " + rectangle.area());

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
    }

}

class Rectangle implements Shape {
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double result = width * height;
        return result;
    }

}

class Circle implements Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
