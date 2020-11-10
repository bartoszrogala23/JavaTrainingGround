package com.bartosz.homework;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapHomework {
    public static void main(String[] args) {

        Map<String, String> client01 = new HashMap<>();
        client01.put("id", "01");
        client01.put("name", "Bartosz");
        client01.put("surname", "Rogala");
        client01.put("accNumber", "20103280256920100032802569");
        client01.put("balance", "35000");
        client01.put("ledger", "35000"+ ", ");

        Map<String, String> client02 = new HashMap<>();
        client02.put("id", "02");
        client02.put("name", "Adam");
        client02.put("surname", "Kowalksi");
        client02.put("accNumber", "20103280852741963032802512");
        client02.put("balance", "3200");
        client02.put("ledger", "3200"+ ", ");

        Map<String, String> client03 = new HashMap<>();
        client03.put("id", "03");
        client03.put("name", "Henryk");
        client03.put("surname", "Tymbacki");
        client03.put("accNumber", "20103280256920100032000058");
        client03.put("balance", "12300");
        client03.put("ledger", "12300"+ ", ");

        Map<String, String> client04 = new HashMap<>();
        client04.put("id", "04");
        client04.put("name", "Agnieszka");
        client04.put("surname", "Zawadzka");
        client04.put("accNumber", "20103280256920100080604025");
        client04.put("balance", "80000");
        client04.put("ledger", "80000"+ ", ");

        Map<String, String> client05 = new HashMap<>();
        client05.put("id", "05");
        client05.put("name", "Krystian");
        client05.put("surname", "Jezior");
        client05.put("accNumber", "20103280256920101212122312");
        client05.put("balance", "10000");
        client05.put("ledger", "10000"+ ", ");

        Integer depositedvalue = 5000;
        Integer withdrawndvalue = -2500;
        Integer withdrawndvalue2 = -500;

////        System.out.println(client05.get("name") + " " + client05.get("surname") + " dokonuje wpłaty w wysokości: " + depositedvalue);
//        Integer temp1 = Integer.parseInt(client05.get("balance"));
//        temp1 += depositedvalue;
//        String newValue = String.valueOf(temp1);
//        client05.put("balance", newValue);
//        String newLedgerforclient05 = client05.get("ledger") + depositedvalue + ", ";
//        client05.put("ledger", newLedgerforclient05);
//
//
////        System.out.println(client05.get("name") + " " + client05.get("surname") + " dokonuje wypłaty w wysokości: " + withdrawndvalue);
//        Integer temp2 = Integer.parseInt(client05.get("balance"));
//        temp2 = temp2 - withdrawndvalue;
//        String newValue2 = String.valueOf(temp2);
//        client05.replace("balance", newValue2);
//        newLedgerforclient05 = client05.get("ledger") + "-"+withdrawndvalue + ", ";
//        client05.put("ledger", newLedgerforclient05);
//
////        System.out.println(client05.get("name") + " " + client05.get("surname") + " dokonuje wypłaty w wysokości: " + withdrawndvalue2);
//        Integer.parseInt(client05.get("balance"));
//        Integer temp3 = Integer.parseInt(client05.get("balance"));
//        temp3 = temp3 - withdrawndvalue2;
//        String newValue3 = String.valueOf(temp3);
//        client05.replace("balance", newValue3);
//        newLedgerforclient05 = client05.get("ledger") + "-"+withdrawndvalue2 + ", ";
//        client05.put("ledger", newLedgerforclient05);

//        System.out.println(client01.get("name") + " " + client01.get("surname") + " o numerze id : " + client01.get("id") + " posiada na rachunku " + client01.get("accNumber") + " kwotę: " + client01.get("balance") + " PLN.");
//        System.out.println();
//        System.out.println(client02.get("name") + " " + client02.get("surname") + " o numerze id : " + client02.get("id") + " posiada na rachunku " + client02.get("accNumber") + " kwotę: " + client02.get("balance") + " PLN.");
//        System.out.println();
//        System.out.println(client03.get("name") + " " + client03.get("surname") + " o numerze id : " + client03.get("id") + " posiada na rachunku " + client03.get("accNumber") + " kwotę: " + client03.get("balance") + " PLN.");
//        System.out.println();
//        System.out.println(client04.get("name") + " " + client04.get("surname") + " o numerze id : " + client04.get("id") + " posiada na rachunku " + client04.get("accNumber") + " kwotę: " + client04.get("balance") + " PLN.");
//        System.out.println();
//        System.out.println(client05.get("name") + " " + client05.get("surname") + " o numerze id : " + client05.get("id") + " posiada na rachunku " + client05.get("accNumber") + " kwotę: " + client05.get("balance") + " PLN.");
//        System.out.println(client05.get("ledger"));

        List<Map<String,String>> listOfClients = Lists.newArrayList(client01,client02, client03, client04, client05);
//tworzenie listy map, gdzie mapa jest klientem


        for(Map<String,String>client: listOfClients){
            for (Integer value:Lists.newArrayList(depositedvalue, withdrawndvalue, withdrawndvalue2)
                 ) {
                Integer temp1 = Integer.parseInt(client.get("balance"));
                temp1 += value;
                String newValue = String.valueOf(temp1);
                client.put("balance", newValue);
                String newLedger = client.get("ledger") + value + ", ";
                client.put("ledger", newLedger);
            }

        }

        for(Map<String,String>client: listOfClients){
            System.out.println(client.get("name") + " " + client.get("surname")
                    + " o numerze id : " + client.get("id") + " posiada na rachunku "
                    + client.get("accNumber") + " kwotę: " + client.get("balance") + " PLN." + " Ledger: " + client.get("ledger"));
        }


    }
}
