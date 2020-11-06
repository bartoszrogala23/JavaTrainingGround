package com.bartosz.collections;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class MapsExample {
    public static void main(String[] args) {


        Map<String , Integer> teamPrices = new HashMap<>();

        teamPrices.put("Arsenal", 150);
        teamPrices.put("Everton", 150);
        teamPrices.put("Manchester", 150);
        teamPrices.put("Arsenal", 200);
        teamPrices.put("Arsenal", 300);
        System.out.println(teamPrices);

        List<Map<String, Integer>> teamWorth = new ArrayList<>();
        teamWorth.add(Map.of("Arsenal", 150, "Everton", 150, "Manchester", 150));
        teamWorth.add(Map.of("Arsenal", 200, "Everton", 200, "Manchester", 200));
        teamWorth.add(Map.of("Arsenal", 300, "Everton", 300, "Manchester", 300));
        teamWorth.add(Map.of("Arsenal", 400, "Everton", 400, "Manchester", 400));
        teamWorth.add(Map.of("Arsenal", 500, "Everton", 500, "Manchester", 500));
//        System.out.println(teamWorth.get(3).get("Manchester"));
//        System.out.println(teamWorth.get(3).getOrDefault("Leeds", -1));

        for(Map<String, Integer> teams: teamWorth){
            System.out.println(teams);
            for(Map.Entry<String, Integer> entry:teams.entrySet()){
                System.out.println("team: " + entry.getKey() + " is worth: " + entry.getValue() );
            }
        }
    }
}
