package org.example.chapter2.encapsulation;

public class Wallet {
    private int money;

    public int getTotalMoney(){
        return money;
    }

    public void substractMoney(int debit){
        money-=debit;
    }


}
