package com.bartosz.collections;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    public static void main(String[]args){

        String[] array = {
            "Everton", "Arsenal", "Manchester UTD", "Liverpool"
        };
        System.out.println(Arrays.stream(array).sorted().collect(Collectors.joining()));
        List<String> list = new ArrayList<>();
         list.add("Everton");
         list.add("Arsenal");
        System.out.println(list);

        List<String> list2 = Lists.asList("Leeds", array);
        System.out.println(list2);

        List<String> list3 = Lists.newArrayList( "Everton", "Arsenal", "Manchester UTD", "Liverpool");
        System.out.println(list3);

//        for(String team: list3){
//            System.out.println(team);
//        }
//        list3.set(1, "Leeds");
//        System.out.println(list3);
//        System.out.println();
//        list3.add(1,"Arsenal");
//        System.out.println(list3);
//       // list3.stream().sorted().collect(Collectors.joining());
//        System.out.println(list3.stream().sorted().collect(Collectors.joining(", ")));

        Map<String, Integer> teamPrices = new HashMap<>();

        teamPrices.put("Arsenal", 150);
        teamPrices.put("Everton", 150);
        teamPrices.put("Manchester", 150);
        teamPrices.put("Arsenal", 200);
        teamPrices.put("Arsenal", 300);
        System.out.println(teamPrices);
    }
}
