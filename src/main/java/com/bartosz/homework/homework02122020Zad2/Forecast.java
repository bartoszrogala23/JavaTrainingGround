package com.bartosz.homework.homework02122020Zad2;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Forecast {

    public static void main (String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        final List<String> windDirectionList = new ArrayList<>();
        windDirectionList.add("N");
        windDirectionList.add("E");
        windDirectionList.add("S");
        windDirectionList.add("W");
        windDirectionList.add("NE");
        windDirectionList.add("SE");
        windDirectionList.add("NW");
        windDirectionList.add("SW");

        final List<String> windForceList = new ArrayList<>();
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
//            nie wiem jak zrobic z dniem - czy hashmapa czy jakoś sie odwolac do parametru?
//            System.out.println("pick the day");
            monthList.get(choice).getThisDayTemp();
            System.out.println("wind force: " + windForceList.get(random.nextInt(windForceList.size())));
            System.out.println("wind direction: " + windDirectionList.get(random.nextInt(windDirectionList.size())));
        }






    }
}
