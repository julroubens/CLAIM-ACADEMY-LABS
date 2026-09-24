package com.julrougens.org;

public record Person(String name, int age) {
    public Person{
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }

        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age can not be negative");
        }
    }
}
