package com.dmdev.cs.lesson20;

public class Task1 {
    public static void main(String[] args) {

        for (int value = 10; value >0 ; value--) {
            System.out.println(value);
        }
        for (int value = 10; value >0 ; value--) {
            if(value==2){
                continue;
            }
            if(value==5){
                break;
            }

            System.out.println(value);
        }

    }
}
