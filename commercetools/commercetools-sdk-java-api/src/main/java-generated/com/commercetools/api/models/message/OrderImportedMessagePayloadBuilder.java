
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportedMessagePayloadBuilder
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
public class OrderImportedMessagePayloadBuilder implements Builder<OrderImportedMessagePayload> {

    private com.commercetools.api.models.order.Order order;

    /**
     *  <p>Order that was imported.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public OrderImportedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Order that was imported.</p>
     * @param order value to be set
     * @return Builder
     */

    public OrderImportedMessagePayloadBuilder order(final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Order that was imported.</p>
     * @return order
     */

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    /**
     * builds OrderImportedMessagePayload with checking for non-null required values
     * @return OrderImportedMessagePayload
     */
    public OrderImportedMessagePayload build() {
        Objects.requireNonNull(order, OrderImportedMessagePayload.class + ": order is missing");
        return new OrderImportedMessagePayloadImpl(order);
    }

    /**
     * builds OrderImportedMessagePayload without checking for non-null required values
     * @return OrderImportedMessagePayload
     */
    public OrderImportedMessagePayload buildUnchecked() {
        return new OrderImportedMessagePayloadImpl(order);
    }

    /**
     * factory method for an instance of OrderImportedMessagePayloadBuilder
     * @return builder
     */
    public static OrderImportedMessagePayloadBuilder of() {
        return new OrderImportedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderImportedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportedMessagePayloadBuilder of(final OrderImportedMessagePayload template) {
        OrderImportedMessagePayloadBuilder builder = new OrderImportedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
