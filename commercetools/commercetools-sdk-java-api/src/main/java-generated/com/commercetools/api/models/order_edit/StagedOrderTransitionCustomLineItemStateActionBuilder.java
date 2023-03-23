
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderTransitionCustomLineItemStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderTransitionCustomLineItemStateAction stagedOrderTransitionCustomLineItemStateAction = StagedOrderTransitionCustomLineItemStateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderTransitionCustomLineItemStateActionBuilder
        implements Builder<StagedOrderTransitionCustomLineItemStateAction> {

    private String customLineItemId;

    private Long quantity;

    private com.commercetools.api.models.state.StateResourceIdentifier fromState;

    private com.commercetools.api.models.state.StateResourceIdentifier toState;

    @Nullable
    private java.time.ZonedDateTime actualTransitionDate;

    /**
     *
     * @param customLineItemId
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     * @param quantity
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder fromState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param fromState
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder fromState(
            final com.commercetools.api.models.state.StateResourceIdentifier fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder toState(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @param toState
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder toState(
            final com.commercetools.api.models.state.StateResourceIdentifier toState) {
        this.toState = toState;
        return this;
    }

    /**
     *
     * @param actualTransitionDate
     * @return Builder
     */

    public StagedOrderTransitionCustomLineItemStateActionBuilder actualTransitionDate(
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

    public StagedOrderTransitionCustomLineItemStateAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderTransitionCustomLineItemStateAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity,
            StagedOrderTransitionCustomLineItemStateAction.class + ": quantity is missing");
        Objects.requireNonNull(fromState,
            StagedOrderTransitionCustomLineItemStateAction.class + ": fromState is missing");
        Objects.requireNonNull(toState, StagedOrderTransitionCustomLineItemStateAction.class + ": toState is missing");
        return new StagedOrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    /**
     * builds StagedOrderTransitionCustomLineItemStateAction without checking for non null required values
     */
    public StagedOrderTransitionCustomLineItemStateAction buildUnchecked() {
        return new StagedOrderTransitionCustomLineItemStateActionImpl(customLineItemId, quantity, fromState, toState,
            actualTransitionDate);
    }

    public static StagedOrderTransitionCustomLineItemStateActionBuilder of() {
        return new StagedOrderTransitionCustomLineItemStateActionBuilder();
    }

    public static StagedOrderTransitionCustomLineItemStateActionBuilder of(
            final StagedOrderTransitionCustomLineItemStateAction template) {
        StagedOrderTransitionCustomLineItemStateActionBuilder builder = new StagedOrderTransitionCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        builder.actualTransitionDate = template.getActualTransitionDate();
        return builder;
    }

}
