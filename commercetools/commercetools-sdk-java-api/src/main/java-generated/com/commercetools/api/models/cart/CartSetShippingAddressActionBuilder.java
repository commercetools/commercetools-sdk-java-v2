
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetShippingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public CartSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CartSetShippingAddressAction build() {
        return new CartSetShippingAddressActionImpl(address);
    }

    public static CartSetShippingAddressActionBuilder of() {
        return new CartSetShippingAddressActionBuilder();
    }

    public static CartSetShippingAddressActionBuilder of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionBuilder builder = new CartSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
