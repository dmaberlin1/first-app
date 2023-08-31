package com.dmdev.cs.lesson16;

public class Task3 {
    public static void main(String[] args) {
        int hrivnaValue=88;

        //1,!!11  hrivna
        // 2,3,4 !!12-14 hrivny
        //0,5-9,11-19 hriven
        int reminder10=hrivnaValue%10;
        int reminder100=hrivnaValue%100;
        System.out.println(reminder10);
        System.out.println(reminder100);
        if(reminder10==0||(5<=reminder10 && reminder10 <=9)||(11<=reminder100 && reminder100 <=19)){
            System.out.println(hrivnaValue+" "+Hrivnas.hriven);
        }else if(2<=reminder10 && reminder10 <=4){
            System.out.println(hrivnaValue+" "+Hrivnas.hrivny);
        }else  if (reminder10==1){
            System.out.println(hrivnaValue+ " "+Hrivnas.hrivna);
        }else{
            System.out.println("hrivnas variable is invalшd: " + hrivnaValue);
        }
    }
}
