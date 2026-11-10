
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the estimated delivery window on the Cart's <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>.</p>
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartEstimatedDeliverySetMessage" rel="nofollow">CartEstimatedDeliverySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetEstimatedDeliveryAction cartSetEstimatedDeliveryAction = CartSetEstimatedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setEstimatedDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetEstimatedDeliveryActionImpl.class)
public interface CartSetEstimatedDeliveryAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetEstimatedDeliveryAction
     */
    String SET_ESTIMATED_DELIVERY = "setEstimatedDelivery";

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Carts with <code>Single</code> ShippingMode, or omitted for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return estimatedDelivery
     */
    @Valid
    @JsonProperty("estimatedDelivery")
    public EstimatedDelivery getEstimatedDelivery();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Carts with <code>Single</code> ShippingMode, or omitted for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param estimatedDelivery value to be set
     */

    public void setEstimatedDelivery(final EstimatedDelivery estimatedDelivery);

    /**
     * factory method
     * @return instance of CartSetEstimatedDeliveryAction
     */
    public static CartSetEstimatedDeliveryAction of() {
        return new CartSetEstimatedDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetEstimatedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetEstimatedDeliveryAction of(final CartSetEstimatedDeliveryAction template) {
        CartSetEstimatedDeliveryActionImpl instance = new CartSetEstimatedDeliveryActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setEstimatedDelivery(template.getEstimatedDelivery());
        return instance;
    }

    public CartSetEstimatedDeliveryAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetEstimatedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetEstimatedDeliveryAction deepCopy(@Nullable final CartSetEstimatedDeliveryAction template) {
        if (template == null) {
            return null;
        }
        CartSetEstimatedDeliveryActionImpl instance = new CartSetEstimatedDeliveryActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setEstimatedDelivery(
            com.commercetools.api.models.cart.EstimatedDelivery.deepCopy(template.getEstimatedDelivery()));
        return instance;
    }

    /**
     * builder factory method for CartSetEstimatedDeliveryAction
     * @return builder
     */
    public static CartSetEstimatedDeliveryActionBuilder builder() {
        return CartSetEstimatedDeliveryActionBuilder.of();
    }

    /**
     * create builder for CartSetEstimatedDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetEstimatedDeliveryActionBuilder builder(final CartSetEstimatedDeliveryAction template) {
        return CartSetEstimatedDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetEstimatedDeliveryAction(Function<CartSetEstimatedDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartSetEstimatedDeliveryAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartSetEstimatedDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetEstimatedDeliveryAction>";
            }
        };
    }
}
