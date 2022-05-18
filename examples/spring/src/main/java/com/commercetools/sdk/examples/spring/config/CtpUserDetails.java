
package com.commercetools.sdk.examples.spring.config;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.customer.Customer;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import reactor.util.annotation.Nullable;

public class CtpUserDetails implements UserDetails {
    private final String customerName;
    private final CartReference cartReference;
    private final Collection<? extends GrantedAuthority> authorities;

    public CtpUserDetails(Customer customer, CartReference cart, Collection<? extends GrantedAuthority> authorities) {
        this.customerName = userName(customer);
        this.cartReference = cart;
        this.authorities = authorities;
    }

    private String userName(Customer customer) {
        return Stream.of(customer.getFirstName(), customer.getMiddleName(), customer.getLastName())
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.joining(" "));
    }

    @Nullable
    public CartReference getCart() {
        return cartReference;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return customerName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
