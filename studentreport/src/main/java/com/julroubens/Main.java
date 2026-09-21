package com.julroubens;

import java.util.Scanner;

import com.julroubens.constructor.StudentConst;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student();

        student.name = "John Doe";
        student.age = 20;
        student.studyHours = 10;
        student.address = "123 Main St";
        student.study(5);
        System.out.println("Student Number 1:" + student.introduce());

        Student student2 = new Student();
        student2.name = "Jane Smith";
        student2.age = 22;
        student2.studyHours = 15;
        student2.address = "456 Elm St";
        student2.study(10);
        System.out.println("Student Number 2:" + student2.introduce());

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter student's name: ");
        // student.name = scanner.nextLine();
        // System.out.print("Enter student's age: ");
        // student.age = scanner.nextInt();
        // System.out.print("Enter student's study hours: ");
        // student.studyHours = scanner.nextInt();
        // System.out.print("Enter student's address: ");
        // scanner.nextLine(); // Consume the newline character
        // student.address = scanner.nextLine();
        // scanner.close();
        // student.study(5);
        // System.out.println("Student Number 1:" + student.introduce());

        StudentConst studentConst = new StudentConst("Alice Johnson", 21, 12, true, "789 Oak St");
        studentConst.study(8);
        System.out.println("Student Number 3:" + studentConst.introduce());

    }

}