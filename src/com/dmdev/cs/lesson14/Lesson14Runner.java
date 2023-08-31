package com.dmdev.cs.lesson14;

public class Lesson14Runner {

    public static void main(String[] args) {
        //byte,short,int,char,String c 7 версии java,enum
        int month = 11;
        switch (month) {
            case 11:
                System.out.println("Autumn");
                break;
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Month is invalid");
        }
    }

}
