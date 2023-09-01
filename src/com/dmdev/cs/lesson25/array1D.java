package com.dmdev.cs.lesson25;

public class array1D {
    public static void main(String[] args) {
        int[]values={10,20,30,40,50};
        for (int i = 0; i <values.length ; i++) {
       System.out.print(values[i]+" ");
       values[i]+=100;
        }
        System.out.println();
        for (int value : values) {
            System.out.print(value+" ");

        }
    }
}
