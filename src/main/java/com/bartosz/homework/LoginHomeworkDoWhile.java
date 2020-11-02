package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

public class LoginHomeworkDoWhile {
    public static void main(String[] args) {

        int attempt = -3;
        String login = "20907654";
        String password = "H4sło66";
        String login_answer = "";
        String password_answer = "";

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Login to online banking");

        do {
            scanner.useLocale(Locale.US);
            System.out.println("login:");
            login_answer = scanner.next();

            if (login_answer.equals(login)) {
                scanner2.useLocale(Locale.US);
                System.out.println("password:");
                password_answer = scanner2.next();
            }

                if (!password_answer.equals(password)) {
                    System.out.println("wrong password.");
                    attempt++;
                    System.out.println("attempts left: " + -attempt);
                    if (attempt == 0) {
                        System.out.println("Your online bank  account is blocked. Please contact bank branch.");
                    }
                }


             else {
                System.out.println("wrong login, try again.");

            }


        } while (!password_answer.equals(password));
        {
            System.out.println("You are logged in!");

        }
    }
}

