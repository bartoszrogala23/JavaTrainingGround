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
    public static void main (String[] args){

        int attempt = -3;
        int login = 20907654;
        String password = "H4sło66";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Login to online banking");

        while (attempt < 0) {
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
                    if (attempt == 0) {
                        System.out.println("Your online bank  account is blocked. Please contact bank branch.");
                    }
                }

            }
            else {
                System.out.println("this login does not exist.");
            }





            }
        }




    }

