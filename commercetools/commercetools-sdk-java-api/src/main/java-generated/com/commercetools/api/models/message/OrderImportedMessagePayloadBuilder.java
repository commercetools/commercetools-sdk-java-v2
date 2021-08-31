
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportedMessagePayloadBuilder implements Builder<OrderImportedMessagePayload> {

    private com.commercetools.api.models.order.Order order;

    public OrderImportedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    public OrderImportedMessagePayloadBuilder order(final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    public OrderImportedMessagePayload build() {
        Objects.requireNonNull(order, OrderImportedMessagePayload.class + ": order is missing");
        return new OrderImportedMessagePayloadImpl(order);
    }

    /**
     * builds OrderImportedMessagePayload without checking for non null required values
     */
    public OrderImportedMessagePayload buildUnchecked() {
        return new OrderImportedMessagePayloadImpl(order);
    }

    public static OrderImportedMessagePayloadBuilder of() {
        return new OrderImportedMessagePayloadBuilder();
    }

    public static OrderImportedMessagePayloadBuilder of(final OrderImportedMessagePayload template) {
        OrderImportedMessagePayloadBuilder builder = new OrderImportedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
