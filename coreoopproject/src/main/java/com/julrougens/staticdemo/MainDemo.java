package com.julrougens.staticdemo;

public class MainDemo {
    static final int MAX_STUDENTS = 100;
    public static void main(String[] args) {
        Student student = new Student("Julrougens", 18);
        student.printer();
//        String school = Student.school;
//        System.out.println(school);

        Student student2 = new Student("Jean Baptiste", 28);
        student2.printer();

        Student student3 = new Student("Paul ", 21);
        student3.printer();

        for (int i = 0; i < MAX_STUDENTS; i++) {
            new Student("Leaner.." + i, 18);
        }

        Student student4 = new Student("Leaner.." + 1, 18);
        System.out.println(Student.counter);
        System.out.println(student4.getId());

    }
}
