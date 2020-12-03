package com.bartosz.classandmethods;

public class Prostokat {

    // atrybuty danej klasy (tu class Prostakat)
    // są konieczne bo opisują daną klasę;
    //robimy prywane zeby nie mozna sie bylo do nich odwolac w innej klasie.
    //finalne robimy po to zeby nie mozna ich bylo zmienic po stworzeniu obiektu
    protected final float długość;
    protected final float szerokość;


    //konstruktor - tworzymy go bo chcemy mieć opis/instrukcję tworzenia obiektu typu Prostakat;
    // do konstruktora musimy przekazać parametry, ktore beda odpowiadały atrybutom)

    public Prostokat(float długość, float szerokość) {
       this.długość = długość;
       this.szerokość = szerokość;
    }


    // metoda na obliczenie pola
    public float obliczPole(){
        return długość * szerokość;
    }

    public float obliczObwód(){
        return 2 * długość + 2 * szerokość;
    }

    public double obliczPrzekątną(){
        return Math.sqrt(długość * długość + szerokość * szerokość);
    }
}



