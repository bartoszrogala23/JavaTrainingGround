package com.bartosz.homework.homework02122020Zad2;


//2. Napisz program pogodynka
//
//        Po podaniu przez użytkownika dnia i miesiąca zaproponuj pogodę na ten dzień.
//        Uwzględniając:
//        - porę roku (np. jesienią jest zwykle deszczowo)
//        - temperature (przedstawiona w stopniach Fahrenheita, Celsjusza i w Kelvinach)
//        - uwzględnij opady
//        -  uwzględnij  stopień zachmurzenia / nasłonecznienia
//        -  uwzględnij  kierunek i silę wiatru
//
//        Podpowiedzi:
//        Użyj Scanner, Random, List i Map

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Forecast {

    public static void main (String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        WeatherModificator weatherModificator = new WeatherModificator();


        List<String> windDirectionList = new ArrayList<>();
        windDirectionList.add("N");
        windDirectionList.add("E");
        windDirectionList.add("S");
        windDirectionList.add("W");
        windDirectionList.add("NE");
        windDirectionList.add("SE");
        windDirectionList.add("NW");
        windDirectionList.add("SW");

        List<String> windForceList = new ArrayList<>();
        windForceList.add("weak");
        windForceList.add("normal");
        windForceList.add("strong");

        Month january = new Month("january", 31, "Winter", 2);
        Month february = new Month("february", 28,"Winter", 4);
        Month march = new Month("march", 31, "Spring", 4);
        Month april = new Month("april", 30, "Spring", 12);
        Month may = new Month("may", 31, "Spring", 17);
        Month june = new Month("june", 30, "Summer", 23);
        Month july = new Month("july", 31, "Summer", 25);
        Month august = new Month("august", 31, "Summer", 19);
        Month september = new Month("september", 30, "Autumn", 18);
        Month october = new Month("october", 31,"Autumn", 15);
        Month november = new Month("november", 30, "Autumn", 8);
        Month december = new Month("december", 31,"Winter", 3);

        Map<Integer, Month> monthList = new HashMap<>();
        monthList.put(1, january);
        monthList.put(2, february);
        monthList.put(3, march);
        monthList.put(4, april);
        monthList.put(5, may);
        monthList.put(6, june);
        monthList.put(7, july);
        monthList.put(8, august);
        monthList.put(9, september);
        monthList.put(10, october);
        monthList.put(11, november);
        monthList.put(12, december);



//        generator siły i kierunku wiatru
//            System.out.println("wind force: " + windForceList.get(random.nextInt(windForceList.size())));
//            System.out.println("wind direction: " + windDirectionList.get(random.nextInt(windDirectionList.size())));

        System.out.println("check the forecast.");
        while (true){
            System.out.println("pick the month from 1 to 12");
            int choice = scanner.nextInt();
            System.out.println("You picked " + monthList.get(choice));
            if (choice > monthList.size()){
                System.out.println("there is only 12 months.");
                continue;
            }
            System.out.println("pick the day");
            int choice2 = scanner.nextInt(); {
                if (choice2<=monthList.get(choice).getNumberOfDays()) {
                    monthList.get(choice).getThisDayTemp();
//                    poniżej: przez zmienną "choice" nie umiem stwrzyć metody żeby cztery razy nie pisać
//                    if (monthList.get(choice).getSeason().contains(
                    if (monthList.get(choice).getSeason().contains("Winter")) {
                        weatherModificator.setPossibilityofWheater(80, "It's snowing");
                    }
                    if (monthList.get(choice).getSeason().contains("Summer")) {
                        weatherModificator.setPossibilityofWheater(75, "It's sunny");
                    }
                    if (monthList.get(choice).getSeason().contains("Autumn")) {
                        weatherModificator.setPossibilityofWheater(65, "It's foggy day");
                    }
                    if (monthList.get(choice).getSeason().contains("Spring")) {
                        weatherModificator.setPossibilityofWheater(25, "It's rainy day");
                    }
                    }
                else {
                    System.out.println("the number of days in this month is: " + monthList.get(choice).getNumberOfDays());
                    continue;
                }
                weatherModificator.setWindStatus(windForceList, windDirectionList);
                }
                }
            }
//            nie wiem jak zrobic z dniem - czy hashmapa czy jakoś sie odwolac do parametru?
//            System.out.println("pick the day");







    }

