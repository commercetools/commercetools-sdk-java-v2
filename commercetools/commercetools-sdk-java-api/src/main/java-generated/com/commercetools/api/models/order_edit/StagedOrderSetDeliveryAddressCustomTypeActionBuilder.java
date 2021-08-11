
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetDeliveryAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetDeliveryAddressCustomTypeAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder fields(
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

    public StagedOrderSetDeliveryAddressCustomTypeAction build() {
        Objects.requireNonNull(deliveryId,
            StagedOrderSetDeliveryAddressCustomTypeAction.class + ": deliveryId is missing");
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    /**
     * builds StagedOrderSetDeliveryAddressCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetDeliveryAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder = new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
