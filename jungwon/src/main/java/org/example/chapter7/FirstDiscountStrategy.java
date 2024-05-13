package org.example.chapter7;

public class FirstDiscountStrategy implements DiscountStrategy{
    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice() * 0.9);
    }

    @Override
    public int getDiscountPrice(int totalPrice) {
        return (int)(totalPrice * 0.9);
    }
}
