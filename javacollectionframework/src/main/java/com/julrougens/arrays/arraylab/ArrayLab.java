package com.julrougens.arrays.arraylab;

public class ArrayLab {
    static int[] scores = {83, 70, 90, 66};

    public static void main(String[] args) {

    }

    public int sum()
    {

        int sum = 0;
        for (int score : scores)
        {
            sum += score;
        }
        return sum;
    }

    public double average(int[] scores)
    {
        double average = 0;
        for (int score : scores)
        {
            average += score;
        }
        return average / scores.length;
    }

    public void print()
    {
        if (sum() == 0){
            System.out.println("No scores found");
        }else {
            System.out.println("The sum is: " + sum());
        }

        if (average(scores) == 0){
            System.out.println("No scores found");
        }else  {
            System.out.println("The average is: " + average(scores));
        }
    }

}
