package com.dmdev.cs.lesson16;

public class Task4 {

    //[modifiers] return_value nameVerb([param])
    public static void main(String[] args) {
        int yearInitial = 1992;
        String yearHigh="высокосный";
        String yearNotHigh="не высокосный";
        String yearConfig=isLeapYear(yearInitial) ?yearHigh :yearNotHigh;
        System.out.println(yearConfig);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0));
    }
}
