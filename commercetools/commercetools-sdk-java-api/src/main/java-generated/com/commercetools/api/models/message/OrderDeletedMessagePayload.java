
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <span>Delete Order</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDeletedMessagePayload orderDeletedMessagePayload = OrderDeletedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDeletedMessagePayloadImpl.class)
public interface OrderDeletedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderDeletedMessagePayload
     */
    String ORDER_DELETED = "OrderDeleted";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that has been deleted.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that has been deleted.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderDeletedMessagePayload
     */
    public static OrderDeletedMessagePayload of() {
        return new OrderDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDeletedMessagePayload of(final OrderDeletedMessagePayload template) {
        OrderDeletedMessagePayloadImpl instance = new OrderDeletedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    public OrderDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDeletedMessagePayload deepCopy(@Nullable final OrderDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderDeletedMessagePayloadImpl instance = new OrderDeletedMessagePayloadImpl();
        instance.setOrder(com.commercetools.api.models.order.Order.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for OrderDeletedMessagePayload
     * @return builder
     */
    public static OrderDeletedMessagePayloadBuilder builder() {
        return OrderDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDeletedMessagePayloadBuilder builder(final OrderDeletedMessagePayload template) {
        return OrderDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDeletedMessagePayload(Function<OrderDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDeletedMessagePayload>";
            }
        };
    }
}
