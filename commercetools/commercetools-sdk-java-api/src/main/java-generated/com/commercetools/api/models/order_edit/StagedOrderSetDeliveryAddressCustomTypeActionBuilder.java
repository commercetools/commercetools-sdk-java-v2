
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetDeliveryAddressCustomTypeActionBuilder {

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
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
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
