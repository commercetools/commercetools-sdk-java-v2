
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<CartSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public CartSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            CartSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, CartSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new CartSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds CartSetItemShippingAddressCustomFieldAction without checking for non null required values
     */
    public CartSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new CartSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of() {
        return new CartSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder of(
            final CartSetItemShippingAddressCustomFieldAction template) {
        CartSetItemShippingAddressCustomFieldActionBuilder builder = new CartSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
