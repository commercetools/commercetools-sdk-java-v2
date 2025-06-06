
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
 *  <p>Generated after a successful Transition CustomLineItem State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemStateTransitionMessagePayloadImpl
        implements CustomLineItemStateTransitionMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private String customLineItemKey;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("fromState") final com.commercetools.api.models.state.StateReference fromState,
            @JsonProperty("toState") final com.commercetools.api.models.state.StateReference toState) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.transitionDate = transitionDate;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.type = CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public CustomLineItemStateTransitionMessagePayloadImpl() {
        this.type = CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Date and time (UTC) the transition of the Custom Line Item State was performed.</p>
     */

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    /**
     *  <p>Number of Custom Line Items for which the State was transitioned.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     */

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     */

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setTransitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setFromState(final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
    }

    public void setToState(final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemStateTransitionMessagePayloadImpl that = (CustomLineItemStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(transitionDate, that.transitionDate)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(transitionDate, that.transitionDate)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(transitionDate)
                .append(quantity)
                .append(fromState)
                .append(toState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("transitionDate", transitionDate)
                .append("quantity", quantity)
                .append("fromState", fromState)
                .append("toState", toState)
                .build();
    }

    @Override
    public CustomLineItemStateTransitionMessagePayload copyDeep() {
        return CustomLineItemStateTransitionMessagePayload.deepCopy(this);
    }
}
