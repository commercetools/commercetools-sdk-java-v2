
package com.commercetools.api.models.order;

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
 *  <p>Sets the estimated delivery window on the Order's <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>.</p>
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEstimatedDeliverySetMessage" rel="nofollow">OrderEstimatedDeliverySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetEstimatedDeliveryAction orderSetEstimatedDeliveryAction = OrderSetEstimatedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setEstimatedDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetEstimatedDeliveryActionImpl.class)
public interface OrderSetEstimatedDeliveryAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetEstimatedDeliveryAction
     */
    String SET_ESTIMATED_DELIVERY = "setEstimatedDelivery";

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Orders with <code>Single</code> ShippingMode, or omitted for Orders with <code>Multiple</code> ShippingMode.</p>
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
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Orders with <code>Single</code> ShippingMode, or omitted for Orders with <code>Multiple</code> ShippingMode.</p>
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
     * @return instance of OrderSetEstimatedDeliveryAction
     */
    public static OrderSetEstimatedDeliveryAction of() {
        return new OrderSetEstimatedDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetEstimatedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetEstimatedDeliveryAction of(final OrderSetEstimatedDeliveryAction template) {
        OrderSetEstimatedDeliveryActionImpl instance = new OrderSetEstimatedDeliveryActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setEstimatedDelivery(template.getEstimatedDelivery());
        return instance;
    }

    public OrderSetEstimatedDeliveryAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetEstimatedDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetEstimatedDeliveryAction deepCopy(@Nullable final OrderSetEstimatedDeliveryAction template) {
        if (template == null) {
            return null;
        }
        OrderSetEstimatedDeliveryActionImpl instance = new OrderSetEstimatedDeliveryActionImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setEstimatedDelivery(
            com.commercetools.api.models.cart.EstimatedDelivery.deepCopy(template.getEstimatedDelivery()));
        return instance;
    }

    /**
     * builder factory method for OrderSetEstimatedDeliveryAction
     * @return builder
     */
    public static OrderSetEstimatedDeliveryActionBuilder builder() {
        return OrderSetEstimatedDeliveryActionBuilder.of();
    }

    /**
     * create builder for OrderSetEstimatedDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetEstimatedDeliveryActionBuilder builder(final OrderSetEstimatedDeliveryAction template) {
        return OrderSetEstimatedDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetEstimatedDeliveryAction(Function<OrderSetEstimatedDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<OrderSetEstimatedDeliveryAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<OrderSetEstimatedDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetEstimatedDeliveryAction>";
            }
        };
    }
}
