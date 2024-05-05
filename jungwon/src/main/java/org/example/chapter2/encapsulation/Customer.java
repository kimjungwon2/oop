package org.example.chapter2.encapsulation;

public class Customer {
    private Wallet wallet;
    public Wallet getWallet(){
        return wallet;
    }

    public int getPayment(int payment) throws NotEnoughMoneyException {
        if (wallet == null) throw new NotEnoughMoneyException();
        if(wallet.getTotalMoney()>= payment){
            wallet.substractMoney(payment);
            return payment;
        }
        throw new NotEnoughMoneyException();
    }

}
