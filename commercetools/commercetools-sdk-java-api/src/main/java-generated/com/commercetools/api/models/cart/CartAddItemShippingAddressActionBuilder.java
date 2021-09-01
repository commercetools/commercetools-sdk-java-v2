
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddItemShippingAddressActionBuilder implements Builder<CartAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public CartAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public CartAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CartAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, CartAddItemShippingAddressAction.class + ": address is missing");
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
