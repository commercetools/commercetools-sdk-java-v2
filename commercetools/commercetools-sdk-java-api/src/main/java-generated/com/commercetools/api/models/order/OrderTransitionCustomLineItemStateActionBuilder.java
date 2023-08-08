
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionCustomLineItemStateAction orderTransitionCustomLineItemStateAction = OrderTransitionCustomLineItemStateAction.builder()
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderTransitionCustomLineItemStateActionBuilder
        implements Builder<OrderTransitionCustomLineItemStateAction> {

    @Nullable
    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder customLineItemId(@Nullable final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder customLineItemKey(@Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items that should transition State.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder withFromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder withToState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Date and time (UTC) to perform the State transition.</p>
     * @param actualTransitionDate value to be set
     * @return Builder
     */

    public OrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(
            @Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @Nullable
    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Number of Custom Line Items that should transition State.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @return toState
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getToState() {
        return this.toState;
    }

    /**
     *  <p>Date and time (UTC) to perform the State transition.</p>
     * @return actualTransitionDate
     */

    @Nullable
    public java.time.ZonedDateTime getActualTransitionDate() {
        return this.actualTransitionDate;
    }

    /**
     * builds OrderTransitionCustomLineItemStateAction with checking for non-null required values
     * @return OrderTransitionCustomLineItemStateAction
     */
    public OrderTransitionCustomLineItemStateAction build() {
        Objects.requireNonNull(quantity, OrderTransitionCustomLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, OrderTransitionCustomLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, OrderTransitionCustomLineItemStateAction.class + ": toState is missing");
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, customLineItemKey, quantity,
            fromState, toState, actualTransitionDate);
    }

    /**
     * builds OrderTransitionCustomLineItemStateAction without checking for non-null required values
     * @return OrderTransitionCustomLineItemStateAction
     */
    public OrderTransitionCustomLineItemStateAction buildUnchecked() {
        return new OrderTransitionCustomLineItemStateActionImpl(customLineItemId, customLineItemKey, quantity,
            fromState, toState, actualTransitionDate);
    }

    /**
     * factory method for an instance of OrderTransitionCustomLineItemStateActionBuilder
     * @return builder
     */
    public static OrderTransitionCustomLineItemStateActionBuilder of() {
        return new OrderTransitionCustomLineItemStateActionBuilder();
    }

    /**
     * create builder for OrderTransitionCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderTransitionCustomLineItemStateActionBuilder of(
            final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionBuilder builder = new OrderTransitionCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
