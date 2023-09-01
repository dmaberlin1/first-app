package com.dmdev.cs.lesson21;

public class Task3 {
    public static void main(String[] args) {
        int startYear = 1626;
        int endYear = 2023;
        double sum = 24;
        double percent = 0.05;

        double result = calculate(startYear, sum, percent, endYear);
        System.out.println(result);
    }

    private static double calculate(int startYear, double sum, double percent, int endYear) {
        double result = sum;

        for (int currentYear = startYear + 1; currentYear < endYear; currentYear++) {
            result+=result*percent;
            System.out.println(currentYear + " : " + result);
        }
        return result;
    }


}
