package com.dmdev.cs.lesson13;

public class Lesson13Runner {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int maxOfValues = value1 > value2 ? value1 : value2;
        boolean test = value1 > 0;
        if (test) {
            System.out.println(value1 + 50);
            value1 += 30;
        }
        System.out.println(value1);

    }
}
