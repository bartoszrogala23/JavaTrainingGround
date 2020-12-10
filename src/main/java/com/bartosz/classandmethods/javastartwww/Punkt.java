package com.bartosz.classandmethods.javastartwww;

public class Punkt {
    int wspX;
    int wspY;

    // konstruktor
    public Punkt(int a, int b) {
        wspX = a;
        wspY= b;
    }

    void setX(int x) {
        wspX = x;
    }

    void setY(int y) {
        wspY = y;
    }

    public int getX() {
        return wspX;
    }

    public int getY() {
        return wspY;
    }


};

