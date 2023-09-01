package com.dmdev.cs.lesson21;

public class Task2 {

    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);
    }

    private static int sum(int value) {
        int result = 0;
        int valueFormatted = value > 0 ? value : value * -1;
        for (int currentValue = valueFormatted; currentValue > 0; currentValue /= 10) {
            int number = currentValue % 10;
            result += number;
        }
        return result;
    }

    private static int sumWhile(int value) {
        int result = 0;
        int valueFormatted = value > 0 ? value : value * -1;
        while (valueFormatted > 0) {
            result += valueFormatted % 10;
            valueFormatted /= 10;
        }
        return result;
    }
}
