package org.example.chapter2.encapsulation;

public class Paperboy {

    public void getPayment(Customer customer){
        int payment = 10000;
        Wallet wallet = customer.getWallet();
        if(wallet.getTotalMoney()>=payment){
            wallet.substractMoney(payment);
        }else{

        }
    }
}
