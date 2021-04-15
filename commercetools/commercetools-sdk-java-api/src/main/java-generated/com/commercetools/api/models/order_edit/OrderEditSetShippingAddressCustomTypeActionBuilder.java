
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetShippingAddressCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderEditSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderEditSetShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderEditSetShippingAddressCustomTypeAction build() {
        return new OrderEditSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static OrderEditSetShippingAddressCustomTypeActionBuilder of() {
        return new OrderEditSetShippingAddressCustomTypeActionBuilder();
    }

    public static OrderEditSetShippingAddressCustomTypeActionBuilder of(
            final OrderEditSetShippingAddressCustomTypeAction template) {
        OrderEditSetShippingAddressCustomTypeActionBuilder builder = new OrderEditSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
