
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Change OrderState update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderStateChangedMessagePayloadImpl implements OrderStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.order.OrderState oldOrderState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderStateChangedMessagePayloadImpl(
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("oldOrderState") final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.orderState = orderState;
        this.oldOrderState = oldOrderState;
        this.type = ORDER_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public OrderStateChangedMessagePayloadImpl() {
        this.type = ORDER_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     */

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
                .append(type, that.type)
                .append(orderState, that.orderState)
                .append(oldOrderState, that.oldOrderState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(orderState).append(oldOrderState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("orderState", orderState)
                .append("oldOrderState", oldOrderState)
                .build();
    }

    @Override
    public OrderStateChangedMessagePayload copyDeep() {
        return OrderStateChangedMessagePayload.deepCopy(this);
    }
}
