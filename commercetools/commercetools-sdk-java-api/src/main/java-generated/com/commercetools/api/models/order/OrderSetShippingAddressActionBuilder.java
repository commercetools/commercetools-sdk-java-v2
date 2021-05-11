
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetShippingAddressActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    public OrderSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderSetShippingAddressAction build() {
        return new OrderSetShippingAddressActionImpl(address);
    }

    public static OrderSetShippingAddressActionBuilder of() {
        return new OrderSetShippingAddressActionBuilder();
    }

    public static OrderSetShippingAddressActionBuilder of(final OrderSetShippingAddressAction template) {
        OrderSetShippingAddressActionBuilder builder = new OrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
