package org.example.chapter4;

import java.util.ArrayList;

public class UserContainer {

    public static void main (String args[]) throws NotEnoughSpaceException {
        Luggage size3Lug = new Luggage(3);
        Luggage size2Lug = new Luggage(2);
        Luggage size1Lug = new Luggage(1);

        Container c = new Container(5);
        if (c.canContain(size3Lug)) {
            c.put(size3Lug);
        }

        if (c.canContain(size2Lug)) {
            c.put(size2Lug);
        }

        if (c.canContain(size1Lug)) {
            c.put(size1Lug);
        }


        Container container = new Container(10);
        addLuggageToContainer(10L,container);
        addLuggageToContainer(15L,container);
    }

    public static void addLuggageToContainer(Long luggageId, ArrayList container){
        Luggage lug = null;
        container.add(lug);
    }



}
