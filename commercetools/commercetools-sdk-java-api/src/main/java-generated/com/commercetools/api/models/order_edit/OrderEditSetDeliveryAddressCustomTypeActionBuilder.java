
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetDeliveryAddressCustomTypeActionBuilder {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderEditSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderEditSetDeliveryAddressCustomTypeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderEditSetDeliveryAddressCustomTypeActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderEditSetDeliveryAddressCustomTypeAction build() {
        return new OrderEditSetDeliveryAddressCustomTypeActionImpl(deliveryId, name, value);
    }

    public static OrderEditSetDeliveryAddressCustomTypeActionBuilder of() {
        return new OrderEditSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static OrderEditSetDeliveryAddressCustomTypeActionBuilder of(
            final OrderEditSetDeliveryAddressCustomTypeAction template) {
        OrderEditSetDeliveryAddressCustomTypeActionBuilder builder = new OrderEditSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
