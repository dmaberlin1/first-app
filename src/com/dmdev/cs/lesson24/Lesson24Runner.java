package com.dmdev.cs.lesson24;

public class Lesson24Runner {
    public static void main(String[] args) {
//example1();
        example2();
    }


    public static void example2(){
        int[][] values=new int[3][]; //размер второго измерения указывать необязательно
//        System.out.println(values[1]); //null
//        System.out.println(values[1].length); //error

        values[0]=new int[5];
        values[0][0]=10;
        values[0][1]=20;
        values[0][2]=30;
        values[0][3]=40;
        values[0][4]=50;
        System.out.println(values[0].length); //5
        System.out.println(values[0][0]); //5
        System.out.println(values[0][1]); //5
        System.out.println(values[0][2]); //5

    }

    public static void example1() {
        int[][] values = {
                {-1, 0},//0 index
                null, // 1 index
                {10, 20, 30, -30},//2 index
                {},//3 index
        };
        System.out.println(values.length); //4
        System.out.println(values[2].length);//4
        System.out.println(values[2][2]);//30
        System.out.println(values[3]);// address in memory
        System.out.println(values[1]); //null
    }
}

