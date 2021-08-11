
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLineItemAddedMessagePayloadBuilder implements Builder<OrderLineItemAddedMessagePayload> {

    private com.commercetools.api.models.cart.LineItem lineItem;

    private Long addedQuantity;

    public OrderLineItemAddedMessagePayloadBuilder lineItem(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build();
        return this;
    }

    public OrderLineItemAddedMessagePayloadBuilder lineItem(final com.commercetools.api.models.cart.LineItem lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public OrderLineItemAddedMessagePayloadBuilder addedQuantity(final Long addedQuantity) {
        this.addedQuantity = addedQuantity;
        return this;
    }

    public com.commercetools.api.models.cart.LineItem getLineItem() {
        return this.lineItem;
    }

    public Long getAddedQuantity() {
        return this.addedQuantity;
    }

    public OrderLineItemAddedMessagePayload build() {
        Objects.requireNonNull(lineItem, OrderLineItemAddedMessagePayload.class + ": lineItem is missing");
        Objects.requireNonNull(addedQuantity, OrderLineItemAddedMessagePayload.class + ": addedQuantity is missing");
        return new OrderLineItemAddedMessagePayloadImpl(lineItem, addedQuantity);
    }

    /**
     * builds OrderLineItemAddedMessagePayload without checking for non null required values
     */
    public OrderLineItemAddedMessagePayload buildUnchecked() {
        return new OrderLineItemAddedMessagePayloadImpl(lineItem, addedQuantity);
    }

    public static OrderLineItemAddedMessagePayloadBuilder of() {
        return new OrderLineItemAddedMessagePayloadBuilder();
    }

    public static OrderLineItemAddedMessagePayloadBuilder of(final OrderLineItemAddedMessagePayload template) {
        OrderLineItemAddedMessagePayloadBuilder builder = new OrderLineItemAddedMessagePayloadBuilder();
        builder.lineItem = template.getLineItem();
        builder.addedQuantity = template.getAddedQuantity();
        return builder;
    }

}
