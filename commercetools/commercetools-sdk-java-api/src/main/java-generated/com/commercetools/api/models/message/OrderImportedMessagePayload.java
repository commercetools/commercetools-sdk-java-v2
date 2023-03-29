
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
 *  <p>Generated after a successful Order Import.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportedMessagePayload orderImportedMessagePayload = OrderImportedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImportedMessagePayloadImpl.class)
public interface OrderImportedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderImportedMessagePayload
     */
    String ORDER_IMPORTED = "OrderImported";

    /**
     *  <p>Order that was imported.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Order that was imported.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderImportedMessagePayload
     */
    public static OrderImportedMessagePayload of() {
        return new OrderImportedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderImportedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderImportedMessagePayload of(final OrderImportedMessagePayload template) {
        OrderImportedMessagePayloadImpl instance = new OrderImportedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderImportedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderImportedMessagePayload deepCopy(@Nullable final OrderImportedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderImportedMessagePayloadImpl instance = new OrderImportedMessagePayloadImpl();
        instance.setOrder(com.commercetools.api.models.order.Order.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for OrderImportedMessagePayload
     * @return builder
     */
    public static OrderImportedMessagePayloadBuilder builder() {
        return OrderImportedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderImportedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportedMessagePayloadBuilder builder(final OrderImportedMessagePayload template) {
        return OrderImportedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImportedMessagePayload(Function<OrderImportedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportedMessagePayload>";
            }
        };
    }
}
