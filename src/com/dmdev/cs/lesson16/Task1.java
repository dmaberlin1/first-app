package com.dmdev.cs.lesson16;


public class Task1 {
    public static void main(String[] args) {
        int month=8;
       Seasons season = null;
        if(month==12 || month ==1 || month==2){
            season=Seasons.Winter;
        }
        else if(month==3|| month==4||month==5){
            season=Seasons.Spring;
        }
        else if(month==6|| month==7||month==8){
            season=Seasons.Summer;
        }else if(month==9|| month==10||month==11){
            season=Seasons.Autumn;
        }
        System.out.println(season);
    }
}
