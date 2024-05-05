package org.example.chapter2.encapsulation;

import java.util.Date;

public class Member {
    private Date expiryDate;
    private boolean male;


    public Date getExpiryDate(){
        return expiryDate;
    }

    public boolean isMale(){
        return male;
    }


}
