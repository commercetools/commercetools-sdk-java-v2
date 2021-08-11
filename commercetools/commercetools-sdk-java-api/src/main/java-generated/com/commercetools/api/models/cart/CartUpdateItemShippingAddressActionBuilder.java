
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartUpdateItemShippingAddressActionBuilder implements Builder<CartUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public CartUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public CartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CartUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, CartUpdateItemShippingAddressAction.class + ": address is missing");
        return new CartUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds CartUpdateItemShippingAddressAction without checking for non null required values
     */
    public CartUpdateItemShippingAddressAction buildUnchecked() {
        return new CartUpdateItemShippingAddressActionImpl(address);
    }

    public static CartUpdateItemShippingAddressActionBuilder of() {
        return new CartUpdateItemShippingAddressActionBuilder();
    }

    public static CartUpdateItemShippingAddressActionBuilder of(final CartUpdateItemShippingAddressAction template) {
        CartUpdateItemShippingAddressActionBuilder builder = new CartUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
