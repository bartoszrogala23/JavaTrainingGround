package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;


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
    private int debit;




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
        this.debit = 0;
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
//        return name + " " + surname;
//    alternatywa do powyzszej
        return String.format("%s %s", name, surname);
// string. format do formatowania stringów. %s oznacza że pojawi się (s)tring;
//      %d oznacza że pojawi się (d)ecimal -> integer;
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

    public int getDebitAmount() {
        if (balance >= 5000) {
            List<Integer> temp2ledger = new ArrayList<>(ledger);
            temp2ledger.remove(0);
            double temp1 = Collections.max(temp2ledger);
            double debitModifier = temp1 * 0.2;
            System.out.println("debit avilable: " + debitModifier);
            return (int) debitModifier;
        } else {
            System.out.println("debit unavilable");
            return 0;
        }
    }

    ;

// moja metoda getBalance = approved ale robimy inny sposób dla treningu
//    public int getBalance() {
//        if (balance >= 5000) {
//            System.out.println("debit avilable");
//            return balance + isDebitAvilable();
//        };
//        return balance;
//    }



        public int getBalance2() {
        return balance + debit;
    }

    public void turnOnDebit(){
            debit = getDebitAmount();
    }


    public void depositMoney(int value) {
        balance += value;
        ledger.add(value);
    }

    public void withdrawMoney(int value) {
        if (value > balance) {
            System.out.println("not enough funds to withdraw " + value);

        } else {
            balance -= value;
            ledger.add(-value);
        }
    }

    public void setDocument(String rodzajDokumentu, String nrDokumentu) {
        documents.put(rodzajDokumentu, nrDokumentu);
    }


    public Map<String, String> getDocuments() {
        return documents;
//        if (documents.containsKey("Prawo jazdy") & documents.containsValue("")){
//            System.out.println("driving license is not added.");
    }
}




