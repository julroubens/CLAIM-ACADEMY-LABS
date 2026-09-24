package com.julrougens.ooplab;

public class CourseResult {
    String studentName;
    int score;
    static int passingScore = 70;

    public CourseResult(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public boolean hasPassed() {
        return passingScore >= score;
    }

    public void printer()
    {
        if (hasPassed()){
            System.out.println("Faill...");
        }else  {
            System.out.println("Passed...");
        }
    }

}
