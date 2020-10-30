package com.bartosz.loops;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        int ans1 = 1;
        int ans2 = 2;
        int ans3 = 3;

        System.out.println("ile jest 1+1?");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int answer = 0 ;

        do {
            System.out.println("State your answer:");
             answer = scanner.nextInt();

            if (answer == ans2) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        } while(answer != ans2);
        System.out.println("gratulacje! :)");
    }

}
