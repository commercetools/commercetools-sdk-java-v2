
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSignInResultBuilder implements Builder<CustomerSignInResult> {

    private com.commercetools.api.models.customer.Customer customer;

    @Nullable
    private com.commercetools.api.models.cart.Cart cart;

    public CustomerSignInResultBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    public CustomerSignInResultBuilder customer(final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
        return this;
    }

    public CustomerSignInResultBuilder cart(
            Function<com.commercetools.api.models.cart.CartBuilder, com.commercetools.api.models.cart.CartBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartBuilder.of()).build();
        return this;
    }

    public CustomerSignInResultBuilder cart(@Nullable final com.commercetools.api.models.cart.Cart cart) {
        this.cart = cart;
        return this;
    }

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.cart.Cart getCart() {
        return this.cart;
    }

    public CustomerSignInResult build() {
        Objects.requireNonNull(customer, CustomerSignInResult.class + ": customer is missing");
        return new CustomerSignInResultImpl(customer, cart);
    }

    /**
     * builds CustomerSignInResult without checking for non null required values
     */
    public CustomerSignInResult buildUnchecked() {
        return new CustomerSignInResultImpl(customer, cart);
    }

    public static CustomerSignInResultBuilder of() {
        return new CustomerSignInResultBuilder();
    }

    public static CustomerSignInResultBuilder of(final CustomerSignInResult template) {
        CustomerSignInResultBuilder builder = new CustomerSignInResultBuilder();
        builder.customer = template.getCustomer();
        builder.cart = template.getCart();
        return builder;
    }

}
