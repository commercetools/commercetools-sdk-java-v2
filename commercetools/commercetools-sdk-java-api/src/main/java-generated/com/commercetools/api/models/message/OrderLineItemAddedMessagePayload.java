
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderLineItemAddedMessagePayloadImpl.class)
public interface OrderLineItemAddedMessagePayload extends OrderMessagePayload {

    String ORDER_LINE_ITEM_ADDED = "OrderLineItemAdded";

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LineItem getLineItem();

    @NotNull
    @JsonProperty("addedQuantity")
    public Long getAddedQuantity();

    public void setLineItem(final LineItem lineItem);

    public void setAddedQuantity(final Long addedQuantity);

    public static OrderLineItemAddedMessagePayload of() {
        return new OrderLineItemAddedMessagePayloadImpl();
    }

    public static OrderLineItemAddedMessagePayload of(final OrderLineItemAddedMessagePayload template) {
        OrderLineItemAddedMessagePayloadImpl instance = new OrderLineItemAddedMessagePayloadImpl();
        instance.setLineItem(template.getLineItem());
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    public static OrderLineItemAddedMessagePayloadBuilder builder() {
        return OrderLineItemAddedMessagePayloadBuilder.of();
    }

    public static OrderLineItemAddedMessagePayloadBuilder builder(final OrderLineItemAddedMessagePayload template) {
        return OrderLineItemAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderLineItemAddedMessagePayload(Function<OrderLineItemAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemAddedMessagePayload>";
            }
        };
    }
}
