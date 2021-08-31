
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemStateTransitionMessagePayloadBuilder
        implements Builder<LineItemStateTransitionMessagePayload> {

    private String lineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    public LineItemStateTransitionMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder transitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public LineItemStateTransitionMessagePayloadBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
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

    public LineItemStateTransitionMessagePayload build() {
        Objects.requireNonNull(lineItemId, LineItemStateTransitionMessagePayload.class + ": lineItemId is missing");
        Objects.requireNonNull(transitionDate,
            LineItemStateTransitionMessagePayload.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, LineItemStateTransitionMessagePayload.class + ": quantity is missing");
        Objects.requireNonNull(fromState, LineItemStateTransitionMessagePayload.class + ": fromState is missing");
        Objects.requireNonNull(toState, LineItemStateTransitionMessagePayload.class + ": toState is missing");
        return new LineItemStateTransitionMessagePayloadImpl(lineItemId, transitionDate, quantity, fromState, toState);
    }

    /**
     * builds LineItemStateTransitionMessagePayload without checking for non null required values
     */
    public LineItemStateTransitionMessagePayload buildUnchecked() {
        return new LineItemStateTransitionMessagePayloadImpl(lineItemId, transitionDate, quantity, fromState, toState);
    }

    public static LineItemStateTransitionMessagePayloadBuilder of() {
        return new LineItemStateTransitionMessagePayloadBuilder();
    }

    public static LineItemStateTransitionMessagePayloadBuilder of(
            final LineItemStateTransitionMessagePayload template) {
        LineItemStateTransitionMessagePayloadBuilder builder = new LineItemStateTransitionMessagePayloadBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
