
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressCustomFieldActionBuilder {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryAddressCustomFieldActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderSetDeliveryAddressCustomFieldActionBuilder fields(
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

    public OrderSetDeliveryAddressCustomFieldAction build() {
        return new OrderSetDeliveryAddressCustomFieldActionImpl(deliveryId, type, fields);
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder of() {
        return new OrderSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static OrderSetDeliveryAddressCustomFieldActionBuilder of(
            final OrderSetDeliveryAddressCustomFieldAction template) {
        OrderSetDeliveryAddressCustomFieldActionBuilder builder = new OrderSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
