
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEstimatedDeliverySetMessagePayload orderEstimatedDeliverySetMessagePayload = OrderEstimatedDeliverySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderEstimatedDeliverySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEstimatedDeliverySetMessagePayloadImpl.class)
public interface OrderEstimatedDeliverySetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderEstimatedDeliverySetMessagePayload
     */
    String ORDER_ESTIMATED_DELIVERY_SET = "OrderEstimatedDeliverySet";

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @return estimatedDelivery
     */
    @Valid
    @JsonProperty("estimatedDelivery")
    public EstimatedDelivery getEstimatedDelivery();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param estimatedDelivery value to be set
     */

    public void setEstimatedDelivery(final EstimatedDelivery estimatedDelivery);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of OrderEstimatedDeliverySetMessagePayload
     */
    public static OrderEstimatedDeliverySetMessagePayload of() {
        return new OrderEstimatedDeliverySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderEstimatedDeliverySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEstimatedDeliverySetMessagePayload of(final OrderEstimatedDeliverySetMessagePayload template) {
        OrderEstimatedDeliverySetMessagePayloadImpl instance = new OrderEstimatedDeliverySetMessagePayloadImpl();
        instance.setEstimatedDelivery(template.getEstimatedDelivery());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public OrderEstimatedDeliverySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderEstimatedDeliverySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEstimatedDeliverySetMessagePayload deepCopy(
            @Nullable final OrderEstimatedDeliverySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderEstimatedDeliverySetMessagePayloadImpl instance = new OrderEstimatedDeliverySetMessagePayloadImpl();
        instance.setEstimatedDelivery(
            com.commercetools.api.models.cart.EstimatedDelivery.deepCopy(template.getEstimatedDelivery()));
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for OrderEstimatedDeliverySetMessagePayload
     * @return builder
     */
    public static OrderEstimatedDeliverySetMessagePayloadBuilder builder() {
        return OrderEstimatedDeliverySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderEstimatedDeliverySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEstimatedDeliverySetMessagePayloadBuilder builder(
            final OrderEstimatedDeliverySetMessagePayload template) {
        return OrderEstimatedDeliverySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEstimatedDeliverySetMessagePayload(
            Function<OrderEstimatedDeliverySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<OrderEstimatedDeliverySetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<OrderEstimatedDeliverySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEstimatedDeliverySetMessagePayload>";
            }
        };
    }
}
