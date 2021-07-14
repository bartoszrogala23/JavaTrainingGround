package com.bartosz.game1;

import com.google.common.collect.Lists;

import java.util.*;

import static com.bartosz.game1.Direction.*;

public class GameClearVersion {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void prepareGame() {
        Location crossroads = new Location(1, "crossroads");
        Location home = new Location(2, "home");
        Location castle = new Location(3, "castle");
        Location cave = new Location(4, "cave");
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

        ArrayList<Location> locationList = Lists.newArrayList(crossroads, home, castle, cave);
        for (Location singleLocation : locationList) {
            locations.put(singleLocation.getLocationID(), singleLocation);
        }



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        prepareGame();
        Integer currentLocationID = 2;


        while (true) {
            System.out.println("Your current location: " + locations.get
                    (currentLocationID).getDescription());
            System.out.println("avilable exits: ");
            for (Map.Entry<Direction, Integer> exit :
                    locations.get(currentLocationID).getExits().entrySet()) {
                System.out.print(exit.getKey() + " ");
                System.out.println(locations.get(exit.getValue()).getDescription());
            }
            if (locations.get(currentLocationID).getSkeletonList().isEmpty()) {
                System.out.println("no enemies here, you're safe.");
            } else {
                List<Skeleton> skeletons = locations.get(currentLocationID).getSkeletonList();
                System.out.println("there are " + skeletons.size() + " skeletons.");
//                System.out.println("what do you want to do?");
//                System.out.println("attack or flee?");
//                if(scanner.hasNext("attack")) {
//                    locations.get(currentLocationID).getSkeletonList().clear();
//                    System.out.println("there are " + skeletons.size() + " skeletons now.");
//                }
//                if(scanner.hasNext("flee")) {
//                    continue;
//                }
            }
            System.out.println("Where are you going?: ");
            String direction = scanner.next();
            currentLocationID = locations.get(currentLocationID)
                    .takeExit(Direction.getDirectionfromString(direction));
        }


    }

}

