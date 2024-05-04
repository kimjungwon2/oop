package org.example.chapter2;

public class AuthenticationHandler {

    public void handleRequest(String inputId, String inputPassword){
        Authenticator auth = new Authenticator();
        try{
            auth.authenticate(inputId, inputPassword);
        }catch(MemberNotFoundException ex){

        }catch(InvalidPasswordException ex){

        }

    }

}
