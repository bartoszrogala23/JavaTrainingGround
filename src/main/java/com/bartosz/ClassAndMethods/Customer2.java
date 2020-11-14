package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>

public class Customer2 {
    private int id;
    private String name;
    private String surname;
    private int balance;
    private String accNumber;
    private List<Integer> ledger;
    private Map<String, String> documents = new HashMap<>();



    public Customer2(int id, String name, String surname, int balance, String accNumber) {
        this.id = id+1;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accNumber = accNumber;
        this.ledger = new ArrayList<>();
        this.ledger.add(balance);
        this.documents = new HashMap<>();
        this.documents.put("ID card", "");
        this.documents.put("PESEL", "");
        this.documents.put("driving license", "");
    }



    BigDecimal debitLimit = BigDecimal.valueOf(4999);

    public void setSurname() {
        surname.replace(surname,"");

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

    public List<Integer> getLedger() {
        return ledger;
    }

    public void setLedger(List<Integer> ledger) {
        this.ledger = ledger;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int depositMoney(int value){
        getBalance();
        int newBalance = balance + value;
        setBalance(newBalance);
        return balance;
    }

    public  int withdrawMoney(int value){
        getBalance();
        int newBalance = balance - value;
        setBalance(newBalance);
        return balance;
    }

}


