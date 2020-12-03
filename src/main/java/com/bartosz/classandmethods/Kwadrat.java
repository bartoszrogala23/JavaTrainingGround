package com.bartosz.classandmethods;
//dziedziczenie prostokąt - kwadrat
// extends znaczy że kwadrat dziedziczy wszystko*  po prostokącie.

//* wszystko o modyfikatorach public i protected -  nie dziedziczy prywatnych wartości.
public class Kwadrat extends Prostokat {

// super - wywolanie konstruktora klasy-matki tutaj prostokąta;
    // musimy mieć super(bok, bok); a nie super(bok) bo konstruktor klasy-matki przyjmuje dwie wartości
    public Kwadrat(float bok) {
        super(bok, bok);
    }
}
