
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderRemoveItemShippingAddressActionBuilder
        implements Builder<OrderRemoveItemShippingAddressAction> {

    private String addressKey;

    public OrderRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public OrderRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, OrderRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds OrderRemoveItemShippingAddressAction without checking for non null required values
     */
    public OrderRemoveItemShippingAddressAction buildUnchecked() {
        return new OrderRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static OrderRemoveItemShippingAddressActionBuilder of() {
        return new OrderRemoveItemShippingAddressActionBuilder();
    }

    public static OrderRemoveItemShippingAddressActionBuilder of(final OrderRemoveItemShippingAddressAction template) {
        OrderRemoveItemShippingAddressActionBuilder builder = new OrderRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
