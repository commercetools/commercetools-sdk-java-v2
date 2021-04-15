
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderUpdateItemShippingAddressActionBuilder {

    private com.commercetools.api.models.common.Address address;

    public OrderUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public OrderUpdateItemShippingAddressAction build() {
        return new OrderUpdateItemShippingAddressActionImpl(address);
    }

    public static OrderUpdateItemShippingAddressActionBuilder of() {
        return new OrderUpdateItemShippingAddressActionBuilder();
    }

    public static OrderUpdateItemShippingAddressActionBuilder of(final OrderUpdateItemShippingAddressAction template) {
        OrderUpdateItemShippingAddressActionBuilder builder = new OrderUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
