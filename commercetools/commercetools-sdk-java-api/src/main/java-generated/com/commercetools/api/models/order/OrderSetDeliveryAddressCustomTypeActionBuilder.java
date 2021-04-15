
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressCustomTypeActionBuilder {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetDeliveryAddressCustomTypeActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetDeliveryAddressCustomTypeAction build() {
        return new OrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, name, value);
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new OrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static OrderSetDeliveryAddressCustomTypeActionBuilder of(
            final OrderSetDeliveryAddressCustomTypeAction template) {
        OrderSetDeliveryAddressCustomTypeActionBuilder builder = new OrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
