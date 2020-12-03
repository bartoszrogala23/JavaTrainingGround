package com.bartosz.game1;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterListGenerator {

    public static final Faker FAKER = new Faker();

    static List<Ogre> generateOgreList() {
        List<Ogre> ogreList = new ArrayList<>();
        int upperlimit = 5;
        int lowerlimit = 1;
        for (int i = 0; i < new Random().nextInt(upperlimit + 1) + lowerlimit; i++){
            ogreList.add(new Ogre(FAKER.funnyName().name()));
        }
        return ogreList;
    };

    static List<Skeleton> generateSkeletonList() {
        List<Skeleton> skeletonList = new ArrayList<>();
        int upperlimit = 20;
        int lowerlimit = 10;
        for (int i = 0; i < new Random().nextInt(upperlimit + 1) + lowerlimit; i++){
            skeletonList.add(new Skeleton(FAKER.name().firstName()));
        }
        return skeletonList;
    };

}
