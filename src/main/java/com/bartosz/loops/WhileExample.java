package com.bartosz.loops;

import java.util.Locale;
import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int ans1 = 1;
        int ans2 = 2;
        int ans3 = 3;

        while (true) {
            System.out.println("ile jest 1+1?");
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("State your answer:");
            int answer = scanner.nextInt();

            if (answer == ans2) {
                System.out.println("correct");
                break;
            } else {
                System.out.println("incorrect");
            }
        }
        System.out.println("gratulacje! :)");
    }

}
