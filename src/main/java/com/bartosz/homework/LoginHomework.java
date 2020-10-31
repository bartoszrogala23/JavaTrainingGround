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
public class LoginHomework {
    public static void main (String[] args){

        int attempt = 0;
        int login = 20907654;
        String password = "H4sło66";
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Login to online banking");

        while (attempt < 3) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("login:");
            int answer = scanner.nextInt();
            attempt++;

            if (answer == login){
                scanner2.useLocale(Locale.US);
                System.out.println("password:");
                if (scanner2.next().equals(password)){
                    System.out.println("u are logged in:");
                    break;
                }



            }
            else if (answer != login) {
                System.out.println("Wrong login. Verify Your login and try again.");
            }




            }
        }




    }

