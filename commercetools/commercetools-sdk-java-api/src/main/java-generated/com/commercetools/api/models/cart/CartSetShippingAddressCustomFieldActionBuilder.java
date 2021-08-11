
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetShippingAddressCustomFieldActionBuilder
        implements Builder<CartSetShippingAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public CartSetShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, CartSetShippingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetShippingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds CartSetShippingAddressCustomFieldAction without checking for non null required values
     */
    public CartSetShippingAddressCustomFieldAction buildUnchecked() {
        return new CartSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static CartSetShippingAddressCustomFieldActionBuilder of() {
        return new CartSetShippingAddressCustomFieldActionBuilder();
    }

    public static CartSetShippingAddressCustomFieldActionBuilder of(
            final CartSetShippingAddressCustomFieldAction template) {
        CartSetShippingAddressCustomFieldActionBuilder builder = new CartSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
