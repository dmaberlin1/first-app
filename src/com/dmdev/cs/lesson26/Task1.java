package com.dmdev.cs.lesson26;
//программа печатает массив сначала в обычном порядке, затем в обратном.
public class Task1 {
    public static void main(String[] args) {
    int[] values={10,20,30,40,50};
    int[]valuesInvers=new int[values.length];
//    lowToHigh(values);
        valuesInvers=highToLow(values);
        System.out.println(valuesInvers.length);
        lowToHighForEach(valuesInvers);
    }
    private static void lowToHigh(int[] values){
        for (int i = 0; i <values.length ; i++) {
            System.out.print(values[i]+" ");
        }
    }
    public static void lowToHighForEach(int[] values){
        for (int value:values) {
            if(value==0){
                continue;
            }
            System.out.print(value +" ");
        }
        System.out.println("end of lowtoHighForEach");
    }
    private static int[] highToLow(int[]values){
        int[]temp=new int[values.length];
        System.out.println(values.length);
        for (int i = values.length-1; i>=0; i--) {
            System.out.print(values[i]+" ");
            temp[i]=values[i];
            System.out.println(temp[i]+" ");
        }
        return temp;
    }


}
