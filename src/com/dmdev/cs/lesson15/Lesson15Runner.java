package com.dmdev.cs.lesson15;

public class Lesson15Runner {
    public static void main(String[] args) {
        //вариант switch после 14 версии java
        int month=1;

        //c  java 10 можно не указывать тип данных, если он потянет по правой части
        //если вар не улучшает читабельность кода, его лучше не использовать
        var monthsLength=12;

        String result= switch (month){
            case 12,1,2 -> "Winter";
            case 3,4,5-> "Spring";
            case 6,7,8-> "Summer";
            case 9,10,11-> "Autumn";
            default -> "Month is invalid";
        };
        System.out.println(result);
    }
}
