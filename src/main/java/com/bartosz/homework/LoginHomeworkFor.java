package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

public class LoginHomeworkFor {

    public static void main (String[] args) {

        int login = 20907654;
        String password = "H4sło66";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Login to online banking");

        for (int attempt = -3; attempt < 0; attempt++) {
            scanner.useLocale(Locale.US);
            System.out.println("login:");
            int answer = scanner.nextInt();

            if (answer == login){
                scanner2.useLocale(Locale.US);
                System.out.println("password:");
                if (scanner2.next().equals(password)){
                    System.out.println("u are logged in.");
                    break;
                }
                else {
                    System.out.println("wrong password.");
                    attempt++;
                    System.out.println("attempts left: " + -attempt);
                }

            }
            else {
                System.out.println("this login does not exist.");
            }





        }






    }
}
