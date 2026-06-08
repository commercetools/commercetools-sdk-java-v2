
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderTransitionCustomLineItemStateAction" rel="nofollow">Transition CustomLineItem State</a> update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomLineItemStateTransition")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemStateTransitionMessagePayloadImpl.class)
public interface CustomLineItemStateTransitionMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for CustomLineItemStateTransitionMessagePayload
     */
    String CUSTOM_LINE_ITEM_STATE_TRANSITION = "CustomLineItemStateTransition";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Date and time (UTC) the transition of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> was performed.</p>
     * @return transitionDate
     */
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Items</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> was transitioned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> was transitioned from.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> was transitioned to.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Date and time (UTC) the transition of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> was performed.</p>
     * @param transitionDate value to be set
     */

    public void setTransitionDate(final ZonedDateTime transitionDate);

    /**
     *  <p>Number of <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Items</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> was transitioned.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> was transitioned from.</p>
     * @param fromState value to be set
     */

    public void setFromState(final StateReference fromState);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> was transitioned to.</p>
     * @param toState value to be set
     */

    public void setToState(final StateReference toState);

    /**
     * factory method
     * @return instance of CustomLineItemStateTransitionMessagePayload
     */
    public static CustomLineItemStateTransitionMessagePayload of() {
        return new CustomLineItemStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemStateTransitionMessagePayload of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadImpl instance = new CustomLineItemStateTransitionMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    public CustomLineItemStateTransitionMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomLineItemStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemStateTransitionMessagePayload deepCopy(
            @Nullable final CustomLineItemStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomLineItemStateTransitionMessagePayloadImpl instance = new CustomLineItemStateTransitionMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(com.commercetools.api.models.state.StateReference.deepCopy(template.getFromState()));
        instance.setToState(com.commercetools.api.models.state.StateReference.deepCopy(template.getToState()));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemStateTransitionMessagePayload
     * @return builder
     */
    public static CustomLineItemStateTransitionMessagePayloadBuilder builder() {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomLineItemStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemStateTransitionMessagePayloadBuilder builder(
            final CustomLineItemStateTransitionMessagePayload template) {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemStateTransitionMessagePayload(
            Function<CustomLineItemStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemStateTransitionMessagePayload>";
            }
        };
    }
}
