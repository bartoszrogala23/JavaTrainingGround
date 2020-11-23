package com.bartosz.Game1;

import com.google.common.collect.Lists;

import java.util.*;

import static com.bartosz.Game1.Direction.*;
import static com.bartosz.Game1.Direction.N;

public class Game {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();


    public static void prepareGame() {
//    jesli zapis ponizej jest prawidlowy to do ktorego konstruktora sie odwolujemy,
//    skoro kazdy ma w sobie "exits" a poniżej nie nadajemy takiego atrybutu?
        Location crossroads = new Location(1, "crossroads");
        Location home = new Location(2, "home");
        Location castle = new Location(3, "castle");
        Location cave = new Location(4, "cave");
// dodaje do crossroads wyjście na pole home (location id2) - do domu bedziesz szedł na wschód.
        crossroads.createExit(N, 2);
        crossroads.createExit(S, 3);
        crossroads.createExit(E, 7);
//            co tu się dzieje?


        Location wasteland = new Location(5,
                // map.of tworzy niemutowalną mape
                // ten zapis pozwala zapisać mape w jednej linijce.
                new HashMap<Direction, Integer>(Map.of(W, 1, E, 3, N, 4)));

        //tworzę listę lokacji, które chce użyć w grze.
        //latwiej mi dodać kolejny obiekt lokacji do listy niż pisać odwołanie do hasmapy locations uzywając
        // funkcji "put"
        ArrayList<Location> locationList = Lists.newArrayList(crossroads, home, castle, cave);
        // pętla przerabia liste locationList - dopisuje te elementy do hashmpay loactions.
        for (Location singleLocation : locationList) {
            // nie rozumiem zapisu poniżej - czemu służy?
            //
            locations.put(singleLocation.getLocationID(), singleLocation);
        }
    }


    public static void main(String[] args) {
        prepareGame();

        locations.get(1);

        System.out.println(locations);
        System.out.println(N);
        System.out.println(E);
        System.out.println(W);
        System.out.println(S);
        //  System.out.println(Direction.values()); - podpowiedział (alt + enter) żeby
        //  wykonać Stringa z przekazanej arraylisty
        System.out.println(Arrays.toString(values()));

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Where are you going?: ");
        String direction = scanner.next();
        // wyszukujemy za pomocą stringa odpowiednią wartość enuma
//        System.out.println(Direction.getDirectionfromString(direction));

//        do wytlumaczenia.
//        to jest crosroads bo zrobilem locations.get(1)
        Integer exitTaken = locations.get(1).takeExit(Direction.getDirectionfromString(direction));
        Location step2 = locations.get(exitTaken);
        System.out.println(step2.getDescription());

        //można też przez enum values jezeli znajduje sie w arraylist.

    }
}

