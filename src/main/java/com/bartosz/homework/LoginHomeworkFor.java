package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

public class LoginHomeworkFor {

    public static void main(String[] args) {


        String login = "20907654";
        String password = "H4sło66";
        String login_answer = "";
        String password_answer = "";
        boolean isLoginCorrect = false;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        System.out.println("Login to online banking");

        for (int attempt = 0; attempt < 5; attempt++ ) {
            System.out.println("login:");
            login_answer = scanner.next();
            if (login_answer.equals(login)) {
                isLoginCorrect = true;
                break;
            }
        }

        if (isLoginCorrect) {
            for (int attempt2 = 0; attempt2 < 3; ) {
                System.out.println("password:");
                password_answer = scanner.next();
                if (password_answer.equals(password)) {
                    System.out.println("You are logged in.");
                    break;
                } else {
                    attempt2++;
                    System.out.println("wrong password, attempts left: " + attempt2);
                }
            }
            ;
        }


//                System.out.println("password:");
//                password_answer = scanner2.next();

//                if (isLoginCorrect) {
//                    System.out.println("You are logged in");
//                    break;
//                } else {
//                    attempt--;
//                    System.out.println("wrong password.");
//                    System.out.println("attempts left: " + attempt);
//                    if (attempt == 0) {
//                        System.out.println("Your online bank  account is blocked. Please contact bank branch.");
//                    }
//                }


    }
}
