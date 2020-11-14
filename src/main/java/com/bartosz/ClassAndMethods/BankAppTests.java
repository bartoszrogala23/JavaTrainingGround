package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

// poczytaj o javafaker i jak tego uzyc zeby stworzyc np. wielu klientów  w petli(lista);
// praca domowa: wypłaty, obsługa wpłat i wypłat (listy?) (ujemne!),
// opcje zmiany nazwiska, id nieprzekazywany jako parametr do konstruktora tylko nadawany automatycznie
// przy tworzeniu nowego klienta; zapytanie o debet (zmienna debet BigDecimal zalezny od 20% najwiekszej
// wpłaty, debet mozna uzyskać jesli mamy conajmniej 5k na koncie;
// mapa - dokumenty<string string> klucz D.O., PESEL, prawo jazdy i prawa jazdy moze nie byc -
//  jezli pobierasz prawo jazdy i go nie ma to wyswietl komunikat (IF)

public class BankAppTests {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Customer2 c1 = new Customer2(1, "Bartosz", "Rogala",
                5000, "205020502020");

       c1.depositMoney(100);
        System.out.println(c1.getBalance());

        c1.withdrawMoney(300);
        System.out.println(c1.getBalance());


    }


}