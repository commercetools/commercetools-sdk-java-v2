
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderTransitionLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderTransitionLineItemStateAction orderTransitionLineItemStateAction = OrderTransitionLineItemStateAction.builder()
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderTransitionLineItemStateActionBuilder implements Builder<OrderTransitionLineItemStateAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Number of Line Items that should transition <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder withFromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder withToState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Date and time (UTC) to perform the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition.</p>
     * @param actualTransitionDate value to be set
     * @return Builder
     */

    public OrderTransitionLineItemStateActionBuilder actualTransitionDate(
            @Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Number of Line Items that should transition <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getFromState() {
        return this.fromState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the Line Item should transition to.</p>
     * @return toState
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getToState() {
        return this.toState;
    }

    /**
     *  <p>Date and time (UTC) to perform the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition.</p>
     * @return actualTransitionDate
     */

    @Nullable
    public java.time.ZonedDateTime getActualTransitionDate() {
        return this.actualTransitionDate;
    }

    /**
     * builds OrderTransitionLineItemStateAction with checking for non-null required values
     * @return OrderTransitionLineItemStateAction
     */
    public OrderTransitionLineItemStateAction build() {
        Objects.requireNonNull(quantity, OrderTransitionLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, OrderTransitionLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, OrderTransitionLineItemStateAction.class + ": toState is missing");
        return new OrderTransitionLineItemStateActionImpl(lineItemId, lineItemKey, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds OrderTransitionLineItemStateAction without checking for non-null required values
     * @return OrderTransitionLineItemStateAction
     */
    public OrderTransitionLineItemStateAction buildUnchecked() {
        return new OrderTransitionLineItemStateActionImpl(lineItemId, lineItemKey, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * factory method for an instance of OrderTransitionLineItemStateActionBuilder
     * @return builder
     */
    public static OrderTransitionLineItemStateActionBuilder of() {
        return new OrderTransitionLineItemStateActionBuilder();
    }

    /**
     * create builder for OrderTransitionLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderTransitionLineItemStateActionBuilder of(final OrderTransitionLineItemStateAction template) {
        OrderTransitionLineItemStateActionBuilder builder = new OrderTransitionLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
