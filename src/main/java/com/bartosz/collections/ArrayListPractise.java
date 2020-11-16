package com.bartosz.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {

    public static void main(String[]args) {

        List<String> Champions = new ArrayList<>();
        Champions.add("Sivir");
        Champions.add("Jhin");
        Champions.add("Caitlin");
        Champions.add("Ashe");

        System.out.println(Champions);

        String element = Champions.get(1);
        System.out.println("element przed zmianą: " + element);
        System.out.println();
        Champions.set(1, "Varus");
        System.out.println("element po zmianie: " + Champions.get(1));
        Champions.remove(2);
        System.out.println(Champions.get(2));
        System.out.println();


//        pętla "for each"
//        for (<typ zmiennej + nowa nazwa> : <do czego się odwołujesz - tutaj do listy Champions.>
//        innymi słowy, po ":" podajesz czym ma się stać <typ zmiennej + nowa nazwa> ;
//        printujesz <typ zmiennej + nowa nazwa> i podstawia Ci się lista Champions
        for(String getChamps: Champions){
            System.out.println(getChamps);
        }


















    }
}
