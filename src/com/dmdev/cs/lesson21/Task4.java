package com.dmdev.cs.lesson21;

public class Task4 {
    public static void main(String[] args) {
        int value=21;
        boolean result=isSimple(value);
        System.out.println(result);
    }

    private static boolean isSimple(int value) {
        boolean result=true;
        for (int currentValue=2;currentValue<value;currentValue++){
            if(value % currentValue==0){
                result=false;
                break;
            }

        }
        return result;
    }
}
