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
    private Map<String, String> documents = new HashMap<>();



    public Customer(int id, String name, String surname, BigDecimal balance, String accNumber) {
        this.id = id+1;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
            if (this.balance.compareTo(debitLimit)>1){
                System.out.println("debit avilable: " + getBalance().multiply(BigDecimal.valueOf(0.2)));
            };
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


}


