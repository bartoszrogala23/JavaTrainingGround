package com.bartosz.homework;

import java.util.HashMap;
import java.util.Map;

public class MapHomeworkTests {
    public static void main (String[] args){

        int depositedvalue = 200;
        int transfervalue = 3400;


        Map<String, Integer> client01 = new HashMap<>();
        client01.put("id", 01);
        client01.put("balance", 3200);

        Map<String, Integer> client02 = new HashMap<>();
        client02.put("id", 02);
        client02.put("balance", 3200);

        Integer test = 3200;

        Map<String, Integer> client03 = new HashMap<>();
        client03.put("id", 03);
        client03.put("balance", test);

//        Integer deposit2 = client03.get("balance");
//        deposit2 = deposit2 - 200;
//        System.out.println(client03.get("balance"));
//        System.out.println((deposit2));


        Integer deposit = client01.get("balance");
        System.out.println(client01.get("balance"));
        deposit = deposit - 200;
        System.out.println(client01.get("balance"));
        System.out.println(deposit);
        client01.replace("balance", deposit);
        System.out.println(client01.get("balance"));











    }
}
