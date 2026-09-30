package com.julrougens.arrays;

public class ArrayMain implements TotalInt {

    int[] scores;
    public static void main(String[] args) {

    }

    @Override
    public int total(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;

    }

    @Override
    public void printSummary(int[] scores) {
        if (scores == null) {
            System.out.println("Scores is available");
            return;
        }

        System.out.println("");

        if (scores.length == 0) {
            System.out.println("Scores is empty");
            return;
        }

        int min = scores[0];
        int max = scores[0];
        for (int score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
        }

        System.out.println("Total: " + total(scores));
    }
}
