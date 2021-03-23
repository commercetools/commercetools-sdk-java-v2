
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderLineItemAddedMessagePayloadImpl implements OrderLineItemAddedMessagePayload {

    private String type;

    private com.commercetools.api.models.cart.LineItem lineItem;

    private Long addedQuantity;

    @JsonCreator
    OrderLineItemAddedMessagePayloadImpl(
            @JsonProperty("lineItem") final com.commercetools.api.models.cart.LineItem lineItem,
            @JsonProperty("addedQuantity") final Long addedQuantity) {
        this.lineItem = lineItem;
        this.addedQuantity = addedQuantity;
        this.type = ORDER_LINE_ITEM_ADDED;
    }

    public OrderLineItemAddedMessagePayloadImpl() {
        this.type = ORDER_LINE_ITEM_ADDED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.cart.LineItem getLineItem() {
        return this.lineItem;
    }

    public Long getAddedQuantity() {
        return this.addedQuantity;
    }

    public void setLineItem(final com.commercetools.api.models.cart.LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public void setAddedQuantity(final Long addedQuantity) {
        this.addedQuantity = addedQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemAddedMessagePayloadImpl that = (OrderLineItemAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lineItem, that.lineItem)
                .append(addedQuantity, that.addedQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lineItem).append(addedQuantity).toHashCode();
    }

}
