package com.bartosz.homework.homework02122020;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

//Wymagania:
//        Napisz program, który wczytuje od użytkownika stringi w postaci klucz - wartość
//        Dodaj je do słownika.
//        Jeśli dany klucz istnieje w słowniku - nie rób nic.
//
//        Zapewnij możliwość podania kolejnych par klucz-wartość lub zaprzestawania ich podawania.
//
//        Wypisz elementy słownika na ekran w formie "klucz -> wartość"

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int id;
        String name;
        boolean finisher = true;

        HashMap<Integer, String> map = new HashMap<>();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1 - Add position to the list");
            System.out.println("2 - Check the list");
            System.out.println("3 - Exit");
            System.out.println();
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Add ID:");
                id = scanner.nextInt();
                if (map.containsKey(id)) {
                    System.out.println("This ID already exists, try another one.");
                    continue;
                }
                System.out.println("Add Name:");
                name = scanner.next();
                map.put(id, name);
                continue;
            }
            if (choice == 2) {
                if (map.isEmpty()) {
                    System.out.println("The map is empty");
                    continue;
                } else {
                    System.out.println(map);
                    continue;
                }
            }
            if (choice == 3) {
                break;
            }
            else {
                System.out.println("This option does not exist.");
            }



        }

    }


}

