package org.example.chapter7;

public class Item {
    int price;
    boolean fresh;

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isFresh() {
        return this.fresh;
    }
}
