package com.bartosz.ClassAndMethods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>
// do statycznych metod możesz sie odwoływać w niestatycznych metodach ale nigdy odwrotnie;

public class Customer {
    private static int baseID = 0;
    private int id;
    private String name;
    private String surname;
    private BigDecimal balance;
    private String accNumber;
    private List<BigDecimal> ledger;
    private Map<String, String> documents = new HashMap<>();



    public Customer(String name, String surname, BigDecimal balance, String accNumber) {
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
        this.documents = new HashMap<>();
        this.documents.put("ID card", "");
        this.documents.put("PESEL", "");
        this.documents.put("driving license", "");
    }

    public void setDocument(String rodzajDokumentu,String nrDokumentu){
        documents.put(rodzajDokumentu, nrDokumentu);
    }
    // mozemy zastosować enum zamiast rodzaju dokumentu - w przyszlosci

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


