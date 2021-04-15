
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemStateTransitionMessagePayloadBuilder {

    private String customLineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CustomLineItemStateTransitionMessagePayloadBuilder transitionDate(
            final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    public CustomLineItemStateTransitionMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CustomLineItemStateTransitionMessagePayloadBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    public CustomLineItemStateTransitionMessagePayloadBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
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

    public CustomLineItemStateTransitionMessagePayload build() {
        return new CustomLineItemStateTransitionMessagePayloadImpl(customLineItemId, transitionDate, quantity,
            fromState, toState);
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder of() {
        return new CustomLineItemStateTransitionMessagePayloadBuilder();
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadBuilder builder = new CustomLineItemStateTransitionMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
