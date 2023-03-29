
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Order request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedMessagePayload orderCreatedMessagePayload = OrderCreatedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreatedMessagePayloadImpl.class)
public interface OrderCreatedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCreatedMessagePayload
     */
    String ORDER_CREATED = "OrderCreated";

    /**
     *  <p>Order that was created.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderCreatedMessagePayload
     */
    public static OrderCreatedMessagePayload of() {
        return new OrderCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreatedMessagePayload of(final OrderCreatedMessagePayload template) {
        OrderCreatedMessagePayloadImpl instance = new OrderCreatedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreatedMessagePayload deepCopy(@Nullable final OrderCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCreatedMessagePayloadImpl instance = new OrderCreatedMessagePayloadImpl();
        instance.setOrder(Optional.ofNullable(template.getOrder())
                .map(com.commercetools.api.models.order.Order::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderCreatedMessagePayload
     * @return builder
     */
    public static OrderCreatedMessagePayloadBuilder builder() {
        return OrderCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedMessagePayloadBuilder builder(final OrderCreatedMessagePayload template) {
        return OrderCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreatedMessagePayload(Function<OrderCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreatedMessagePayload>";
            }
        };
    }
}
