package org.example.chapter2.encapsulation;

import java.util.Date;

public class Member {
    private Date expiryDate;
    private boolean male;
    long day30 = 1000 * 60 *60 *24 * 30;

    public boolean isExpired(){
        if (male) {
            return expiryDate != null
                    && expiryDate.getDate() < System.currentTimeMillis();
        }

        return expiryDate !=null &&
                expiryDate.getDate() <System.currentTimeMillis()-day30;
    }

    public Date getExpiryDate(){
        return expiryDate;
    }

    public boolean isMale(){
        return male;
    }


}
