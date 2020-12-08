package com.bartosz.homework.homework02122020;




import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Zad1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int id;
        String name;
        boolean finisher = true;
        HashMap<Integer, String> map = new HashMap<>();

        while (true){
            System.out.println("what would You like to do?");
            System.out.println("1 - Add position to the list.");
            System.out.println("2 - check the list");
            System.out.println("3 - exit.");
            System.out.println();
            if(scanner.nextInt() == 1) {
                System.out.println("Add id:");
                id = scanner.nextInt();
                if (map.containsKey(id)){
                    System.out.println("this key already exists, try another one.");
                    continue;
                }
                System.out.println("Add Name:");
                name = scanner.next();
                map.put(id, name);
                continue;
            }
            if (scanner.nextInt() == 2) {
                if (map.isEmpty()){
                    System.out.println("the map is empty");
                    continue;
                }
                else {
                    System.out.println(map);
                    continue;
                }
            }
            if(scanner.nextInt() == 3) {
                break;
            }


        }

        }




    }

