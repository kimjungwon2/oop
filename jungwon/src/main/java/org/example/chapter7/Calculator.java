package org.example.chapter7;

import java.util.List;

public class Calculator {

    private DiscountStrategy discountStrategy;

    public int calculate(List<Item> items){
        int sum = 0;
        for (Item item: items){
            sum+=discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }

}
