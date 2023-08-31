package com.dmdev.cs.lesson16;

public class Task2 {
    public static void main(String[] args) {
        int value=113533;
        int reminder=value%10;
        boolean test = reminder==3 || reminder== -3;
        if(test){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
