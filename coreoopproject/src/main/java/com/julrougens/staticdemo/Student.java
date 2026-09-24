package com.julrougens.staticdemo;

public class Student {
    String name;
    int age;
    static String school= "CLAIM ACADEMY";
    static int counter;
    private final int id;
//    static final int =

    public Student(String name, int age) {
        counter++;
        this.name = name;
        this.age = age;
        this.school = school;
        this.id = ++counter;
    }

    void printer()
    {
        System.out.println("\nName: "+name);
        System.out.println("\nAge: "+age);
        System.out.println("\nSchool: "+school);
        System.out.println("\nCounter: "+counter);
        System.out.println("\nID: "+id);
    }

    public int getId() {
        return id;
    }
}
