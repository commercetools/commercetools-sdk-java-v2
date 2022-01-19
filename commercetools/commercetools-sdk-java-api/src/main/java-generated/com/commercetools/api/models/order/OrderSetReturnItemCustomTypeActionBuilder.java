
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetReturnItemCustomTypeActionBuilder implements Builder<OrderSetReturnItemCustomTypeAction> {

    private String returnItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetReturnItemCustomTypeActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public OrderSetReturnItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderSetReturnItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetReturnItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public OrderSetReturnItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetReturnItemCustomTypeAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnItemCustomTypeAction.class + ": returnItemId is missing");
        return new OrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    /**
     * builds OrderSetReturnItemCustomTypeAction without checking for non null required values
     */
    public OrderSetReturnItemCustomTypeAction buildUnchecked() {
        return new OrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    public static OrderSetReturnItemCustomTypeActionBuilder of() {
        return new OrderSetReturnItemCustomTypeActionBuilder();
    }

    public static OrderSetReturnItemCustomTypeActionBuilder of(final OrderSetReturnItemCustomTypeAction template) {
        OrderSetReturnItemCustomTypeActionBuilder builder = new OrderSetReturnItemCustomTypeActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
