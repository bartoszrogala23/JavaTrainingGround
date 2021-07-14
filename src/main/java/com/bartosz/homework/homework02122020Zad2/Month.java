package com.bartosz.homework.homework02122020Zad2;

import java.util.Random;

public class Month {
    Random random = new Random();
    private final String name;
    private final int numberOfDays;
    private final String season;
    private int maxBoundTempCelsius;
    private int minBoundTempCelsius;
    private final int thisDayTempCelsius = random.nextInt(maxBoundTempCelsius - minBoundTempCelsius)
            + minBoundTempCelsius;
    private final int tempFahrenheit;
    private final int tempKelvin;

    public Month(String name, int numberOfDays, String season, int maxBoundTempCelsius, int minBoundTempCelsius) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.maxBoundTempCelsius = maxBoundTempCelsius;
        this.minBoundTempCelsius = minBoundTempCelsius;
        tempKelvin = thisDayTempCelsius + 273;
        tempFahrenheit = (thisDayTempCelsius * 2) + 32;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return season;
    }


    public int getThisDayTemp() {
        System.out.println("todays temperature is: " + thisDayTempCelsius + "C, " + tempFahrenheit + "F, " + tempKelvin + "K.");
        return thisDayTempCelsius;
    }

    @Override
    public String toString() {
        return "month: " + name;
    }
}







