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

    public void getPayment2(Customer customer){
        int payment = 10000;
        try{
            int paidAmount = customer.getPayment(payment);
        } catch (NotEnoughMoneyException e) {
            //요금 처리
        }
    }
}
