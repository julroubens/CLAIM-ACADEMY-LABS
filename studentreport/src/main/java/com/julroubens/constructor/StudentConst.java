package com.julroubens.constructor;

public class StudentConst {
    String name;
    int age;
    int studyHours;
    boolean isGraduated;
    String address;
    int hours;

    public StudentConst(String name, int age, int studyHours, boolean isGraduated, String address) {
        this.name = name;
        this.age = age;
        this.studyHours = studyHours;
        this.isGraduated = isGraduated;
        this.address = address;
    }

    public void study(int h) {
        studyHours += h;
    }

    public String introduce() {
        return "Hello, my name is " + name + ". I am " + age + " years old. I have studied for " + studyHours
                + " hours." + " I live at " + address + "." + " I am " + (isGraduated ? "graduated." : "not graduated.")
                + " I have studied for " + hours + " hours today.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

}
