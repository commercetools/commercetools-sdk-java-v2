
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Custom Line Item State Transition Message.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("transitionCustomLineItemState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderTransitionCustomLineItemStateActionImpl.class)
public interface OrderTransitionCustomLineItemStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderTransitionCustomLineItemStateAction
     */
    String TRANSITION_CUSTOM_LINE_ITEM_STATE = "transitionCustomLineItemState";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Number of Custom Line Items that should transition State.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    /**
     *  <p>Date and time (UTC) to perform the State transition.</p>
     * @return actualTransitionDate
     */

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Number of Custom Line Items that should transition State.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>State the Custom Line Item should transition from.</p>
     * @param fromState value to be set
     */

    public void setFromState(final StateResourceIdentifier fromState);

    /**
     *  <p>State the Custom Line Item should transition to.</p>
     * @param toState value to be set
     */

    public void setToState(final StateResourceIdentifier toState);

    /**
     *  <p>Date and time (UTC) to perform the State transition.</p>
     * @param actualTransitionDate value to be set
     */

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    /**
     * factory method
     * @return instance of OrderTransitionCustomLineItemStateAction
     */
    public static OrderTransitionCustomLineItemStateAction of() {
        return new OrderTransitionCustomLineItemStateActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderTransitionCustomLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderTransitionCustomLineItemStateAction of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionImpl instance = new OrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public OrderTransitionCustomLineItemStateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderTransitionCustomLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderTransitionCustomLineItemStateAction deepCopy(
            @Nullable final OrderTransitionCustomLineItemStateAction template) {
        if (template == null) {
            return null;
        }
        OrderTransitionCustomLineItemStateActionImpl instance = new OrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(
            com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getFromState()));
        instance.setToState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getToState()));
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    /**
     * builder factory method for OrderTransitionCustomLineItemStateAction
     * @return builder
     */
    public static OrderTransitionCustomLineItemStateActionBuilder builder() {
        return OrderTransitionCustomLineItemStateActionBuilder.of();
    }

    /**
     * create builder for OrderTransitionCustomLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderTransitionCustomLineItemStateActionBuilder builder(
            final OrderTransitionCustomLineItemStateAction template) {
        return OrderTransitionCustomLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderTransitionCustomLineItemStateAction(
            Function<OrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderTransitionCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderTransitionCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderTransitionCustomLineItemStateAction>";
            }
        };
    }
}
