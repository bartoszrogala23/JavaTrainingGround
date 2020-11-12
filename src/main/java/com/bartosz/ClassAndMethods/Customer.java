package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>

public class Customer {
    private int id;
    private String name;
    private String surname;
    private BigDecimal balance;
    private String accNumber;
    private List<BigDecimal> ledger;
    private Map<String, String> documents;


    public Customer(int id, String name, String surname, BigDecimal balance, String accNumber, HashMap documents) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accNumber = accNumber;
        this.ledger = new ArrayList<>();
        this.ledger.add(balance);
        this.documents = new HashMap<String, String>();
        this.documents.put("id card", "");
        this.documents.put("PESEL", "");
        this.documents.put("driving license", "");


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

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
        ledger.add(amount);
    }

    public void deposit(Integer amount) {
        deposit(new BigDecimal(amount));
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<BigDecimal> getLedger() {
        return ledger;
    }

    public Map<String, String> getDocuments() {
        return documents;
    }
}


