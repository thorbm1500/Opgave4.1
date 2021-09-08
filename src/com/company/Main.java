package com.company;
public class Main {

    public static void printAmerican(){
        String day = "Wednesday";
        String month = "September";
        String date = "08";
        int year = 2021;
        System.out.println(day+", "+month+" "+date+", "+year);

    }

    public static void printEuropean(){
        String day = "Wednesday";
        String month = "September";
        String date = "08";
        int year = 2021;
        System.out.println(day+" "+date+" "+month+" "+year);

    }

    public static void main(String[] args) {
        printAmerican();
        printEuropean();

    }
}