package com.bartosz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractise2 {
    public static void main (String[] args){

       Map<String, String> characterCard = new HashMap<>();
       characterCard.put("Strength","100");
       characterCard.put("Vitality","225");
       characterCard.put("Dexterity","115");
       characterCard.put("Energy","60");

        System.out.println(characterCard);
        System.out.println();

        characterCard.replace("Strength","100","125");
        characterCard.put("Wisdom","100");
        characterCard.remove("Energy");

        System.out.println(characterCard);
        System.out.println();

        for(Map.Entry<String, String> entry: characterCard.entrySet()){}

//       przegląd mapy z iteratorem
//        Set<Map.Entry<String, String>> characterCardEntry = characterCard.entrySet();
//        Iterator<Map.Entry<String, String>> characterCardEntryIterator = characterCardEntry.iterator();
//        while(characterCardEntryIterator.hasNext()){
//            Map.Entry<String, String> entry = characterCardEntryIterator.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }



    }

