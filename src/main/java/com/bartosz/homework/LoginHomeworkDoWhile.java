package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

public class LoginHomeworkDoWhile {
    public static void main(String[] args) {

        String login = "20907654";
        String password = "H4sło66";


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String answer = "" ;
        String answer2 = "" ;

        System.out.println("Login to online banking");
        do {

            System.out.println("Login: ");
            answer = scanner.next();

            if (answer.equals(login)) {
                System.out.println("password:");
                answer2 = scanner.next();
                if (!answer2.equals(password)){
                    System.out.println("incorrect password.");
                }
            } else {
                System.out.println("incorrect login.");
            }
        } while(!answer2.equals(password));{
            System.out.println("You are logged in!");

        }


    }

}

