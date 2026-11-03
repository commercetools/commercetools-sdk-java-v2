
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action. This Message is generated when the request is accepted, not when the Order is created. The resulting Order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCreatedFromRecurringOrderMessage" rel="nofollow">OrderCreatedFromRecurringOrder</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderNowRequestedMessagePayloadImpl
        implements RecurringOrderNowRequestedMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime requestedAt;

    private String reason;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderNowRequestedMessagePayloadImpl(@JsonProperty("requestedAt") final java.time.ZonedDateTime requestedAt,
            @JsonProperty("reason") final String reason) {
        this.requestedAt = requestedAt;
        this.reason = reason;
        this.type = RECURRING_ORDER_NOW_REQUESTED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderNowRequestedMessagePayloadImpl() {
        this.type = RECURRING_ORDER_NOW_REQUESTED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     */

    public java.time.ZonedDateTime getRequestedAt() {
        return this.requestedAt;
    }

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     */

    public String getReason() {
        return this.reason;
    }

    public void setRequestedAt(final java.time.ZonedDateTime requestedAt) {
        this.requestedAt = requestedAt;
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

        RecurringOrderNowRequestedMessagePayloadImpl that = (RecurringOrderNowRequestedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(requestedAt, that.requestedAt)
                .append(reason, that.reason)
                .append(type, that.type)
                .append(requestedAt, that.requestedAt)
                .append(reason, that.reason)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(requestedAt).append(reason).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("requestedAt", requestedAt)
                .append("reason", reason)
                .build();
    }

    @Override
    public RecurringOrderNowRequestedMessagePayload copyDeep() {
        return RecurringOrderNowRequestedMessagePayload.deepCopy(this);
    }
}
