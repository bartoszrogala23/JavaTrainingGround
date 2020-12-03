package com.bartosz.game1;

// w enumie są nie zmienne tylko stałe i występuje jeden jedyny ezglemplarz enuma w całym kodzie.
//enumy są niemodyfikowalne.
//typem jest enum
public enum Direction {
    W, N, E, S;

    public static Direction getDirectionfromString (String direction){
        if (direction.equals(N.name())){
            return N;
        }
        if (direction.equals(W.name())){
            return W;
        }
        if (direction.equals(E.name())){
            return E;
        }
        if (direction.equals(S.name())){
            return S;
        }
        throw new RuntimeException("nie ma takiego kierunku");
    }
}


