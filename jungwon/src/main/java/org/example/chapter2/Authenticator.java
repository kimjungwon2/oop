package org.example.chapter2;

public class Authenticator {
    public boolean authenticate(String id, String password) throws MemberNotFoundException, InvalidPasswordException {
        Member m = findMemberById(id);

        if(m==null) throw new MemberNotFoundException();

        if(! m.equalsPassword(password)) throw new InvalidPasswordException();

        return true;
    }

    private Member findMemberById(String id) {
        return null;
    }
}
