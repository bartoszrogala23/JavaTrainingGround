package com.bartosz.ClassAndMethods;

import com.sun.jdi.Value;

import java.math.BigDecimal;
import java.security.Key;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

//zrobione
// poczytaj o javafaker i jak tego uzyc zeby stworzyc np. wielu klientów  w petli(lista);

// praca domowa: wypłaty, obsługa wpłat i wypłat (listy?) (ujemne!),

// zapytanie o debet (zmienna debet BigDecimal zalezny od 20% najwiekszej
// wpłaty, debet mozna uzyskać jesli mamy conajmniej 5k na koncie;

// opcje zmiany nazwiska, id nieprzekazywany jako parametr do konstruktora tylko nadawany automatycznie
// przy tworzeniu nowego klienta;

//niezrobione:

// mapa - dokumenty<string string> klucz D.O., PESEL, prawo jazdy i prawa jazdy moze nie byc -
//  jezli pobierasz prawo jazdy i go nie ma to wyswietl komunikat (IF)

public class BankAppTests {
    public static void main(String[] args) {

        Customer2 c1 = new Customer2(1, "Bartosz", "Rogala",
                5000, "205020502020");
        c1.setDocument("Dowód obosbity", "ABC203040");
        c1.setDocument("PESEL", "90120645698");
        c1.setDocument("Prawo jazdy", "PJ108060");
        c1.getDocuments();

//
//       c1.depositMoney(100);
//        System.out.println(c1.getBalance());
//
//        c1.withdrawMoney(300);
//        System.out.println(c1.getBalance());
//
//        c1.getDocuments();{
//            System.out.println(c1.getDocuments());
//        }
//

        c1.depositMoney(200);
        c1.depositMoney(300);
        c1.withdrawMoney(6000);

//        c1.getLedger();
//
//        c1.getDebitAmount();

        System.out.println(c1);

        c1.turnOnDebit();

        c1.getLedger();








    }


}