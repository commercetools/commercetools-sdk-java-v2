
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
 *  <p>To override the shipping details, see Set LineItem ShippingDetails.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartApplyDeltaToLineItemShippingDetailsTargetsAction cartApplyDeltaToLineItemShippingDetailsTargetsAction = CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
 *             .plusTargetsDelta(targetsDeltaBuilder -> targetsDeltaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToLineItemShippingDetailsTargetsAction extends CartUpdateAction {

    /**
     * discriminator value for CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    String APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS = "applyDeltaToLineItemShippingDetailsTargets";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     * @return targetsDelta
     */
    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

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
     * @return instance of CartApplyDeltaToLineItemShippingDetailsTargetsAction
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsAction of() {
        return new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
    }

    /**
     * factory method to create a shallow copy CartApplyDeltaToLineItemShippingDetailsTargetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsAction of(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartApplyDeltaToLineItemShippingDetailsTargetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartApplyDeltaToLineItemShippingDetailsTargetsAction deepCopy(
            @Nullable final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        if (template == null) {
            return null;
        }
        CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToLineItemShippingDetailsTargetsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setTargetsDelta(Optional.ofNullable(template.getTargetsDelta())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.ItemShippingTarget::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartApplyDeltaToLineItemShippingDetailsTargetsAction
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder() {
        return CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of();
    }

    /**
     * create builder for CartApplyDeltaToLineItemShippingDetailsTargetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder(
            final CartApplyDeltaToLineItemShippingDetailsTargetsAction template) {
        return CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartApplyDeltaToLineItemShippingDetailsTargetsAction(
            Function<CartApplyDeltaToLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartApplyDeltaToLineItemShippingDetailsTargetsAction>";
            }
        };
    }
}
