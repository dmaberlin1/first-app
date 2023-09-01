package com.dmdev.cs.lesson26;

//программа заносящая в массив первые 100 целых чисел
//  дялящихся на 13 или на 17, и печатающего её
public class Task2 {
    public static void main(String[] args) {
        int arrayLength=100;
        int[]values=new int[arrayLength];
        Task1.lowToHighForEach(values);
        System.out.println();
        fillArray(values);

    }

    private static void fillArray(int[] values) {
        // if 13 print & break
        // if 17 print & break
        int currentIndex=0;
        for(int currentValue=1;currentIndex<values.length;currentValue++){
            if(currentValue%13==0|| currentValue%17==0){
                values[currentIndex]=currentValue;
                currentIndex++;
            }
        }
    }
    private static void fillArrayModify(int[] values){
//        int currentIndex=0;
        for(int currentValue=1,currentIndex=0;currentIndex<values.length;currentValue++){
            if(currentValue%13==0||currentValue%17==0){
                values[currentIndex++]=currentValue;
            }
        }


    }
}
