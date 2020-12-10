package com.bartosz.homework;

public class LoopPractise2 {
    public static void main (String[] args){

        for(int i = 1; i<= 15; i++){
            System.out.println(i);
            if ((i % 2 == 0) & i % 3 == 0) {
                System.out.println(i + " jest podzielne przez 2 i 3");
                continue;
            }
                if (i % 2 == 0) {
                    System.out.println(i + " jest podzielne przez 2");
                }
                if (i % 3 == 0) {
                    System.out.println(i + " jest podzielne przez 3");
                }

        }

    }
}
