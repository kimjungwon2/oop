package org.example.chapter7;

import java.util.List;

public class Calculator {

    private DiscountStrategy discountStrategy;



    public Calculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){
        int sum = 0;
        for (Item item: items){
            sum+=discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }


    public void onFirstGuestButtonClick(){
        discountStrategy = new FirstGuestDiscountStrategy();
    }

    public void onCalculationButtonClick(){
        Calculator cal = new Calculator(discountStrategy);
        List<Item> items = List.of(new Item(1),new Item(2));
        int price = cal.calculate(items);
    }

}
