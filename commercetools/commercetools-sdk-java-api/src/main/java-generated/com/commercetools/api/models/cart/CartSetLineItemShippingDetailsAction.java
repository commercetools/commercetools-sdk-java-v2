
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * CartSetLineItemShippingDetailsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemShippingDetailsAction cartSetLineItemShippingDetailsAction = CartSetLineItemShippingDetailsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemShippingDetails")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemShippingDetailsActionImpl.class)
public interface CartSetLineItemShippingDetailsAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLineItemShippingDetailsAction
     */
    String SET_LINE_ITEM_SHIPPING_DETAILS = "setLineItemShippingDetails";

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
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @return shippingDetails
     */
    @Valid
    @JsonProperty("shippingDetails")
    public ItemShippingDetailsDraft getShippingDetails();

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
     *  <p>Value to set. If empty, the existing value is removed.</p>
     * @param shippingDetails value to be set
     */

    public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);

    /**
     * factory method
     * @return instance of CartSetLineItemShippingDetailsAction
     */
    public static CartSetLineItemShippingDetailsAction of() {
        return new CartSetLineItemShippingDetailsActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLineItemShippingDetailsAction of(final CartSetLineItemShippingDetailsAction template) {
        CartSetLineItemShippingDetailsActionImpl instance = new CartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(template.getShippingDetails());
        return instance;
    }

    public CartSetLineItemShippingDetailsAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetLineItemShippingDetailsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLineItemShippingDetailsAction deepCopy(
            @Nullable final CartSetLineItemShippingDetailsAction template) {
        if (template == null) {
            return null;
        }
        CartSetLineItemShippingDetailsActionImpl instance = new CartSetLineItemShippingDetailsActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setShippingDetails(
            com.commercetools.api.models.cart.ItemShippingDetailsDraft.deepCopy(template.getShippingDetails()));
        return instance;
    }

    /**
     * builder factory method for CartSetLineItemShippingDetailsAction
     * @return builder
     */
    public static CartSetLineItemShippingDetailsActionBuilder builder() {
        return CartSetLineItemShippingDetailsActionBuilder.of();
    }

    /**
     * create builder for CartSetLineItemShippingDetailsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLineItemShippingDetailsActionBuilder builder(
            final CartSetLineItemShippingDetailsAction template) {
        return CartSetLineItemShippingDetailsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLineItemShippingDetailsAction(Function<CartSetLineItemShippingDetailsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemShippingDetailsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemShippingDetailsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemShippingDetailsAction>";
            }
        };
    }
}
