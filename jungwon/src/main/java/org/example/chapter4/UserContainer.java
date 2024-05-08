package org.example.chapter4;

public class UserContainer {

    public void main() throws NotEnoughSpaceException {
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
    }
}
