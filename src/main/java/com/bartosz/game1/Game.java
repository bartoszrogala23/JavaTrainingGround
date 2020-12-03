package com.bartosz.game1;

import com.google.common.collect.Lists;

import java.util.*;

import static com.bartosz.game1.Direction.*;
import static com.bartosz.game1.Direction.N;

public class Game {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();


    public static void prepareGame() {
//    jesli zapis ponizej jest prawidlowy to do ktorego konstruktora sie odwolujemy,
//    skoro kazdy ma w sobie "exits" a poniżej nie nadajemy takiego atrybutu?
        Location crossroads = new Location(1, "crossroads");
        Location home = new Location(2, "home");
        Location castle = new Location(3, "castle");
        Location cave = new Location(4, "cave");
// dodaje do crossroads wyjście na pole home (location id2) - do domu bedziesz szedł na północ.
        crossroads.createExit(N, 2);
        crossroads.createExit(S, 3);
        crossroads.createExit(E, 4);
        home.createExit(W, 1);
        home.createExit(S, 3);
        home.createExit(E, 4);
        castle.createExit(W, 1);
        castle.createExit(N, 2);
        castle.createExit(E, 4);
        cave.createExit(W, 1);
        cave.createExit(N, 2);
        cave.createExit(S, 3);

//            co tu się dzieje?


//        Location wasteland = new Location(5,
//                // map.of tworzy niemutowalną mape
//                // ten zapis pozwala zapisać mape w jednej linijce.
//                new HashMap<Direction, Integer>(Map.of(W, 1, E, 3, N, 4)));

        //tworzę listę lokacji, które chce użyć w grze.
        //latwiej mi dodać kolejny obiekt lokacji do listy niż pisać odwołanie do hasmapy locations uzywając
        // funkcji "put"
        ArrayList<Location> locationList = Lists.newArrayList(crossroads, home, castle, cave);
        // pętla przerabia liste locationList - dopisuje te elementy do hashmpay loactions.
//        singleLocation w pętli jest odwołaniem do każdego obiektu w liście.
        for (Location singleLocation : locationList) {
            // nie rozumiem zapisu poniżej - czemu służy?
            //  zapis poniżej służy do tego, że elementy listy locationList wrzucasz w locations.
//            do tej pory stworzyłeś obiekty ale nie były one w liście
            locations.put(singleLocation.getLocationID(), singleLocation);
//            bo Mapa locations Map<Integer, Location> = (singleLocation.getLocationID(), singleLocation)
//            gdyby nie to wszystki to na każdąlokalizacje musiałbyś pisać locations.put...
//            czyli wpisywać wszystko ręcznie.
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        prepareGame();

//        locations.get(1);
//
//        System.out.println(locations);
//        System.out.println(N);
//        System.out.println(E);
//        System.out.println(W);
//        System.out.println(S);
        //  System.out.println(Direction.values()); - podpowiedział (alt + enter) żeby
        //  wykonać Stringa z przekazanej arraylisty
//        System.out.println(Arrays.toString(Direction.values()));

//        wpisujemy Integer currentLocationID = 2; bo 2 to home,skąd zaczynamy rozgrywke.
        Integer currentLocationID = 2;
//      locations.get(currentLocationID).getDescription()); - wyciąga mi z mapy locations pojedynczą wartość
//       czyli location, na której wywołana jest metoda getDescription

        while (true) {
            System.out.println("Your current location: " + locations.get(currentLocationID).getDescription());
//            funkcjonalność: wypisz wszystkie wyjścia z lokalizacji
//            pobieramy z mapy locations (mapa w klasie game) ID lokacji (tutaj mamy zmienną w loopie,
//            ID lokacji to key w Hashmapie locations -> odwołujemy się: mapa.get(key) co wyciąga
//            value z mapy (w naszym przypadku lokacje) na której możemy wykonywać jej metody,
//             w tym przypadku metodą jest getExits.
            System.out.println("avilable exits: ");
            for(Map.Entry<Direction, Integer> exit:
                    locations.get(currentLocationID).getExits().entrySet()){
//dwie ponizsze linijki sout bedziesz modyfikowac w ramach pracy domowej.
                System.out.println(exit.getKey());
                System.out.println(exit.getValue());
            }
            System.out.println("Where are you going?: ");
            String direction = scanner.next();
            // wyszukujemy za pomocą stringa odpowiednią wartość enuma
//        System.out.println(Direction.getDirectionfromString(direction));
//        do wytlumaczenia.
//        to jest crosroads bo zrobilem locations.get(1) - dalej nie rozumiem - ten zapis powoduje,
//           że id wskazane w locations.get() wywala błąd gdy chce się tam udać.
             currentLocationID = locations.get(currentLocationID)
                    .takeExit(Direction.getDirectionfromString(direction));
            //można też przez enum values jezeli znajduje sie w arraylist.
        }
    }
}

