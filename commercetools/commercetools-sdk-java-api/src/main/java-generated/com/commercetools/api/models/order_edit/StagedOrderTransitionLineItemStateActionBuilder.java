
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderTransitionLineItemStateActionBuilder
        implements Builder<StagedOrderTransitionLineItemStateAction> {

    private String lineItemId;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    public StagedOrderTransitionLineItemStateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    public StagedOrderTransitionLineItemStateActionBuilder actualTransitionDate(
            @Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getFromState() {
        return this.fromState;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getToState() {
        return this.toState;
    }

    @Nullable
    public java.time.ZonedDateTime getActualTransitionDate() {
        return this.actualTransitionDate;
    }

    public StagedOrderTransitionLineItemStateAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderTransitionLineItemStateAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, StagedOrderTransitionLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, StagedOrderTransitionLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, StagedOrderTransitionLineItemStateAction.class + ": toState is missing");
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds StagedOrderTransitionLineItemStateAction without checking for non null required values
     */
    public StagedOrderTransitionLineItemStateAction buildUnchecked() {
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    public static StagedOrderTransitionLineItemStateActionBuilder of() {
        return new StagedOrderTransitionLineItemStateActionBuilder();
    }

    public static StagedOrderTransitionLineItemStateActionBuilder of(
            final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionBuilder builder = new StagedOrderTransitionLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
