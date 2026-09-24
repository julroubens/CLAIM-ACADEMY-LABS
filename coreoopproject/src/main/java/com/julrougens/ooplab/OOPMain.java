package com.julrougens.ooplab;

public class OOPMain {
    public static void main(String[] args) {
        CourseResult student1 = new CourseResult("Jules", 85);
        student1.printer();
        CourseResult student2 = new CourseResult("John", 90);
        student2.printer();
        CourseResult student3 = new CourseResult("Julie", 60);
        student3.printer();

    }
}
