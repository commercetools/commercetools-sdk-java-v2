
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderTransitionCustomLineItemStateActionBuilder
        implements Builder<OrderTransitionCustomLineItemStateAction> {

    private String customLineItemId;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    public OrderTransitionCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    public OrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(
            @Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
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

    public OrderTransitionCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId,
            OrderTransitionCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, OrderTransitionCustomLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, OrderTransitionCustomLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, OrderTransitionCustomLineItemStateAction.class + ": toState is missing");
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds OrderTransitionCustomLineItemStateAction without checking for non null required values
     */
    public OrderTransitionCustomLineItemStateAction buildUnchecked() {
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    public static OrderTransitionCustomLineItemStateActionBuilder of() {
        return new OrderTransitionCustomLineItemStateActionBuilder();
    }

    public static OrderTransitionCustomLineItemStateActionBuilder of(
            final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionBuilder builder = new OrderTransitionCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
