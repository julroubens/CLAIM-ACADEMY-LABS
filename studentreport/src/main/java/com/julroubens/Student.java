package com.julroubens;

public class Student {
    String name;
    int age;
    int studyHours;
    boolean isGraduated;
    String address;
    int hours;

    void study(int h) {
        hours = h;
        int updated = studyHours + h;
        studyHours = updated;
    }

    String introduce() {
        return "Hello, my name is " + name + ". I am " + age + " years old. I have studied for " + studyHours
                + " hours." + " I live at " + address + "." + " I am " + (isGraduated ? "graduated." : "not graduated.")
                + " I have studied for " + hours + " hours today.";
    }
}