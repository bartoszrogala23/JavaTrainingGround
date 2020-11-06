package com.bartosz.homework;

import com.sun.source.tree.NewArrayTree;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapHomework {
    public static void main (String[] args){


        Map<String, String> client01 = new HashMap<>();
        client01.put("id", "01");
        client01.put("name", "Bartosz");
        client01.put("surname", "Rogala");
        client01.put("accNumber", "20103280256920100032802569");
        client01.put("balance", "35000");

        Map<String, String> client02 = new HashMap<>();
        client02.put("id", "01");
        client02.put("name", "Adam");
        client02.put("surname", "Kowalksi");
        client02.put("accNumber", "20103280852741963032802512");
        client02.put("balance", "3200");

        Map<String, String> client03 = new HashMap<>();
        client03.put("id", "01");
        client03.put("name", "Henryk");
        client03.put("surname", "Tymbacki");
        client03.put("accNumber", "20103280256920100032000058");
        client03.put("balance", "12300");

        Map<String, String> client04 = new HashMap<>();
        client04.put("id", "01");
        client04.put("name", "Agnieszka");
        client04.put("surname", "Zawadzka");
        client04.put("accNumber", "20103280256920100080604025");
        client04.put("balance", "80000");

        Map<String, String> client05 = new HashMap<>();
        client05.put("id", "01");
        client05.put("name", "Krystian");
        client05.put("surname", "Jezior");
        client05.put("accNumber", "20103280256920101212122312");
        client05.put("balance", "10200");


        System.out.println(client01.get("name") + " " + client01.get("surname") + " o numerze id : " + client01.get("id") + " posiada na rachunku " + client01.get("accNumber") + " kwotę: " + client01.get("balance")+" PLN.");




    }
}
