package com.bartosz.Game1;
//dopisz do klasy Location obsługę ustawiania id lokacji, opisu oraz dodawania wyjść z lokacji (do istniejącego obiektu)
//        tak aby wyjść z lokacji zgodnie z kierunkiem świata N,S,W,E
//        w klasie game stwórz metodę prepareGame, która wypełni mapę locations lokacjami:
//        - dom
//        - droga
//        - zamek
//        w następujący sposób:
//
//        zamek
//        ^
//        |
//        v
//        droga <-> dom
//
//        Następnie daj użytkownikowi możliwość (poprzez scanner) na odpytywanie gdzie jest i możliwość wyboru gdzie chce iść (oraz czy chce zakonczyc program)
//        zakończenie programu następuje gdy użytkownik napisze "q" lub "Q"
//        odpytanie gdzie chce iść powinno wypisać możliwości opuszczenia danej lokalizacji.
//
//        dodawanie nowych lokalizacji powinno się odbywa na zasadach:
//        locations.put(0, new Location(0, "Jesteś w domu."));

import java.util.HashMap;
import java.util.Map;

public class Location {
     int locationID;
     String description;
    Map <Integer, String> location;

//        location.put(home.locationID, home);
//        location.put(castle.locationID, castle);
//        location.put(cave.locationID, cave);
//        location.put(bridge.locationID, bridge);

    public Location(int locationID, String description) {
        this.locationID = locationID =+ 1;
        this.description = description;
        Location crossroads = new Location(locationID,"crossroads" );
        Location home = new Location(locationID,"home" );
        Location castle = new Location(locationID,"castle" );
        Location cave = new Location(locationID,"cave" );
        Location bridge =  new Location(locationID,"bridge" );
    }


    public void setLocationID(int locationID) {
        this.locationID = locationID =+1 ;
    }

    public int getLocationID() {
        return locationID;
    }
}

