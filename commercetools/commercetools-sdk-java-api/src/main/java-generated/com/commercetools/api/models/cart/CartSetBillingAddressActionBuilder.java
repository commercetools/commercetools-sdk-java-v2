
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetBillingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public CartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public CartSetBillingAddressAction build() {
        return new CartSetBillingAddressActionImpl(address);
    }

    public static CartSetBillingAddressActionBuilder of() {
        return new CartSetBillingAddressActionBuilder();
    }

    public static CartSetBillingAddressActionBuilder of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionBuilder builder = new CartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
