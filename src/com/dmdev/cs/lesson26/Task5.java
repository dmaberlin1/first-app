package com.dmdev.cs.lesson26;

//определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
public class Task5 {
    public static void main(String[] args) {
        int[] values = {100, 200, 300, 0, 500, 30,20,-10};
        int[] values2 = {100, 200, 300, 0, 500, 30,20,-10,50,50,1000};
        //index 0 -  value; index 1 - index
        int[] minValueAndMinIndex=GetMinValueAndIndex(values);
        int[] maxValueAndMinIndex=GetMaxValueAndIndex(values);

        int[] minValueAndMinIndex2=GetMinValueAndIndex(values2);
        int[] maxValueAndMinIndex2=GetMaxValueAndIndex(values2);

        int sumBetweenMinMax=GetSumBetweenMinMax(values,minValueAndMinIndex[1],maxValueAndMinIndex[1]);
        int sumBetweenMinMax2=GetSumBetweenMinMax(values2,minValueAndMinIndex2[1],maxValueAndMinIndex2[1]);
        System.out.println(minValueAndMinIndex[1]);
        System.out.println(maxValueAndMinIndex[1]);
        System.out.println(sumBetweenMinMax+" sumBetweenMinMax");
        System.out.println(minValueAndMinIndex2[1]);
        System.out.println(maxValueAndMinIndex2[1]);
        System.out.println(sumBetweenMinMax2+" sumBetweenMinMax2");
    }

    private static int GetSumBetweenMinMax(int[]values,int minIndex,int maxIndex){
        int result=0;
        for (int i = 0; i <values.length ; i++) {
            if((i<minIndex && i>maxIndex) || (i >minIndex && i<maxIndex) ){
                System.out.println(values[i]);
                System.out.println(i);
                result+=values[i];
            }
        }
        return result;
    }

    private static int[] GetMaxValueAndIndex(int[] values) {
        int []maxValueAndMinIndex=new int[2];
        int maxIndex=0;
        int maxValue=0;
        for (int i = 0; i < values.length; i++) {
            if(values[maxIndex]<values[i]){
                maxIndex=i;
            }
        }
        maxValue=values[maxIndex];
        maxValueAndMinIndex[0]=maxValue;
        maxValueAndMinIndex[1]=maxIndex;
        return maxValueAndMinIndex;
    }

    private static int[] GetMinValueAndIndex(int[] values) {
        int [] minValueAndMinIndex=new int[2];
        int minIndex=0;
        int minValue=0;
        for (int i = 0; i < values.length; i++)   {
            if(values[i]<values[minIndex]){
                minIndex=i;
            }
        }
        minValue=values[minIndex];
        minValueAndMinIndex[0]=minValue;
        minValueAndMinIndex[1]=minIndex;
//        return minValue=values[minIndex];
        return minValueAndMinIndex;
    }
}
