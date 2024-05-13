package org.example.chapter7;

public interface DiscountStrategy {
    int getDiscountPrice(Item item);
    int getDiscountPrice(int totalPrice);
}
