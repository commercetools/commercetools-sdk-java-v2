
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.recurring_order.RecurringOrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an Order is successfully created according to the defined schedule of a Recurring Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedFromRecurringOrderMessagePayload orderCreatedFromRecurringOrderMessagePayload = OrderCreatedFromRecurringOrderMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .recurringOrderRef(recurringOrderRefBuilder -> recurringOrderRefBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCreatedFromRecurringOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreatedFromRecurringOrderMessagePayloadImpl.class)
public interface OrderCreatedFromRecurringOrderMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCreatedFromRecurringOrderMessagePayload
     */
    String ORDER_CREATED_FROM_RECURRING_ORDER = "OrderCreatedFromRecurringOrder";

    /**
     *  <p>Order that was created.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @return recurringOrderRef
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrderRef")
    public RecurringOrderReference getRecurringOrderRef();

    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @param recurringOrderRef value to be set
     */

    public void setRecurringOrderRef(final RecurringOrderReference recurringOrderRef);

    /**
     * factory method
     * @return instance of OrderCreatedFromRecurringOrderMessagePayload
     */
    public static OrderCreatedFromRecurringOrderMessagePayload of() {
        return new OrderCreatedFromRecurringOrderMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreatedFromRecurringOrderMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreatedFromRecurringOrderMessagePayload of(
            final OrderCreatedFromRecurringOrderMessagePayload template) {
        OrderCreatedFromRecurringOrderMessagePayloadImpl instance = new OrderCreatedFromRecurringOrderMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        instance.setRecurringOrderRef(template.getRecurringOrderRef());
        return instance;
    }

    public OrderCreatedFromRecurringOrderMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderCreatedFromRecurringOrderMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreatedFromRecurringOrderMessagePayload deepCopy(
            @Nullable final OrderCreatedFromRecurringOrderMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCreatedFromRecurringOrderMessagePayloadImpl instance = new OrderCreatedFromRecurringOrderMessagePayloadImpl();
        instance.setOrder(com.commercetools.api.models.order.Order.deepCopy(template.getOrder()));
        instance.setRecurringOrderRef(com.commercetools.api.models.recurring_order.RecurringOrderReference
                .deepCopy(template.getRecurringOrderRef()));
        return instance;
    }

    /**
     * builder factory method for OrderCreatedFromRecurringOrderMessagePayload
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessagePayloadBuilder builder() {
        return OrderCreatedFromRecurringOrderMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCreatedFromRecurringOrderMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessagePayloadBuilder builder(
            final OrderCreatedFromRecurringOrderMessagePayload template) {
        return OrderCreatedFromRecurringOrderMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreatedFromRecurringOrderMessagePayload(
            Function<OrderCreatedFromRecurringOrderMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreatedFromRecurringOrderMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreatedFromRecurringOrderMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreatedFromRecurringOrderMessagePayload>";
            }
        };
    }
}
