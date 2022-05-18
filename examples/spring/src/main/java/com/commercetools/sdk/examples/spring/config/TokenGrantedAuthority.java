
package com.commercetools.sdk.examples.spring.config;

import io.vrap.rmf.base.client.AuthenticationToken;

import org.springframework.security.core.GrantedAuthority;

public class TokenGrantedAuthority implements GrantedAuthority {
    private final AuthenticationToken token;
    private final String role;

    public TokenGrantedAuthority(final String role, final AuthenticationToken token) {
        this.role = role;
        this.token = token;
    }

    @Override
    public String getAuthority() {
        return role;
    }

    public AuthenticationToken getToken() {
        return token;
    }
}
