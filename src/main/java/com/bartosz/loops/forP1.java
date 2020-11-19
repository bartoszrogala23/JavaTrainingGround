package com.bartosz.loops;

public class forP1 {
    public static void main(String[] args) {

        for (int i = 1; i < 16; i++) {
            if (i % 3 == 0 & i % 6 == 0){
                System.out.println("podzielne przez 3 i 6");
                continue;
            };
            if  (i % 3 == 0){
                System.out.println("podzielne przez 3");
            };
            if  (i % 6 == 0){
                System.out.println("podzielne przez 6");
            };

            System.out.println(i);
        }

    }


}
