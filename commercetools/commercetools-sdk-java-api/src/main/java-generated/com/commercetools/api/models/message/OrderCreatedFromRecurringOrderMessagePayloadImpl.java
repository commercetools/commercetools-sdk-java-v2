
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
 *  <p>Generated after an Order is successfully created according to the defined schedule of a Recurring Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCreatedFromRecurringOrderMessagePayloadImpl
        implements OrderCreatedFromRecurringOrderMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Order order;

    private com.commercetools.api.models.recurring_order.RecurringOrderReference recurringOrderRef;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCreatedFromRecurringOrderMessagePayloadImpl(
            @JsonProperty("order") final com.commercetools.api.models.order.Order order,
            @JsonProperty("recurringOrderRef") final com.commercetools.api.models.recurring_order.RecurringOrderReference recurringOrderRef) {
        this.order = order;
        this.recurringOrderRef = recurringOrderRef;
        this.type = ORDER_CREATED_FROM_RECURRING_ORDER;
    }

    /**
     * create empty instance
     */
    public OrderCreatedFromRecurringOrderMessagePayloadImpl() {
        this.type = ORDER_CREATED_FROM_RECURRING_ORDER;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that was created.</p>
     */

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    /**
     *  <p>Reference to the origin <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderReference getRecurringOrderRef() {
        return this.recurringOrderRef;
    }

    public void setOrder(final com.commercetools.api.models.order.Order order) {
        this.order = order;
    }

    public void setRecurringOrderRef(
            final com.commercetools.api.models.recurring_order.RecurringOrderReference recurringOrderRef) {
        this.recurringOrderRef = recurringOrderRef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCreatedFromRecurringOrderMessagePayloadImpl that = (OrderCreatedFromRecurringOrderMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(order, that.order)
                .append(recurringOrderRef, that.recurringOrderRef)
                .append(type, that.type)
                .append(order, that.order)
                .append(recurringOrderRef, that.recurringOrderRef)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(order).append(recurringOrderRef).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("order", order)
                .append("recurringOrderRef", recurringOrderRef)
                .build();
    }

    @Override
    public OrderCreatedFromRecurringOrderMessagePayload copyDeep() {
        return OrderCreatedFromRecurringOrderMessagePayload.deepCopy(this);
    }
}
