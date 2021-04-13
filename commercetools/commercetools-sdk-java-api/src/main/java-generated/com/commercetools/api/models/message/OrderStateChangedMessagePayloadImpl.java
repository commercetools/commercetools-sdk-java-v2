
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
public final class OrderStateChangedMessagePayloadImpl implements OrderStateChangedMessagePayload {

    private String type;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.order.OrderState oldOrderState;

    @JsonCreator
    OrderStateChangedMessagePayloadImpl(
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("oldOrderState") final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.orderState = orderState;
        this.oldOrderState = oldOrderState;
        this.type = ORDER_STATE_CHANGED;
    }

    public OrderStateChangedMessagePayloadImpl() {
        this.type = ORDER_STATE_CHANGED;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public com.commercetools.api.models.order.OrderState getOldOrderState() {
        return this.oldOrderState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setOldOrderState(final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.oldOrderState = oldOrderState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderStateChangedMessagePayloadImpl that = (OrderStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(orderState, that.orderState)
                .append(oldOrderState, that.oldOrderState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(orderState).append(oldOrderState).toHashCode();
    }

}
