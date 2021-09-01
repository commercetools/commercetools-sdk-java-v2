
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressCustomTypeActionBuilder
        implements Builder<OrderSetDeliveryAddressCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder fields(
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

    public OrderSetDeliveryAddressCustomTypeAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryAddressCustomTypeAction.class + ": deliveryId is missing");
        return new OrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds OrderSetDeliveryAddressCustomTypeAction without checking for non null required values
     */
    public OrderSetDeliveryAddressCustomTypeAction buildUnchecked() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new OrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder of(
            final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionBuilder builder = new OrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
