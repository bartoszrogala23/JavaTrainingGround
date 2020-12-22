package com.bartosz.homework.homework02122020Zad2;

import java.util.*;

public class WeatherModificator {
    Random random = new Random();


    private final ArrayList<String> windForce = new ArrayList<>();
    private final ArrayList<String> windDirection = new ArrayList<>();


    public WeatherModificator() {
        windForce.add("weak");
        windForce.add("normal");
        windForce.add("strong");
        windDirection.add("N");
        windDirection.add("E");
        windDirection.add("S");
        windDirection.add("W");
        windDirection.add("NE");
        windDirection.add("SE");
        windDirection.add("NW");
        windDirection.add("SW");
    }


    public void getWindForce() {
        System.out.println(windForce);
    }

    public void getWindDirection() {
        System.out.println(windDirection);
    }

    public void setPossibilityOfWheater(int probability, String status) {
        int chance = random.nextInt(100);
        if (chance >= probability) {
            System.out.println(status);
        }
        else{
            System.out.println("the weather is neutral");
        }

        Random random2 = new Random();
        System.out.println("wind force: " + windForce.get(random2.nextInt(windForce.size())));
        System.out.println("wind direction: " + windDirection.get(random2.nextInt(windDirection.size())));
    }

    public void showWindStatus(List<String> windForce, List<String> windDirection) {
        System.out.println("wind force: " + windForce.get(random.nextInt(windForce.size())));
        System.out.println("wind direction: " + windDirection.get(random.nextInt(windDirection.size())));
    }
//    TODO:
//    pozbądź się list windForce, windDirection, zamiast tego użyć ich w konstrukcji obiektu. (w konstruktorze)
}




