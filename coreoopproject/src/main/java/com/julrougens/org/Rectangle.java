package com.julrougens.org;

public record Rectangle(double width, double height) {

    public double area() {
        var area = width * height;
        return area;
    }

    public double perimeter() {
        var perimeter =2 * (width + height);
        return perimeter;
    }
}
