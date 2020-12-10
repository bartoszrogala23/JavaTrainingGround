package com.bartosz.homework.homework02122020Zad1;


public class Client {

    protected Integer clientID;
    protected String clientName;

    // konstruktor
    public Client(int clientID, String clientName) {
        this.clientID = clientID;
        this.clientName = clientName;
    }


    // settery
    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setNewClient(int clientID, String clientName) {
        this.clientID = clientID;
        this.clientName = clientName;
    }

    // gettery


    public Integer getClientID() {
        System.out.println(clientID);
        return clientID;
    }

    public String getClientName() {
        System.out.println(clientName);
        return clientName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientName='" + clientName + '\'' +
                '}';
    }

    Client c1 = new Client(1,"Adam");
    Client c2 = new Client(2,"Bartosz");
    Client c3 = new Client(3,"Cyprian");
    Client c4 = new Client(4,"Dawid");



}
