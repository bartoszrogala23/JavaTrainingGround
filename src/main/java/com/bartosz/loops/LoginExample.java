package com.bartosz.loops;

import java.util.Locale;
import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        String password = "Mellon";


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String answer = "" ;

        do {
            System.out.println("powiedz haslo by otworzyc brame Morii : >");

            answer = scanner.next();

            if (answer.equals(password)) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        } while(!answer.equals(password));
        System.out.println("gratulacje! :)");
    }

}
