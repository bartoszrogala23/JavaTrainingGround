package com.bartosz.game1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// stworz metode ktora bedzie zwracala liste potworów;
//klasa szkilete, ogr, smok, ma dziedziczy z z monster;

public class MonsterGenerationExample {
    public static void main(String[] args) {
        int lowerlimit = 50;
        int upperlimit = 150;
        Monster.backgroundHistory();


        for (int i = 0; i < new Random().nextInt(upperlimit + 1) + lowerlimit; i++) {
            Monster skeleton = new Skeleton("Skeleton");
            System.out.println(skeleton.toString());
        }

        Skeleton s1 = new Skeleton("s1");
        Ogre o1 = new Ogre("o1");
        System.out.println(s1);
        System.out.println(s1.countBones());

        System.out.println(s1.getHp());

        System.out.println(MonsterListGenerator.generateOgreList());

        System.out.println(MonsterListGenerator.generateSkeletonList());

    }
}
