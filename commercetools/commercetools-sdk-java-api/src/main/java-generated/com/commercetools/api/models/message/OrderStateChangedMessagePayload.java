
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change OrderState update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateChangedMessagePayload orderStateChangedMessagePayload = OrderStateChangedMessagePayload.builder()
 *             .orderState(OrderState.OPEN)
 *             .oldOrderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderStateChangedMessagePayloadImpl.class)
public interface OrderStateChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderStateChangedMessagePayload
     */
    String ORDER_STATE_CHANGED = "OrderStateChanged";

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     * @return oldOrderState
     */
    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     * @param oldOrderState value to be set
     */

    public void setOldOrderState(final OrderState oldOrderState);

    /**
     * factory method
     * @return instance of OrderStateChangedMessagePayload
     */
    public static OrderStateChangedMessagePayload of() {
        return new OrderStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderStateChangedMessagePayload of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadImpl instance = new OrderStateChangedMessagePayloadImpl();
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderStateChangedMessagePayload deepCopy(@Nullable final OrderStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderStateChangedMessagePayloadImpl instance = new OrderStateChangedMessagePayloadImpl();
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    /**
     * builder factory method for OrderStateChangedMessagePayload
     * @return builder
     */
    public static OrderStateChangedMessagePayloadBuilder builder() {
        return OrderStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStateChangedMessagePayloadBuilder builder(final OrderStateChangedMessagePayload template) {
        return OrderStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderStateChangedMessagePayload(Function<OrderStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateChangedMessagePayload>";
            }
        };
    }
}
