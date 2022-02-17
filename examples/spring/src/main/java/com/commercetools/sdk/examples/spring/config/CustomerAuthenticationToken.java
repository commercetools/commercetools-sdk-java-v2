package com.commercetools.sdk.examples.spring.config;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomerAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private final CartResourceIdentifier cart;

    public CustomerAuthenticationToken(Object principal, Object credentials, CartResourceIdentifier cart) {
        super(principal, credentials);
        this.cart = cart;
    }

    public CustomerAuthenticationToken(Object principal, Object credentials, CartResourceIdentifier cart,
            Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
        this.cart = cart;
    }

    public CustomerAuthenticationToken(Authentication usernamePasswordAuthenticationToken, CartResourceIdentifier cart) {
        super(usernamePasswordAuthenticationToken.getPrincipal(), usernamePasswordAuthenticationToken.getCredentials());
        this.cart = cart;
    }

    public CartResourceIdentifier getCart() {
        return cart;
    }
}
