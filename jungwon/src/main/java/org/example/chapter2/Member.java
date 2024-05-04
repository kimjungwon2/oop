package org.example.chapter2;

public class Member {

    private String password;

    public boolean equalsPassword(String password) {
        if (password.equals(this.password)) return true;

        return false;
    }
}
