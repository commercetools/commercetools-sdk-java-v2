
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
@JsonDeserialize(as = OrderLineItemAddedMessageImpl.class)
public interface OrderLineItemAddedMessage extends Message {

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

    public static OrderLineItemAddedMessage of() {
        return new OrderLineItemAddedMessageImpl();
    }

    public static OrderLineItemAddedMessage of(final OrderLineItemAddedMessage template) {
        OrderLineItemAddedMessageImpl instance = new OrderLineItemAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setLineItem(template.getLineItem());
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    public static OrderLineItemAddedMessageBuilder builder() {
        return OrderLineItemAddedMessageBuilder.of();
    }

    public static OrderLineItemAddedMessageBuilder builder(final OrderLineItemAddedMessage template) {
        return OrderLineItemAddedMessageBuilder.of(template);
    }

    default <T> T withOrderLineItemAddedMessage(Function<OrderLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
