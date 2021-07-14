package com.bartosz.homework.homework02122020Zad1;

import java.util.*;

//Wymagania:
//        Napisz program, który wczytuje od użytkownika stringi w postaci klucz - wartość
//        Dodaj je do słownika.
//        Jeśli dany klucz istnieje w słowniku - nie rób nic.
//
//        Zapewnij możliwość podania kolejnych par klucz-wartość lub zaprzestawania ich podawania.
//
//        Wypisz elementy słownika na ekran w formie "klucz -> wartość"

public class Zad1_1 {

    private static void printPrompt() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Add position to the list");
        System.out.println("2 - Check the list");
        System.out.println("3 - Exit");
        System.out.println();
    }

    private static int askUserForAnInt() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
//                return konczy wykonanie danej metody i zwraca wartość.
            }
            catch (InputMismatchException e) {
                System.out.println("pls provide Integer value.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Runnable> actions = new HashMap<>();

        actions.put(1, () -> {
            System.out.println("Add ID:");
            int id = askUserForAnInt();
            if (map.containsKey(id)) {
                System.out.println("This ID already exists, try another one.");
            } else {
                System.out.println("Add Name:");
                String name = scanner.next();
                map.put(id, name);
            }
        });
        actions.put(2, () -> {
            if (map.isEmpty()) {
                System.out.println("The map is empty");
            } else {
                System.out.println(map);
            }
        });
        actions.put(3, () -> System.exit(0));

        while (true) {
            printPrompt();
            int choice = askUserForAnInt();
            actions.getOrDefault(choice,
                    () -> System.out.println("This option does not exist."))
                    .run();
        }
    }
}

