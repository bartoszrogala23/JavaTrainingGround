package com.bartosz.homework.homework02122020Zad3;

//3. Wymagania:
//        Napisz program który będzie pytać o podanie imienia,
//        dodaje imię do słownika,
//        zapyta co chcemy zrobić :
//        czy imie jest w słowniku,
//        dodac do słownika,
//        usunąć ze słownika,
//        podać liczbę imion w słowniku,
//        wypisac imiona,
//        wypisać imię i jego liczbę wystąpień
//        wyjść z programu
//        kontynuować podawanie imion
//
//        Każdą wykonaną opcję opatrz stosownym komunikatem
//
//        Pomyśl:
//        Jak wykorzystać słownik, co zrobić gdy podane imię już istnieje?
//        Jak policzyć liczbę imion w słowniku?
//
//        Podpowiedzi - użyj Scanner, pętli While, do obsługi stwórz nową klasę z metodami

import java.util.*;

public class ClientProgram {

    public static void main(String[] args) {
        List<String> clientList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String name;

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1 - Add position to the list");
            System.out.println("2 - Check the list");
            System.out.println("3 - delete from the list");
            System.out.println("4 - Exit");
            System.out.println();
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("put name:");
                name = scanner.next();
                clientList.add(name);
            }
            if (choice == 2) {
                if (clientList.isEmpty()) {
                    System.out.println("The map is empty");
                    continue;
                } else {
                    System.out.println(clientList);
                    continue;
                }
            }
            if (choice == 3) {
                System.out.println("who you want to remove from the list?");
                System.out.println(clientList);
                String deleteName = scanner.next();
                if (clientList.contains(deleteName)){
                    clientList.remove(deleteName);
                }
            }
            if (choice == 4) {
                break;
            }
            else {
                System.out.println("This option does not exist.");
            }
        }
    }
}