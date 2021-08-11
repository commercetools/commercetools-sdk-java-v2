
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderTransitionLineItemStateActionBuilder implements Builder<OrderTransitionLineItemStateAction> {

    private String lineItemId;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    public OrderTransitionLineItemStateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    public OrderTransitionLineItemStateActionBuilder actualTransitionDate(
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

    public OrderTransitionLineItemStateAction build() {
        Objects.requireNonNull(lineItemId, OrderTransitionLineItemStateAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, OrderTransitionLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, OrderTransitionLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, OrderTransitionLineItemStateAction.class + ": toState is missing");
        return new OrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds OrderTransitionLineItemStateAction without checking for non null required values
     */
    public OrderTransitionLineItemStateAction buildUnchecked() {
        return new OrderTransitionLineItemStateActionImpl(lineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    public static OrderTransitionLineItemStateActionBuilder of() {
        return new OrderTransitionLineItemStateActionBuilder();
    }

    public static OrderTransitionLineItemStateActionBuilder of(final OrderTransitionLineItemStateAction template) {
        OrderTransitionLineItemStateActionBuilder builder = new OrderTransitionLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
