package org.example.chapter7.templatemethod;

import javax.naming.ldap.LdapContext;

public class LdapAuthenticator extends Authenticator{
    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return IdapClient.authenticate(id, pw);
    }

    @Override
    protected Auth createAuth(String id) {
        LdapContext ctx = IdapClient.find(id);

        return new Auth(id, ctx.getAttribute("name"));
    }
}
