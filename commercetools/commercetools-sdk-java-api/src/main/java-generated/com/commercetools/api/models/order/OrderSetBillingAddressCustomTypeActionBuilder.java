
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetBillingAddressCustomTypeActionBuilder implements Builder<OrderSetBillingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetBillingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderSetBillingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetBillingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public OrderSetBillingAddressCustomTypeActionBuilder fields(
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

    public OrderSetBillingAddressCustomTypeAction build() {
        return new OrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderSetBillingAddressCustomTypeAction without checking for non null required values
     */
    public OrderSetBillingAddressCustomTypeAction buildUnchecked() {
        return new OrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder of() {
        return new OrderSetBillingAddressCustomTypeActionBuilder();
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder of(
            final OrderSetBillingAddressCustomTypeAction template) {
        OrderSetBillingAddressCustomTypeActionBuilder builder = new OrderSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}