
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetItemShippingAddressCustomFieldActionBuilder
        implements Builder<OrderSetItemShippingAddressCustomFieldAction> {

    private String addressKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetItemShippingAddressCustomFieldActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public OrderSetItemShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetItemShippingAddressCustomFieldAction build() {
        Objects.requireNonNull(addressKey,
            OrderSetItemShippingAddressCustomFieldAction.class + ": addressKey is missing");
        Objects.requireNonNull(name, OrderSetItemShippingAddressCustomFieldAction.class + ": name is missing");
        return new OrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    /**
     * builds OrderSetItemShippingAddressCustomFieldAction without checking for non null required values
     */
    public OrderSetItemShippingAddressCustomFieldAction buildUnchecked() {
        return new OrderSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder of() {
        return new OrderSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static OrderSetItemShippingAddressCustomFieldActionBuilder of(
            final OrderSetItemShippingAddressCustomFieldAction template) {
        OrderSetItemShippingAddressCustomFieldActionBuilder builder = new OrderSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
