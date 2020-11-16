package com.bartosz.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//<> - określają typ w kolekcji, np. List<BigDecimal> Map<String, String>

public class HashMapPractise {
    public static void main (String[] args){

        Map<String, String> documents = new HashMap<>();
        documents.put("ID Card","ABC123456");
        documents.put("PESEL", "90102029584");
        documents.put("driving license", "DL568521");

        System.out.println(documents);

        for(Map.Entry<String, String> entry: documents.entrySet()){
            System.out.println(entry);
        }

//  PRZEGLĄDANIE MAPY
//
//        pętla for
//
//        for(Map.Entry<String, String> entry: documents.entrySet()) {
//            System.out.println(entry);
//        }
//
//  entry to obiekt zawierający parę klucz - wartość.
//  mapy można przeglądać za pomocą interatora (mimo że nie implementują interfejsu Iterable)
//  Wszystkie entries tworzą zbiór (czyli Set), a zbiory możemy iterować
//  i właśnie tak podchodzimy do tematu:
//        Set< Map.Entry<String, String>> docEntries = documents.entrySet();
////  documents.entrySet() = zbiór par key-value z mapy documents
//        Iterator< Map.Entry<String, String>> docEntriesIterator = docEntries.iterator();
//        while(docEntriesIterator.hasNext()){
//            Map.Entry<String, String> entry = docEntriesIterator.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//






    }
}
