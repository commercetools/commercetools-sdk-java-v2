
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
 *  <p>Generated after a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> failed to process an Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderFailedMessagePayloadImpl implements RecurringOrderFailedMessagePayload, ModelBase {

    private String type;

    private String cartId;

    private java.time.ZonedDateTime failedAt;

    private String failureReason;

    private java.time.ZonedDateTime orderScheduledAt;

    private java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderFailedMessagePayloadImpl(@JsonProperty("cartId") final String cartId,
            @JsonProperty("failedAt") final java.time.ZonedDateTime failedAt,
            @JsonProperty("failureReason") final String failureReason,
            @JsonProperty("orderScheduledAt") final java.time.ZonedDateTime orderScheduledAt,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors) {
        this.cartId = cartId;
        this.failedAt = failedAt;
        this.failureReason = failureReason;
        this.orderScheduledAt = orderScheduledAt;
        this.errors = errors;
        this.type = RECURRING_ORDER_FAILED;
    }

    /**
     * create empty instance
     */
    public RecurringOrderFailedMessagePayloadImpl() {
        this.type = RECURRING_ORDER_FAILED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     */

    public java.time.ZonedDateTime getFailedAt() {
        return this.failedAt;
    }

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     */

    public java.time.ZonedDateTime getOrderScheduledAt() {
        return this.orderScheduledAt;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     */

    public java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> getErrors() {
        return this.errors;
    }

    public void setCartId(final String cartId) {
        this.cartId = cartId;
    }

    public void setFailedAt(final java.time.ZonedDateTime failedAt) {
        this.failedAt = failedAt;
    }

    public void setFailureReason(final String failureReason) {
        this.failureReason = failureReason;
    }

    public void setOrderScheduledAt(final java.time.ZonedDateTime orderScheduledAt) {
        this.orderScheduledAt = orderScheduledAt;
    }

    public void setErrors(final com.commercetools.api.models.error.RecurringOrderFailureError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderFailedMessagePayloadImpl that = (RecurringOrderFailedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(cartId, that.cartId)
                .append(failedAt, that.failedAt)
                .append(failureReason, that.failureReason)
                .append(orderScheduledAt, that.orderScheduledAt)
                .append(errors, that.errors)
                .append(type, that.type)
                .append(cartId, that.cartId)
                .append(failedAt, that.failedAt)
                .append(failureReason, that.failureReason)
                .append(orderScheduledAt, that.orderScheduledAt)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(cartId)
                .append(failedAt)
                .append(failureReason)
                .append(orderScheduledAt)
                .append(errors)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("cartId", cartId)
                .append("failedAt", failedAt)
                .append("failureReason", failureReason)
                .append("orderScheduledAt", orderScheduledAt)
                .append("errors", errors)
                .build();
    }

    @Override
    public RecurringOrderFailedMessagePayload copyDeep() {
        return RecurringOrderFailedMessagePayload.deepCopy(this);
    }
}
