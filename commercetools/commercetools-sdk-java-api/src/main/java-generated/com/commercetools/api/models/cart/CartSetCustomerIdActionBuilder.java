
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomerIdActionBuilder implements Builder<CartSetCustomerIdAction> {

    @Nullable
    private String customerId;

    public CartSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    public CartSetCustomerIdAction build() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    /**
     * builds CartSetCustomerIdAction without checking for non null required values
     */
    public CartSetCustomerIdAction buildUnchecked() {
        return new CartSetCustomerIdActionImpl(customerId);
    }

    public static CartSetCustomerIdActionBuilder of() {
        return new CartSetCustomerIdActionBuilder();
    }

    public static CartSetCustomerIdActionBuilder of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionBuilder builder = new CartSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
