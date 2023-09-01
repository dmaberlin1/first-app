package com.dmdev.cs.lesson26;

//2 метода определяют индекс мин и макс значения одномерного массива соответственно
public class Task4 {
    public static void main(String[] args) {
        int[] values = {100, 200, 300, 0, 500, -10};
        int resultMaxIndex = getMaxIndex(values);
        int resultMinIndex = getMinIndex(values);
        System.out.println(resultMaxIndex + " Max index || " + resultMinIndex + " Min Index");
    }

    private static int getMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int getMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[maxIndex] < values[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
