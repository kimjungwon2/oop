package org.example.chapter2.encapsulation;

public class ServiceV1 {

    long day30 = 1000 * 60 *60 *24 * 30;

    public void expired(Member member){

        if((member.isMale() && member.getExpiryDate() !=null &&
                member.getExpiryDate().getDate() < System.currentTimeMillis()
        )
        ||
        (!member.isMale() && member.getExpiryDate() != null &&
        member.getExpiryDate().getDate() <System.currentTimeMillis() - day30)){
            //만료 처리
        }
    }



}
