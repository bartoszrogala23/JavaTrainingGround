package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.*;


//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>

public class Customer2 {
    private static int baseID = 0;
    private int id;
    private String name;
    private String surname;
    private int balance;
    private String accNumber;
    private List<Integer> ledger;
    public Map<String, String> documents = new HashMap<>();



    // konstruktor klienta
    public Customer2(int id, String name, String surname, int balance, String accNumber) {
        baseID += 1;
        this.id = baseID;
//        zapis powyżej baseID += 1; this.id = baseID; powoduje ze każdy kolejny stworzony
//        klient bedzie mial nowe ID
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accNumber = accNumber;
        this.ledger = new ArrayList<>();
        this.ledger.add(balance);
        this.documents = new HashMap<String, String>();
    }


    public void setSurname() {
        surname.replace(surname, "");

    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accNumber='" + accNumber + '\'' +
                ", ledger=" + ledger +
                '}';
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getLedger() {
        System.out.println(ledger);
        return ledger;
    }


//    //askfordebit - nie działa, szukaj inaczej.
//    public String askForDebit(){
//        ledger.sort(Comparator.naturalOrder());
//        double debitModifier = ledger.get(-1) * 0.2;
//        System.out.println("debit avilable: " + debitModifier);
//        return askForDebit();
//    }

    public void askForDebit() {
        if (balance >= 5000) {
            double temp1 = Collections.max(ledger);
            double debitModifier = temp1 * 0.2;
            System.out.println("debit avilable: " + debitModifier);

        } else {
            System.out.println("debit unavilable");
        }
    }

    ;


    public int getBalance() {
        if (balance >= 5000) {
            System.out.println("debit avilable");
        }
        ;
        return balance;
    }


    public void depositMoney(int value) {
        balance += value;
        ledger.add(value);
    }

    public void withdrawMoney(int value) {
        if (value > balance) {
            System.out.println("action unavilable");

        } else {
            balance -= value;
            ledger.add(-value);
        }
    }
    public void setDocument(String rodzajDokumentu,String nrDokumentu) {
        documents.put(rodzajDokumentu, nrDokumentu);
    }



    public Map<String, String> getDocuments() {
        return documents;
//        if (documents.containsKey("Prawo jazdy") & documents.containsValue("")){
//            System.out.println("driving license is not added.");
        }
    }




