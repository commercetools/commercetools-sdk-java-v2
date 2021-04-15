
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLineItemAddedMessagePayloadBuilder {

    private com.commercetools.api.models.cart.LineItem lineItem;

    private Long addedQuantity;

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
