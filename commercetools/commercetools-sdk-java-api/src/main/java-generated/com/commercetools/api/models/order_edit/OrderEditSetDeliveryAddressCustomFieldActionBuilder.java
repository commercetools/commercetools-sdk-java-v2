
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetDeliveryAddressCustomFieldActionBuilder {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public OrderEditSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderEditSetDeliveryAddressCustomFieldActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public OrderEditSetDeliveryAddressCustomFieldActionBuilder fields(
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

    public OrderEditSetDeliveryAddressCustomFieldAction build() {
        return new OrderEditSetDeliveryAddressCustomFieldActionImpl(deliveryId, type, fields);
    }

    public static OrderEditSetDeliveryAddressCustomFieldActionBuilder of() {
        return new OrderEditSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static OrderEditSetDeliveryAddressCustomFieldActionBuilder of(
            final OrderEditSetDeliveryAddressCustomFieldAction template) {
        OrderEditSetDeliveryAddressCustomFieldActionBuilder builder = new OrderEditSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
