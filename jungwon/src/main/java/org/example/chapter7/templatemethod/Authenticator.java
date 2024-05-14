package org.example.chapter7.templatemethod;

public abstract class Authenticator {
    public Auth authenticate(String id, String pw) throws AuthException {
        if(!doAuthenticate(id,pw))
            throw createException();

        return createAuth(id);
    }

    protected abstract boolean doAuthenticate(String id, String pw);

    private RuntimeException createException() throws AuthException {
        throw new AuthException();
    }
    protected abstract Auth createAuth(String id);
}
