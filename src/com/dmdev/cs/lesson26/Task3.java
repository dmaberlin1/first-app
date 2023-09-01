package com.dmdev.cs.lesson26;


//метод определяет равны ли между собой соответствующие элементы 2-х мерных массивов.
public class Task3 {
    public static void main(String[] args) {
        int[][] values1={
                {10,20,30},
                {100,200,300},
                {1000,2000,3000},
        };
        int[][]values2={
                {10,20,30},
                {100,2000,300},
                {10000,2000,30000},
        };
        int[][] values10={
                {10,20,30},
                {100,200,300},
                {1000,2000,3000},
        };
        int[][]values20={
                {10,20,30},
                {100,200,300},
                {1000,2000,3000},
        };

        boolean result1=isEquals(values1,values2);
        boolean result2=isEquals(values10,values20);
        System.out.println(result1+" "+result2 );
    }

    private static boolean isEquals(int[][] values1,int[][]values2){
        if(values1.length!=values2.length){
            return false;
        }
        for(int i=0;i< values1.length;i++){
            int[]array1=values1[i];
            int[]array2=values2[i];
            if(array2.length !=array1.length){
                return false;
            }
            for (int j = 0; j <array1.length ; j++) {
                if(array2[j]!=array1[j]){
                    return false;
                }
            }
        }

        return true;
    }
}
