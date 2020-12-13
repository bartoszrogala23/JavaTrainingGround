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


// propozycja wyboru w formie metody - najpewniej można zrobic metode która posiada atrybuty:
// int actionNumber (u mnie liczby 1 -7), String message, String choice - scanner.next()


import java.util.*;

public class ClientProgram {

    public static void main(String[] args) {
        List<String> clientList = new ArrayList<>();
        Map<Integer, String> clientMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String name;
        int clientID = 0;

        Client client = new Client();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1 - Add position to the list");
            System.out.println("2 - Check the list");
            System.out.println("3 - Delete from the list");
            System.out.println("4 - Exit");
            System.out.println("5 - Check if name is on the list");
            System.out.println("6 - Count the name occurences");
            System.out.println();
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("put name:");
                name = scanner.next();
                clientMap.put(clientID, name);
                clientID++;

            }
            if (choice == 2) {
                if (clientMap.isEmpty()) {
                    System.out.println("The map is empty");
                    continue;
                } else {
                    System.out.println(clientMap);
                    continue;
                }
            }
            if (choice == 4) {
                break;
            }
            if (choice == 3) {
                System.out.println("who you want to remove from the list?");
                System.out.println(clientMap);
                System.out.println("type ID number of person who you'd like to remove from the list");
                int deleteName = scanner.nextInt();
                if (clientMap.containsKey(deleteName)) ;
                clientMap.remove(deleteName);
//                nie wiem jak zrobic zapis: "jeśli clientmap nie posiada Key (deleteName){
//               sout " podany klucz nie isnieje"
            }
            if (choice == 5) {
                System.out.println("put a name to verify: ");
                String verifyName = scanner.next();
                if (clientMap.containsValue(verifyName)) {
                    System.out.println(verifyName + " is on the list.");
                }
            }
            if (choice == 6) {
                System.out.println("which name occurencies you'd like to count?");
                String nameToCount = scanner.next();
                if (clientMap.containsValue(nameToCount)) {
                    Map<String, Integer> resultMap = new HashMap<String, Integer>();
                    for (int key : clientMap.keySet()) {
                        String userName = (String) clientMap.get(nameToCount);
                        if (resultMap.containsKey(userName)) {
//                            poniższy zapis znalazłem w necie
//                            https://stackoverflow.com/questions/44500446/count-occurrences-of-value-in-a-map
//                            nie do konca rozumiem ale działa.
                            resultMap.put(userName, resultMap.get(userName) + 1);
                            System.out.println(nameToCount + " is on the list.");
                            System.out.println(nameToCount + " occurencies: " + resultMap.get(userName));
                        } else {
                            resultMap.put(userName, 1);
                        }
                    }
                }
            } else {
                System.out.println("This option does not exist.");
            }

        }

    }
}
