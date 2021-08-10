
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddItemShippingAddressActionBuilder implements Builder<CartAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public CartAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CartAddItemShippingAddressAction build() {
        Objects.requireNonNull(address);
        return new CartAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds CartAddItemShippingAddressAction without checking for non null required values
     */
    public CartAddItemShippingAddressAction buildUnchecked() {
        return new CartAddItemShippingAddressActionImpl(address);
    }

    public static CartAddItemShippingAddressActionBuilder of() {
        return new CartAddItemShippingAddressActionBuilder();
    }

    public static CartAddItemShippingAddressActionBuilder of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionBuilder builder = new CartAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
