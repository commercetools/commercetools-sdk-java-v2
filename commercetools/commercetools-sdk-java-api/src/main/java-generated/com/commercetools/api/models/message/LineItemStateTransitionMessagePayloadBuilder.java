
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemStateTransitionMessagePayload lineItemStateTransitionMessagePayload = LineItemStateTransitionMessagePayload.builder()
 *             .lineItemId("{lineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemStateTransitionMessagePayloadBuilder implements Builder<LineItemStateTransitionMessagePayload> {

    private String lineItemId;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @param transitionDate value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder transitionDate(final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder withFromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder withToState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public LineItemStateTransitionMessagePayloadBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @return transitionDate
     */

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @return toState
     */

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    /**
     * builds LineItemStateTransitionMessagePayload with checking for non-null required values
     * @return LineItemStateTransitionMessagePayload
     */
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
     * builds LineItemStateTransitionMessagePayload without checking for non-null required values
     * @return LineItemStateTransitionMessagePayload
     */
    public LineItemStateTransitionMessagePayload buildUnchecked() {
        return new LineItemStateTransitionMessagePayloadImpl(lineItemId, transitionDate, quantity, fromState, toState);
    }

    /**
     * factory method for an instance of LineItemStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static LineItemStateTransitionMessagePayloadBuilder of() {
        return new LineItemStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for LineItemStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
