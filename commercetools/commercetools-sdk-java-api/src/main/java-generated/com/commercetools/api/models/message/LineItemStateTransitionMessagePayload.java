
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition Line Item State update action.</p>
 *
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
@JsonDeserialize(as = LineItemStateTransitionMessagePayloadImpl.class)
public interface LineItemStateTransitionMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for LineItemStateTransitionMessagePayload
     */
    String LINE_ITEM_STATE_TRANSITION = "LineItemStateTransition";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @return transitionDate
     */
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @param transitionDate value to be set
     */

    public void setTransitionDate(final ZonedDateTime transitionDate);

    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param fromState value to be set
     */

    public void setFromState(final StateReference fromState);

    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param toState value to be set
     */

    public void setToState(final StateReference toState);

    /**
     * factory method
     * @return instance of LineItemStateTransitionMessagePayload
     */
    public static LineItemStateTransitionMessagePayload of() {
        return new LineItemStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy LineItemStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemStateTransitionMessagePayload of(final LineItemStateTransitionMessagePayload template) {
        LineItemStateTransitionMessagePayloadImpl instance = new LineItemStateTransitionMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    /**
     * factory method to create a deep copy of LineItemStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemStateTransitionMessagePayload deepCopy(
            @Nullable final LineItemStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        LineItemStateTransitionMessagePayloadImpl instance = new LineItemStateTransitionMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(Optional.ofNullable(template.getFromState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setToState(Optional.ofNullable(template.getToState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LineItemStateTransitionMessagePayload
     * @return builder
     */
    public static LineItemStateTransitionMessagePayloadBuilder builder() {
        return LineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for LineItemStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemStateTransitionMessagePayloadBuilder builder(
            final LineItemStateTransitionMessagePayload template) {
        return LineItemStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemStateTransitionMessagePayload(Function<LineItemStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemStateTransitionMessagePayload>";
            }
        };
    }
}
