
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartUpdateItemShippingAddressActionBuilder implements Builder<CartUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public CartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public CartUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address);
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
