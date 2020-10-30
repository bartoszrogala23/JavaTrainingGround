package com.bartosz.loops;

public class ForExample {
    public static void main(String[] args) {

//        String sentence = "I am going to be programmer";
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + ". " + sentence);
//        }

        String[] names = {"Tomasz", "Bartosz", "Adam", "Jonasz", "Jan", "Patryk", "Marcin", "Krystian"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i+1 + ". " + names[i]);
        }

        for (String name : names){
            System.out.println(name);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



    }
}
