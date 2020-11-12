package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;

// poczytaj o javafaker i jak tego uzyc zeby stworzyc np. wielu klientów  w petli(lista);
// praca domowa: wypłaty, obsługa wpłat i wypłat (listy?) (ujemne!),
// opcje zmiany nazwiska, id nieprzekazywany jako parametr do konstruktora tylko nadawany automatycznie
// przy tworzeniu nowego klienta; zapytanie o debet (zmienna debet BigDecimal zalezny od 20% najwiekszej
// wpłaty, debet mozna uzyskać jesli mamy conajmniej 5k na koncie;
// mapa - dokumenty<string string> klucz D.O., PESEL, prawo jazdy i prawa jazdy moze nie byc -
//  jezli pobierasz prawo jazdy i go nie ma to wyswietl komunikat (IF)

public class BankApp {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Bartosz", "Rogala",
                new BigDecimal(1000), "20103280256920101212122312",);
        System.out.println(customer1);
        System.out.println(customer1.getFullName());
        System.out.println("balance: " + customer1.getBalance());
        System.out.println("ledger: " + customer1.getLedger());

        customer1.deposit(new BigDecimal(100));
        System.out.println("balance: " + customer1.getBalance());
        System.out.println("ledger: " + customer1.getLedger());
        customer1.deposit(600);
        System.out.println("balance: " + customer1.getBalance());
        System.out.println("ledger: " + customer1.getLedger());
        ;
    }
}
