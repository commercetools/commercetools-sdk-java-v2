
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetBillingAddressCustomFieldActionBuilder
        implements Builder<CartSetBillingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds CartSetBillingAddressCustomFieldAction without checking for non null required values
     */
    public CartSetBillingAddressCustomFieldAction buildUnchecked() {
        return new CartSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static CartSetBillingAddressCustomFieldActionBuilder of() {
        return new CartSetBillingAddressCustomFieldActionBuilder();
    }

    public static CartSetBillingAddressCustomFieldActionBuilder of(
            final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionBuilder builder = new CartSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
