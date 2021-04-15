
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetShippingAddressCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetShippingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetShippingAddressCustomFieldAction build() {
        return new OrderSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder of() {
        return new OrderSetShippingAddressCustomFieldActionBuilder();
    }

    public static OrderSetShippingAddressCustomFieldActionBuilder of(
            final OrderSetShippingAddressCustomFieldAction template) {
        OrderSetShippingAddressCustomFieldActionBuilder builder = new OrderSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
