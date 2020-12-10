package com.bartosz.classandmethods.samouczekprogramisty;

public class SM1 {
    int age;
    String name;
    String surname;


    public SM1(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    // nie twórz nowych obiektów tutaj tylko w klasie main w SM1main!

    //        metoda zwracająca wiek
    int getAge(){
        System.out.println(age);
        return  age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    void doMath (int a, int b){
        int c = a + b;
        System.out.println("wynik dodawania to: " + c);
        int d = a - b;
        System.out.println("wynik odejmowania to: " + d);
        int e = a * b;
        System.out.println("wynik mnożenia to: " + e);
        int f = a / b;
        System.out.println("wynik dzielenia to: " + f);
    };

//    Napisz metodę, która jako argument przyjmuje liczbę i zwraca true
//    jeśli liczba jest parzysta
    public boolean isNumberEven (int numberEven) {
        if (numberEven % 2 ==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        return true;
    };

//    Napisz metodę, która jako argument przyjmuje liczbę
//    i zwraca true jeśli liczba jest podzielna przez 3 i przez 5
    public boolean isDivisibleby3and5(int someNumber){
        if (someNumber % 3 == 0 && someNumber % 5 ==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        return true;
    }

//Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,

    public int potega(int x, int y){
        double z = Math.pow(x, y);
        System.out.println(z);
        return (int) z;
    }

//    Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
//    z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.

    public boolean czyTrojkatProstokatny (int a, int b, int c){
        return  Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2);
    }






}


