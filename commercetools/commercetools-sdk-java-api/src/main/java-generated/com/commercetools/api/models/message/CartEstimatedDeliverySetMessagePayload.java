
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.EstimatedDelivery;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEstimatedDeliverySetMessagePayload cartEstimatedDeliverySetMessagePayload = CartEstimatedDeliverySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartEstimatedDeliverySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartEstimatedDeliverySetMessagePayloadImpl.class)
public interface CartEstimatedDeliverySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartEstimatedDeliverySetMessagePayload
     */
    String CART_ESTIMATED_DELIVERY_SET = "CartEstimatedDeliverySet";

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @return estimatedDelivery
     */
    @Valid
    @JsonProperty("estimatedDelivery")
    public EstimatedDelivery getEstimatedDelivery();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param estimatedDelivery value to be set
     */

    public void setEstimatedDelivery(final EstimatedDelivery estimatedDelivery);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of CartEstimatedDeliverySetMessagePayload
     */
    public static CartEstimatedDeliverySetMessagePayload of() {
        return new CartEstimatedDeliverySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartEstimatedDeliverySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartEstimatedDeliverySetMessagePayload of(final CartEstimatedDeliverySetMessagePayload template) {
        CartEstimatedDeliverySetMessagePayloadImpl instance = new CartEstimatedDeliverySetMessagePayloadImpl();
        instance.setEstimatedDelivery(template.getEstimatedDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public CartEstimatedDeliverySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartEstimatedDeliverySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartEstimatedDeliverySetMessagePayload deepCopy(
            @Nullable final CartEstimatedDeliverySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartEstimatedDeliverySetMessagePayloadImpl instance = new CartEstimatedDeliverySetMessagePayloadImpl();
        instance.setEstimatedDelivery(
            com.commercetools.api.models.cart.EstimatedDelivery.deepCopy(template.getEstimatedDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for CartEstimatedDeliverySetMessagePayload
     * @return builder
     */
    public static CartEstimatedDeliverySetMessagePayloadBuilder builder() {
        return CartEstimatedDeliverySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartEstimatedDeliverySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEstimatedDeliverySetMessagePayloadBuilder builder(
            final CartEstimatedDeliverySetMessagePayload template) {
        return CartEstimatedDeliverySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartEstimatedDeliverySetMessagePayload(
            Function<CartEstimatedDeliverySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartEstimatedDeliverySetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartEstimatedDeliverySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartEstimatedDeliverySetMessagePayload>";
            }
        };
    }
}
