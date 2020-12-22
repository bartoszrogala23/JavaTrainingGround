package com.bartosz.classandmethods;

public class geomethods {

    // statyczny - nie potrzabuje instancji;
    //sama klasa ma wiedze o polach

    public static void main(String[] args) {

        double t1 = obliczpoletrojkata(10, 5);
        System.out.println(t1);




//        w linijce nad (" double t3 = Obliczacz...")  nie potrzebujesz
//        obiektu ( Obliczacz obliczacz = new Obliczacz();) żeby odwołać sie do statycznej metody;
//        jesli chceszsie odwolac do jakiejkolwiek niestatycznej metody to musisz miec obiekt (l16)
//        innymi słowy dla metod niestatycznych MUSISZ STWORZYC NOWY OBIEKT;

        double t3 = Obliczacz.obliczpoletrojkatastatic(10,5);
        System.out.println(t3);

        Obliczacz obliczacz = new Obliczacz();
        double t2 = obliczacz.obliczpoletrojkata(10, 5);
        System.out.println(t2);


        Prostokat p1 = new Prostokat(10,20);
        Prostokat p2 = new Prostokat(15,60);


        System.out.println(p1.obliczObwód());
        System.out.println(p1.obliczPole());
        System.out.println(p1.obliczPrzekątną());
        System.out.println();
        System.out.println(p2.obliczObwód());
        System.out.println(p2.obliczPole());
        System.out.println(p2.obliczPrzekątną());

        Kwadrat k1 = new Kwadrat(15);
        Kwadrat k2 = new Kwadrat(60);
        System.out.println("kwadraty: ");
        System.out.println(k1.obliczObwód());
        System.out.println(k1.obliczPole());
        System.out.println(k1.obliczPrzekątną());
        System.out.println();
        System.out.println(k2.obliczObwód());
        System.out.println(k2.obliczPole());
        System.out.println(k2.obliczPrzekątną());
    }

//    rekurencja - gdy funkcja wywołuje samą siebie
//    zeby wywolac w metodzie main, ta metoda musialaby byc statyczna

    static double obliczpoletrojkata(double podstawa, double wysokosc) {
        double poletrojkata = 0.5 * podstawa * wysokosc;
        return poletrojkata;
    }
}
