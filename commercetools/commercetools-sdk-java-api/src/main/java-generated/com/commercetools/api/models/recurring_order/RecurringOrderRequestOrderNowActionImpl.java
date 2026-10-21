
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Requests the creation of the next Order of the Recurring Order immediately, instead of waiting for <code>nextOrderAt</code>. The early Order consumes the upcoming occurrence: the number of Orders over time does not change, and the recurrence schedule does not shift.</p>
 *  <p>The request is processed asynchronously. The response contains the updated Recurring Order with the original <code>nextOrderAt</code>. After the request is accepted, the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message is generated. The Order is then created through the regular Recurring Order process, which generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCreatedFromRecurringOrderMessage" rel="nofollow">OrderCreatedFromRecurringOrder</a> Message. Only after that, <code>lastOrderAt</code> and <code>nextOrderAt</code> are updated.</p>
 *  <p>If the Order creation fails, the occurrence is not consumed and <code>nextOrderAt</code> remains unchanged.</p>
 *  <p>Returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error in the following situations:</p>
 *  <ul>
 *   <li>The Recurring Order is not active, has expired, or has not started yet.</li>
 *   <li>There is no upcoming Order to bring forward, or the upcoming Order falls on or after <code>expiresAt</code>.</li>
 *   <li>A <a href="https://docs.commercetools.com/apis/ctp:api:type:SkipConfiguration" rel="nofollow">Skip Configuration</a> still has Orders left to skip.</li>
 *   <li>The Recurring Order is currently processing an Order, including one that awaits a Checkout payment.</li>
 *   <li>Fewer days than the <code>minDaysBetweenOrders</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> have passed since <code>lastOrderAt</code>.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderRequestOrderNowActionImpl implements RecurringOrderRequestOrderNowAction, ModelBase {

    private String action;

    private String reason;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderRequestOrderNowActionImpl(@JsonProperty("reason") final String reason) {
        this.reason = reason;
        this.action = REQUEST_ORDER_NOW;
    }

    /**
     * create empty instance
     */
    public RecurringOrderRequestOrderNowActionImpl() {
        this.action = REQUEST_ORDER_NOW;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Note recorded on the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderNowRequestedMessage" rel="nofollow">RecurringOrderNowRequested</a> Message.</p>
     *  <p>If <code>reason</code> is longer than 256 characters, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     */

    public String getReason() {
        return this.reason;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderRequestOrderNowActionImpl that = (RecurringOrderRequestOrderNowActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(reason, that.reason)
                .append(action, that.action)
                .append(reason, that.reason)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(reason).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("reason", reason)
                .build();
    }

    @Override
    public RecurringOrderRequestOrderNowAction copyDeep() {
        return RecurringOrderRequestOrderNowAction.deepCopy(this);
    }
}
