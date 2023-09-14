
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

/**
 *  <p>Generated after a successful Transition LineItem State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemStateTransitionMessagePayloadImpl implements LineItemStateTransitionMessagePayload, ModelBase {

    private String type;

    private String lineItemId;

    private String lineItemKey;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemStateTransitionMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("fromState") final com.commercetools.api.models.state.StateReference fromState,
            @JsonProperty("toState") final com.commercetools.api.models.state.StateReference toState) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.transitionDate = transitionDate;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.type = LINE_ITEM_STATE_TRANSITION;
    }

    /**
     * create empty instance
     */
    public LineItemStateTransitionMessagePayloadImpl() {
        this.type = LINE_ITEM_STATE_TRANSITION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     */

    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     */

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     */

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     */

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
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

        LineItemStateTransitionMessagePayloadImpl that = (LineItemStateTransitionMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(transitionDate, that.transitionDate)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(transitionDate, that.transitionDate)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(lineItemId)
                .append(lineItemKey)
                .append(transitionDate)
                .append(quantity)
                .append(fromState)
                .append(toState)
                .toHashCode();
    }

}
