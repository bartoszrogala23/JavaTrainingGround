package com.bartosz.homework.homework02122020Zad3;

import java.util.HashMap;
import java.util.Map;

public class Client {
    private String clientName;
    private int clientID;
    private Map<Integer, String> clientMap2 = new HashMap<>();

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public void setNewClient(String clientName) {
        this.clientID = clientID=+1;
        this.clientName = clientName;
        clientMap2.put(this.clientID, this.clientName);
    }


    public Map<Integer, String> getClientMap2() {
        return clientMap2;
    }
}
