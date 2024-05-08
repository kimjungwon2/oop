package org.example.chapter4;

public class UserContainer {

    public void main() throws NotEnoughSpaceException {
        Luggage size2Luggage = new Luggage();

        Container c = new Container(5);
        if (c.canContain(size2Luggage)) {
            c.put(size2Luggage);
        }
    }
}
