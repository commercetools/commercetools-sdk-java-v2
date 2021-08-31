
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryAddressActionBuilder implements Builder<OrderSetDeliveryAddressAction> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    public OrderSetDeliveryAddressActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public OrderSetDeliveryAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderSetDeliveryAddressAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryAddressAction.class + ": deliveryId is missing");
        return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    /**
     * builds OrderSetDeliveryAddressAction without checking for non null required values
     */
    public OrderSetDeliveryAddressAction buildUnchecked() {
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
