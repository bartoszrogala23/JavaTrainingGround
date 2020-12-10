package com.bartosz.classandmethods.javastartwww;

public class UstawPunkt {
    public static void main (String[] args){

        Punkt punkt = new Punkt(10,20);

        punkt.wspX = 15;
        punkt.getX();
        System.out.println(punkt.getX());
//        System.out.println(punkt.getX());

        punkt.wspY = 15;
        punkt.getY();
        System.out.println(punkt.getY());


    }
}
