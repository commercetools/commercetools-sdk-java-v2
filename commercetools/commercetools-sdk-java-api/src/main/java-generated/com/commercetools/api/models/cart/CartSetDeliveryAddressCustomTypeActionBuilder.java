
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetDeliveryAddressCustomTypeActionBuilder {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public CartSetDeliveryAddressCustomTypeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetDeliveryAddressCustomTypeActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetDeliveryAddressCustomTypeAction build() {
        return new CartSetDeliveryAddressCustomTypeActionImpl(deliveryId, name, value);
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder of() {
        return new CartSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder of(
            final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionBuilder builder = new CartSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
