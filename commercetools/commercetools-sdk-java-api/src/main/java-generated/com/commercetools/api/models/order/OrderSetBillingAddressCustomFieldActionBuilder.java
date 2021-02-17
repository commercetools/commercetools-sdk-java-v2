
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetBillingAddressCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetBillingAddressCustomFieldAction build() {
        return new OrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder of() {
        return new OrderSetBillingAddressCustomFieldActionBuilder();
    }

    public static OrderSetBillingAddressCustomFieldActionBuilder of(
            final OrderSetBillingAddressCustomFieldAction template) {
        OrderSetBillingAddressCustomFieldActionBuilder builder = new OrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
