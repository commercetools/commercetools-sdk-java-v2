
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomerEmailActionBuilder implements Builder<CartSetCustomerEmailAction> {

    private String email;

    public CartSetCustomerEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public CartSetCustomerEmailAction build() {
        Objects.requireNonNull(email, CartSetCustomerEmailAction.class + ": email is missing");
        return new CartSetCustomerEmailActionImpl(email);
    }

    /**
     * builds CartSetCustomerEmailAction without checking for non null required values
     */
    public CartSetCustomerEmailAction buildUnchecked() {
        return new CartSetCustomerEmailActionImpl(email);
    }

    public static CartSetCustomerEmailActionBuilder of() {
        return new CartSetCustomerEmailActionBuilder();
    }

    public static CartSetCustomerEmailActionBuilder of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionBuilder builder = new CartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
