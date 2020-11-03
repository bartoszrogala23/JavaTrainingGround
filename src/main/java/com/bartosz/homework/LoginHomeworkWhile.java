package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

/*
korzystajac z obecnej wiedzy (logika + pętle)
stwórz program do logowania sie uzytkownika
wymagania:
1. program musi konczyc sie po okreslonej liczbie prob przez uzytkownika
2. przy blednie wpisanym hasle powinna byc wypisana pozostala liczba prob oraz ostrzezenie
3. w przypadku sukcesu powinno zostac wypisane odpowiedni komunikat
 */
public class LoginHomeworkWhile {
    public static void main(String[] args) {

        int availableAttempts = 3;
        String login = "20907654";
        String password = "H4sło66";
        String login_answer = "";
        String password_answer = "";

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        System.out.println("Login to online banking");

        while (availableAttempts > 0) {

            System.out.println("login:");
            login_answer = scanner.nextLine();

            if (login_answer.equals(login)) {
                System.out.println("password:");
                password_answer = scanner.nextLine();

                if (password_answer.equals(password)) {
                    System.out.println("You are logged in");
                    break;
                } else {
                    System.out.println("wrong password.");
                    availableAttempts-=1;
                    // to jest równe następującemu zapisowi: availableAttempts = availableAttempts -1
                    System.out.println("attempts left: " + availableAttempts);
                    if (availableAttempts == 0) {
                        System.out.println("Your online bank  account is blocked. Please contact bank branch.");
                    }
                }


            } else {
                System.out.println("wrong login, try again.");

            }


        }
    }
}









