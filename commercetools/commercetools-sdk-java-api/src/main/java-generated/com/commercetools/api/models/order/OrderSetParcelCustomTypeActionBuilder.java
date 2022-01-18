
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetParcelCustomTypeActionBuilder implements Builder<OrderSetParcelCustomTypeAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetParcelCustomTypeActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderSetParcelCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetParcelCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public OrderSetParcelCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetParcelCustomTypeAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelCustomTypeAction.class + ": parcelId is missing");
        return new OrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    /**
     * builds OrderSetParcelCustomTypeAction without checking for non null required values
     */
    public OrderSetParcelCustomTypeAction buildUnchecked() {
        return new OrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    public static OrderSetParcelCustomTypeActionBuilder of() {
        return new OrderSetParcelCustomTypeActionBuilder();
    }

    public static OrderSetParcelCustomTypeActionBuilder of(final OrderSetParcelCustomTypeAction template) {
        OrderSetParcelCustomTypeActionBuilder builder = new OrderSetParcelCustomTypeActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
