package com.bartosz.game1;

import java.util.Random;

public class Skeleton extends Monster {
    public Skeleton(String name, int hp, int dmg) {
        super(name, hp, dmg);
    }

    public Skeleton(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Skeleton{" +
                "name='" + super.getName() + '\'' +
                ", hp=" + super.getHp() +
//                dmg jest protected - wiec bez super tylko dziedziczy bezpośrednio z klasy nadrzednej .
                ", dmg=" + dmg +
                '}';
    }

public int countBones(){
  return new Random().nextInt(15)+5;
};





}
