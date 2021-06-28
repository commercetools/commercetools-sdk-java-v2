
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetDeliveryAddressCustomTypeActionBuilder {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetDeliveryAddressCustomTypeActionBuilder value(@Nullable final java.lang.Object value) {
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

    public StagedOrderSetDeliveryAddressCustomTypeAction build() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl(deliveryId, name, value);
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder of(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder = new StagedOrderSetDeliveryAddressCustomTypeActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
