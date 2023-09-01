package com.dmdev.cs.lesson18;

public class Task1 {
    public static void main(String[] args) {
        int first=50;
        int second=100;
        int result=getMax(first,second);
        int result2=Math.max(first,second);
        int cubeValue=cube(first);
        System.out.println(cubeValue+" Cube value");
    }
    public static int getMax( int value1, int value2){
        return value1>value2?value1:value2;
    }

    public static int cube(int value) {
        return (value*value*value);
    }

}
