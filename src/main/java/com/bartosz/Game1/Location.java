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
    private final int locationID;
     String description;
    private final HashMap<Direction, Integer> exits ;


//    konstruktor - metoda która pokrywa szkielet (klasę) mięśniami.
    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
//        w przypadku nowego obiektu nie musisz podawać typów zmiennych
//        bo zaciaga je z typów przy deklaracji zmiennej.

//        nie wiem czemu akurat nowa hashmapa a nie ta z klasy (linijka 31)
        this.exits = new HashMap<>();
    }

    public Location(int locationID, HashMap<Direction, Integer> exits){
        this.locationID=locationID;
        this.exits = exits;
    };

    public Location(int locationID, String description, HashMap<Direction, Integer> exits){
        this.locationID=locationID;
        this.description=description;
        this.exits = exits;
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<Direction, Integer> getExits() {
        return exits;
    }

//    nie rozumiem zapisu { this.exits.put(direction,locationID);}
// createexits jest metodą o parametrach direction, locactionid, która uzupełnia
// hashmape exits (zadeklarowana w klasie).
    public void createExit(Direction direction, int locationID){
        if (locationID == this.locationID){
            throw new RuntimeException("wyjście z lokacji się zapętla");
        }
        this.exits.put(direction,locationID);

    }

    @Override
    public String toString() {
        return "Location{" +
                "locationID=" + locationID +
                ", description='" + description + '\'' +
                ", exits=" + exits +
                '}';
    }

    public Integer takeExit (Direction direction){
        return this.exits.get(direction);
    }
}



