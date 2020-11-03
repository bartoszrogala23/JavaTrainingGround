package com.bartosz.login_functionality;

import java.util.Scanner;

public class LoginFunctionalityWithMethods {
   static final String EXPECTED_LOGIN = "9684351";
   static final String EXPECTED_PASSWORD = "J&asd75";

    public static void main(String[] args) {
        boolean isLoginCorrect = checkWithAttempt(5, EXPECTED_LOGIN, "podaj login");

        if (isLoginCorrect) {
            checkWithAttempt(3, EXPECTED_PASSWORD, "podaj hasło");
        } else {
            System.out.println("too many attempts, IP banned.");
        }
    }

    public static boolean checkWithAttempt(int maxNumberOfAttempts, String expectedValue, String message) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        for (int attempts = 0; attempts < maxNumberOfAttempts; attempts++) {
            System.out.println(message + " :");
            String answer = scanner.nextLine();
            if (answer.equals(expectedValue)) {
                isCorrect = true;
                break;
            }
        }
        return isCorrect;
    }
}



