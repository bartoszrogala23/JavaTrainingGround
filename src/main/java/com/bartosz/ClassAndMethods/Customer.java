package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>

public class Customer {
    private int id;
    private String name;
    private String surname;
    private BigDecimal balance;
    private String accNumber;
    private List<BigDecimal> ledger;

    public Customer(int id, String name, String surname, BigDecimal balance, String accNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accNumber = accNumber;
        this.ledger = new ArrayList<>();
        this.ledger.add(balance);

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
