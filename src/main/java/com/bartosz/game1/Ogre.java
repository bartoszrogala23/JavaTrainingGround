package com.bartosz.game1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ogre extends Monster {

    public Ogre(String name, int hp, int dmg) { super(name, hp, dmg);
    }

    public Ogre(String name) {
        super(name);
        Random random = new Random();
        this.hp = random.nextInt(25) + 15;
        this.dmg = random.nextInt(15) +5;
    }

    @Override
    public String toString() {
        return "Ogre{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                '}';
    }


}
