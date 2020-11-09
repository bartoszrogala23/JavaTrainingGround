package com.bartosz.homework;

import java.util.Locale;
import java.util.Scanner;

public class LoginHomeworkPractice {
    public static void main(String[] args) {

        String login = "brogala";
        String loginAnswer1 = "";
        String password = "1234";
        String passwordAnswer = "";


        Scanner scanner1 = new Scanner(System.in);
        scanner1.useLocale(Locale.US);

        for (int attempt = 3; attempt > 0; ) {
            System.out.println("login:");
            loginAnswer1 = scanner1.nextLine();
            if (loginAnswer1.equals(login)) {
                System.out.println("password :");
                passwordAnswer = scanner1.nextLine();
                if (passwordAnswer.equals(password)){
                    System.out.println("You are logged in");
                    break;
                }
                else{
                    System.out.println("wrong password");
                }

            } else {
                attempt--;
                System.out.println("Wrong login. Attempts left: " + attempt);
                if (attempt == 0) {
                    System.out.println("IP banned.");
                }
            }


        }


    }
}
