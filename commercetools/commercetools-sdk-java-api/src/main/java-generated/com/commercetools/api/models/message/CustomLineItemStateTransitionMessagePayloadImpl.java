
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
public final class CustomLineItemStateTransitionMessagePayloadImpl
        implements CustomLineItemStateTransitionMessagePayload {

    private String type;

    private String customLineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    @JsonCreator
    CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("fromState") final com.commercetools.api.models.state.StateReference fromState,
            @JsonProperty("toState") final com.commercetools.api.models.state.StateReference toState) {
        this.customLineItemId = customLineItemId;
        this.transitionDate = transitionDate;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.type = CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }

    public CustomLineItemStateTransitionMessagePayloadImpl() {
        this.type = CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }

    public String getType() {
        return this.type;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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
                .append(transitionDate)
                .append(quantity)
                .append(fromState)
                .append(toState)
                .toHashCode();
    }

}
