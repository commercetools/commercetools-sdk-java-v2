
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartUpdateItemShippingAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public CartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CartUpdateItemShippingAddressAction build() {
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
