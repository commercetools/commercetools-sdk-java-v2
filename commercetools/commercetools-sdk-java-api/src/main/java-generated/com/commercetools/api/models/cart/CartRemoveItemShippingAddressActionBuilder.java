
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemoveItemShippingAddressActionBuilder implements Builder<CartRemoveItemShippingAddressAction> {

    private String addressKey;

    public CartRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public CartRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, CartRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new CartRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds CartRemoveItemShippingAddressAction without checking for non null required values
     */
    public CartRemoveItemShippingAddressAction buildUnchecked() {
        return new CartRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static CartRemoveItemShippingAddressActionBuilder of() {
        return new CartRemoveItemShippingAddressActionBuilder();
    }

    public static CartRemoveItemShippingAddressActionBuilder of(final CartRemoveItemShippingAddressAction template) {
        CartRemoveItemShippingAddressActionBuilder builder = new CartRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
