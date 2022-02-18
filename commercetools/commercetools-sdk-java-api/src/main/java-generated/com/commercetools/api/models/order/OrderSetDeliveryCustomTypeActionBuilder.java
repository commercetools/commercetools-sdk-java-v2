
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetDeliveryCustomTypeActionBuilder implements Builder<OrderSetDeliveryCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetDeliveryCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderSetDeliveryCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetDeliveryCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public OrderSetDeliveryCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetDeliveryCustomTypeAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryCustomTypeAction.class + ": deliveryId is missing");
        return new OrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds OrderSetDeliveryCustomTypeAction without checking for non null required values
     */
    public OrderSetDeliveryCustomTypeAction buildUnchecked() {
        return new OrderSetDeliveryCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static OrderSetDeliveryCustomTypeActionBuilder of() {
        return new OrderSetDeliveryCustomTypeActionBuilder();
    }

    public static OrderSetDeliveryCustomTypeActionBuilder of(final OrderSetDeliveryCustomTypeAction template) {
        OrderSetDeliveryCustomTypeActionBuilder builder = new OrderSetDeliveryCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
