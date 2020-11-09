package com.bartosz.homework;

public class LoopPractise {
    public static void main (String[] args){

// wypisz cyfry od 20 do 10
        System.out.println("wypisz cyfry od 20 do 10   ");
        System.out.println();
    for (int i = 20; i >= 10; i--){
        System.out.println(i);
    }
        System.out.println();

// Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
        System.out.println("Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.");
        int x = 10;
    while ( x <= 20){
            System.out.println(x);
            x++;
        }
        System.out.println();
    //Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

        System.out.println("Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.");
       for(int a = -10; a <= 40; a++ ){
           if (a%2 == 0){
               continue;
           }
           System.out.println(a);
       }
        System.out.println();

//        Przerób pętlę z zadania trzeciego na pętlę while.

        int b = -9;
        while (b <= 39) {
            System.out.println(b);
            b+=2;



        }




    }

}
