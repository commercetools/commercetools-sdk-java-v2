
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressActionBuilder {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public OrderSetDeliveryAddressActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public OrderSetDeliveryAddressAction build() {
        return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    public static OrderSetDeliveryAddressActionBuilder of() {
        return new OrderSetDeliveryAddressActionBuilder();
    }

    public static OrderSetDeliveryAddressActionBuilder of(final OrderSetDeliveryAddressAction template) {
        OrderSetDeliveryAddressActionBuilder builder = new OrderSetDeliveryAddressActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
