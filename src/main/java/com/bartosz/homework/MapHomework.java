package com.bartosz.homework;

import java.util.HashMap;
import java.util.Map;

public class MapHomework {
    public static void main (String[] args){


        Map<String, String> client01 = new HashMap<>();
        client01.put("id", "01");
        client01.put("name", "Bartosz");
        client01.put("surname", "Rogala");
        client01.put("accNumber", "20103280256920100032802569");
        client01.put("balance", "35000");
        client01.put("ledger", null);

        Integer.parseInt(client01.get("balance"));
        Integer temp = Integer.parseInt(client01.get("balance"));
        temp = temp + 300;
        String x = String.valueOf(temp);
        client01.replace("balance", x);
        System.out.println(client01);


        Map<String, String> client02 = new HashMap<>();
        client02.put("id", "01");
        client02.put("name", "Adam");
        client02.put("surname", "Kowalksi");
        client02.put("accNumber", "20103280852741963032802512");
        client02.put("balance", "3200");
        client02.put("ledger", null);

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

//
//        Set<Map.Entry<String, String>> entries = client01.entrySet();
//        Iterator<Map.Entry<String, String>> clientIterator = client01.entrySet().iterator();
//
//        while(clientIterator.hasNext()) {
//            Map.Entry<String, String> entry = clientIterator.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }



            System.out.println(client01.get("name") + " " + client01.get("surname") + " o numerze id : " + client01.get("id") + " posiada na rachunku " + client01.get("accNumber") + " kwotę: " + client01.get("balance")+" PLN.");
            System.out.println(client02.get("name") + " " + client02.get("surname") + " o numerze id : " + client02.get("id") + " posiada na rachunku " + client02.get("accNumber") + " kwotę: " + client02.get("balance")+" PLN.");
            System.out.println(client03.get("name") + " " + client03.get("surname") + " o numerze id : " + client03.get("id") + " posiada na rachunku " + client03.get("accNumber") + " kwotę: " + client03.get("balance")+" PLN.");
            System.out.println(client04.get("name") + " " + client04.get("surname") + " o numerze id : " + client04.get("id") + " posiada na rachunku " + client04.get("accNumber") + " kwotę: " + client04.get("balance")+" PLN.");
            System.out.println(client05.get("name") + " " + client05.get("surname") + " o numerze id : " + client05.get("id") + " posiada na rachunku " + client05.get("accNumber") + " kwotę: " + client05.get("balance")+" PLN.");








    }
}
