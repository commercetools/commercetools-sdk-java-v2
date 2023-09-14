
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderTransitionLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionLineItemStateAction stagedOrderTransitionLineItemStateAction = StagedOrderTransitionLineItemStateAction.builder()
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderTransitionLineItemStateActionBuilder
        implements Builder<StagedOrderTransitionLineItemStateAction> {

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
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Number of Line Items that should transition State.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State the Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item should transition from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder withFromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item should transition from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>State the Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item should transition to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder withToState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item should transition to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Date and time (UTC) to perform the State transition.</p>
     * @param actualTransitionDate value to be set
     * @return Builder
     */

    public StagedOrderTransitionLineItemStateActionBuilder actualTransitionDate(
            @Nullable final java.time.ZonedDateTime actualTransitionDate) {
        this.actualTransitionDate = actualTransitionDate;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Number of Line Items that should transition State.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Line Item should transition from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Line Item should transition to.</p>
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
     * builds StagedOrderTransitionLineItemStateAction with checking for non-null required values
     * @return StagedOrderTransitionLineItemStateAction
     */
    public StagedOrderTransitionLineItemStateAction build() {
        Objects.requireNonNull(quantity, StagedOrderTransitionLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState, StagedOrderTransitionLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, StagedOrderTransitionLineItemStateAction.class + ": toState is missing");
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, lineItemKey, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds StagedOrderTransitionLineItemStateAction without checking for non-null required values
     * @return StagedOrderTransitionLineItemStateAction
     */
    public StagedOrderTransitionLineItemStateAction buildUnchecked() {
        return new StagedOrderTransitionLineItemStateActionImpl(lineItemId, lineItemKey, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * factory method for an instance of StagedOrderTransitionLineItemStateActionBuilder
     * @return builder
     */
    public static StagedOrderTransitionLineItemStateActionBuilder of() {
        return new StagedOrderTransitionLineItemStateActionBuilder();
    }

    /**
     * create builder for StagedOrderTransitionLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderTransitionLineItemStateActionBuilder of(
            final StagedOrderTransitionLineItemStateAction template) {
        StagedOrderTransitionLineItemStateActionBuilder builder = new StagedOrderTransitionLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
