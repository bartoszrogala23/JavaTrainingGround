package com.bartosz.logika;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class LogicFlowExample {
    public static void main(String[] args) {

        boolean flagTrue = true;
        boolean flagFalse = false;

        if (flagTrue == true){
            System.out.println("My flag true is true.");
        }
        if (flagFalse == false){
            System.out.println("My flag false is false.");
        }
        if (flagTrue == false){
            System.out.println("My flag true is false.");
            System.out.println("but this should never print");
        }
        if (flagFalse == true){
            System.out.println("My flag false is true.");
            System.out.println("but this should never print");
        }


        if (flagTrue){
            System.out.println("I'm learning java programming.");
        } else {
            System.out.println("i'm lazy.");
        }

        if (flagFalse){
            System.out.println("I don't want to learn");
        } else {
            System.out.println("i'm gonna keep coding.");
        }


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("State your income:");
        int income = scanner.nextInt();



        if (income <= 1000){
            System.out.println("u can get up to 25 000 PLN");
        } else if (income > 6000){
            System.out.println("u can get more than 125 000 PLN");
        } else {
            System.out.println("u can get from 32 000 PLN to 100 000 PLN");
        }
    }

}
