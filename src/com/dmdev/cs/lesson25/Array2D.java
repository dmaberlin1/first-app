package com.dmdev.cs.lesson25;

public class Array2D {


    public static void main(String[] args) {
        int[][]valuesArray={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
//            iterArray(valuesArray);
iterArrayForEach(valuesArray);
    }

        public static  void iterArray(int[][] values){
            for (int i = 0; i < values.length; i++) {
//                System.out.print(values[i]);
                for (int j = 0; j <values[i].length; j++) {
                    System.out.print(values[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static void iterArrayForEach(int[][]values){
            for (int[] array : values) {
                for (int value : array) {
                    System.out.print(value+ " ");
                }
                System.out.println();
            }

        }




}
