package com.bartosz.homework.homework02122020Zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Month {
    Random random = new Random();
    private String name;
    private int numberOfDays;
    private String season;
    private int avgTempCelsius;
    private int thisDayTempCelsius = random.nextInt(avgTempCelsius +6)+(avgTempCelsius -3);
    private int tempFahrenheit = thisDayTempCelsius * 2 + 32;
    private int tempKelvin = thisDayTempCelsius + 273;

    public Month(String name, int numberOfDays, String season, int avgTempCelsius) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.avgTempCelsius = avgTempCelsius;
    }

    public String getName() {
        return name;
    }

    public String getSeason() {
        return season;
    }

    public int getAvgTempCelsius() {
        return avgTempCelsius;
    }

    public int getThisDayTemp() {
        System.out.println("todays temperature is: " + thisDayTempCelsius + "C, " + tempFahrenheit + "F, " +  tempKelvin + "K.");
        return thisDayTempCelsius;
    }

    @Override
    public String toString() {
        return "month: " + name;
    }
}







