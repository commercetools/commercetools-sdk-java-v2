
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<OrderSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public OrderSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey);
        return new OrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds OrderSetItemShippingAddressCustomTypeAction without checking for non null required values
     */
    public OrderSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder of() {
        return new OrderSetItemShippingAddressCustomTypeActionBuilder();
    }

    public static OrderSetItemShippingAddressCustomTypeActionBuilder of(
            final OrderSetItemShippingAddressCustomTypeAction template) {
        OrderSetItemShippingAddressCustomTypeActionBuilder builder = new OrderSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
