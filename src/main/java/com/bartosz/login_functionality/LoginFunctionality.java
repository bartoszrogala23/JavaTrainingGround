package com.bartosz.login_functionality;

import java.util.Locale;
import java.util.Scanner;

public class LoginFunctionality {
    public static void main(String[] args) {

        String login = "9684351";
        String password = "J&asd75";
        String loginAnswer = "";
        String passwordAnswer = "";
        boolean isLoginCorrect = false;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // to jest pętla do wprowadzenia loginu

        for (int attempts = 0; attempts < 5; attempts++) {

            System.out.println("login:");
            loginAnswer = scanner.nextLine();
            if (loginAnswer.equals(login)) {
                isLoginCorrect = true;
                break;
            }
        }


        // to jest pętla do wprowadzenia hasła
        if (isLoginCorrect) {
            for (int attempts = 0; attempts < 5; attempts++) {
                System.out.println("password:");
                passwordAnswer = scanner.nextLine();
                if (passwordAnswer.equals(password)) {
                    break;
                }
            }
        } else {
            System.out.println("too many attempts, IP banned.");
        }
    }
}

