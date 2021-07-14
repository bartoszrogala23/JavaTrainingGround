package com.bartosz.game1;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Monster {
    protected final String name;
    protected int hp;
    protected int dmg;

    public Monster(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public Monster(String name) {
        Random random = new Random();
        this.name = name;
//        nextInt (int bound) - kolejny losowy(random) int (górny zakres)
//        nextInt daje dolną granicę od 0.
//        to co po nawiasie (bound: 15) bedzie dolną granicą ale rozszerza ona granicę górną
//        innymi słowy (bound 15) + 10 => dolna granica 10, górna 24 (bo 10+15)
        this.hp = random.nextInt(15) + 10;
        this.dmg = random.nextInt(10) +1;
//        ponizej alternatywny zapis przekazywania danych do konstruktora w tej samej klasie.
//        dzieki temu mamy krótszy zapis.
//        this(name, new Random().nextInt(15)+10, new Random().nextInt(10)+1 );
    }

    public static void backgroundHistory(){
        System.out.println("scary monster from the dungeon");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", dmg=" + dmg +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }



    }




