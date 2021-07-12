
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetDeliveryAddressCustomTypeActionBuilder {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CartSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public CartSetDeliveryAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public CartSetDeliveryAddressCustomTypeActionBuilder fields(
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

    public CartSetDeliveryAddressCustomTypeAction build() {
        return new CartSetDeliveryAddressCustomTypeActionImpl(deliveryId, type, fields);
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder of() {
        return new CartSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder of(
            final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionBuilder builder = new CartSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
