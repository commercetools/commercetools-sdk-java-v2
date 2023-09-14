
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemStateTransitionMessagePayload customLineItemStateTransitionMessagePayload = CustomLineItemStateTransitionMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemStateTransitionMessagePayloadBuilder
        implements Builder<CustomLineItemStateTransitionMessagePayload> {

    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private java.time.ZonedDateTime transitionDate;

    private Long quantity;

    private com.commercetools.api.models.state.StateReference fromState;

    private com.commercetools.api.models.state.StateReference toState;

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Custom Line Item State was performed.</p>
     * @param transitionDate value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder transitionDate(
            final java.time.ZonedDateTime transitionDate) {
        this.transitionDate = transitionDate;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items for which the State was transitioned.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder fromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     * @param builder function to build the fromState value
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder withFromState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.fromState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     * @param fromState value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder fromState(
            final com.commercetools.api.models.state.StateReference fromState) {
        this.fromState = fromState;
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder toState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     * @param builder function to build the toState value
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder withToState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.toState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     * @param toState value to be set
     * @return Builder
     */

    public CustomLineItemStateTransitionMessagePayloadBuilder toState(
            final com.commercetools.api.models.state.StateReference toState) {
        this.toState = toState;
        return this;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Date and time (UTC) when the transition of the Custom Line Item State was performed.</p>
     * @return transitionDate
     */

    public java.time.ZonedDateTime getTransitionDate() {
        return this.transitionDate;
    }

    /**
     *  <p>Number of Custom Line Items for which the State was transitioned.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     * @return fromState
     */

    public com.commercetools.api.models.state.StateReference getFromState() {
        return this.fromState;
    }

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     * @return toState
     */

    public com.commercetools.api.models.state.StateReference getToState() {
        return this.toState;
    }

    /**
     * builds CustomLineItemStateTransitionMessagePayload with checking for non-null required values
     * @return CustomLineItemStateTransitionMessagePayload
     */
    public CustomLineItemStateTransitionMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            CustomLineItemStateTransitionMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(transitionDate,
            CustomLineItemStateTransitionMessagePayload.class + ": transitionDate is missing");
        Objects.requireNonNull(quantity, CustomLineItemStateTransitionMessagePayload.class + ": quantity is missing");
        Objects.requireNonNull(fromState, CustomLineItemStateTransitionMessagePayload.class + ": fromState is missing");
        Objects.requireNonNull(toState, CustomLineItemStateTransitionMessagePayload.class + ": toState is missing");
        return new CustomLineItemStateTransitionMessagePayloadImpl(customLineItemId, customLineItemKey, transitionDate,
            quantity, fromState, toState);
    }

    /**
     * builds CustomLineItemStateTransitionMessagePayload without checking for non-null required values
     * @return CustomLineItemStateTransitionMessagePayload
     */
    public CustomLineItemStateTransitionMessagePayload buildUnchecked() {
        return new CustomLineItemStateTransitionMessagePayloadImpl(customLineItemId, customLineItemKey, transitionDate,
            quantity, fromState, toState);
    }

    /**
     * factory method for an instance of CustomLineItemStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static CustomLineItemStateTransitionMessagePayloadBuilder of() {
        return new CustomLineItemStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for CustomLineItemStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemStateTransitionMessagePayloadBuilder of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadBuilder builder = new CustomLineItemStateTransitionMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.transitionDate = template.getTransitionDate();
        builder.quantity = template.getQuantity();
        builder.fromState = template.getFromState();
        builder.toState = template.getToState();
        return builder;
    }

}
