package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;

// poczytaj o javafaker i jak tego uzyc zeby stworzyc np. wielu klientów  w petli(lista);
// praca domowa: wypłaty, obsługa wpłat i wypłat (listy?) (ujemne!),
// opcje zmiany nazwiska, id nieprzekazywany jako parametr do konstruktora tylko nadawany automatycznie
// przy tworzeniu nowego klienta; zapytanie o debet (zmienna debet BigDecimal zalezny od 20% najwiekszej
// wpłaty, debet mozna uzyskać jesli mamy conajmniej 5k na koncie;
// mapa - dokumenty<string string> klucz D.O., PESEL, prawo jazdy i prawa jazdy moze nie byc -
//  jezli pobierasz prawo jazdy i go nie ma to wyswietl komunikat (IF)

public class BankAppTests {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Bartosz", "Rogala",
                BigDecimal.valueOf(1000), "203050505050");
        Customer c2 = new Customer(2, "Tom", "Rak",
                BigDecimal.valueOf(5000), "203050505050");
        Customer c3 = new Customer(3, "Adam", "Tupaj",
                BigDecimal.valueOf(6000), "203050505050");
        Customer c4 = new Customer(4, "Rafał", "Kot",
                BigDecimal.valueOf(8000), "203050505050");
        Customer c5 = new Customer(5, "Krystian", "Front",
                BigDecimal.valueOf(1200), "203050505050");
        Customer c6 = new Customer(6, "Adrian", "Tok",
                BigDecimal.valueOf(5000), "203050505050");

        System.out.println(c2);
    }
}