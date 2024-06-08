
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction extends CartUpdateAction {

    /**
     * discriminator value for CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     */
    String APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS = "applyDeltaToCustomLineItemShippingDetailsTargets";

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
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @return targetsDelta
     */
    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

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
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta values to be set
     */

    @JsonIgnore
    public void setTargetsDelta(final ItemShippingTarget... targetsDelta);

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @param targetsDelta values to be set
     */

    public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);

    /**
     * factory method
     * @return instance of CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction of() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
    }

    /**
     * factory method to create a shallow copy CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction of(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction deepCopy(
            @Nullable final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        if (template == null) {
            return null;
        }
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setTargetsDelta(Optional.ofNullable(template.getTargetsDelta())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.ItemShippingTarget::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
     * @return builder
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder() {
        return CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of();
    }

    /**
     * create builder for CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        return CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartApplyDeltaToCustomLineItemShippingDetailsTargetsAction(
            Function<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction>";
            }
        };
    }
}
