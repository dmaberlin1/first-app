package com.dmdev.cs.lesson22;

//lesson22.Lesson22Example


public class Lesson22Example {
    public static void main(String[] args) {
        int value=5; //120=1*2*3*4*5=5!
        int result=factorialRecourse(value);
    }

    private static int factorialRecourse(int value) {
        if(value==1){
            return 1;
        }
        // 5*(4*(3*2(*1)))
        return value*factorialRecourse(value-1);
    }
}
