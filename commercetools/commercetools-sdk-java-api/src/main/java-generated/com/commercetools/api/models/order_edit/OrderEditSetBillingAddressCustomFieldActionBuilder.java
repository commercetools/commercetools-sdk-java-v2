
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetBillingAddressCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderEditSetBillingAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderEditSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderEditSetBillingAddressCustomFieldAction build() {
        return new OrderEditSetBillingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderEditSetBillingAddressCustomFieldActionBuilder of() {
        return new OrderEditSetBillingAddressCustomFieldActionBuilder();
    }

    public static OrderEditSetBillingAddressCustomFieldActionBuilder of(
            final OrderEditSetBillingAddressCustomFieldAction template) {
        OrderEditSetBillingAddressCustomFieldActionBuilder builder = new OrderEditSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
