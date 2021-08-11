
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderShippingInfoSetMessagePayloadBuilder implements Builder<OrderShippingInfoSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo oldShippingInfo;

    public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.oldShippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(
            @Nullable final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.oldShippingInfo = oldShippingInfo;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getOldShippingInfo() {
        return this.oldShippingInfo;
    }

    public OrderShippingInfoSetMessagePayload build() {
        return new OrderShippingInfoSetMessagePayloadImpl(shippingInfo, oldShippingInfo);
    }

    /**
     * builds OrderShippingInfoSetMessagePayload without checking for non null required values
     */
    public OrderShippingInfoSetMessagePayload buildUnchecked() {
        return new OrderShippingInfoSetMessagePayloadImpl(shippingInfo, oldShippingInfo);
    }

    public static OrderShippingInfoSetMessagePayloadBuilder of() {
        return new OrderShippingInfoSetMessagePayloadBuilder();
    }

    public static OrderShippingInfoSetMessagePayloadBuilder of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadBuilder builder = new OrderShippingInfoSetMessagePayloadBuilder();
        builder.shippingInfo = template.getShippingInfo();
        builder.oldShippingInfo = template.getOldShippingInfo();
        return builder;
    }

}
