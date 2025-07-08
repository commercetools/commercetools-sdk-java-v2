
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreatedFromRecurringOrderMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCreatedFromRecurringOrderMessagePayloadBuilder
        implements Builder<OrderCreatedFromRecurringOrderMessagePayload> {

    private com.commercetools.api.models.order.Order order;

    private com.commercetools.api.models.recurring_order.RecurringOrderReference recurringOrderRef;

    /**
     *  <p>Order that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder order(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Order that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder withOrder(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.Order> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of());
        return this;
    }

    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder order(
            final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @param builder function to build the recurringOrderRef value
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder recurringOrderRef(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderReferenceBuilder, com.commercetools.api.models.recurring_order.RecurringOrderReferenceBuilder> builder) {
        this.recurringOrderRef = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @param builder function to build the recurringOrderRef value
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder withRecurringOrderRef(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderReferenceBuilder, com.commercetools.api.models.recurring_order.RecurringOrderReference> builder) {
        this.recurringOrderRef = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @param recurringOrderRef value to be set
     * @return Builder
     */

    public OrderCreatedFromRecurringOrderMessagePayloadBuilder recurringOrderRef(
            final com.commercetools.api.models.recurring_order.RecurringOrderReference recurringOrderRef) {
        this.recurringOrderRef = recurringOrderRef;
        return this;
    }

    /**
     *  <p>Order that was created.</p>
     * @return order
     */

    public com.commercetools.api.models.order.Order getOrder() {
        return this.order;
    }

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @return recurringOrderRef
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderReference getRecurringOrderRef() {
        return this.recurringOrderRef;
    }

    /**
     * builds OrderCreatedFromRecurringOrderMessagePayload with checking for non-null required values
     * @return OrderCreatedFromRecurringOrderMessagePayload
     */
    public OrderCreatedFromRecurringOrderMessagePayload build() {
        Objects.requireNonNull(order, OrderCreatedFromRecurringOrderMessagePayload.class + ": order is missing");
        Objects.requireNonNull(recurringOrderRef,
            OrderCreatedFromRecurringOrderMessagePayload.class + ": recurringOrderRef is missing");
        return new OrderCreatedFromRecurringOrderMessagePayloadImpl(order, recurringOrderRef);
    }

    /**
     * builds OrderCreatedFromRecurringOrderMessagePayload without checking for non-null required values
     * @return OrderCreatedFromRecurringOrderMessagePayload
     */
    public OrderCreatedFromRecurringOrderMessagePayload buildUnchecked() {
        return new OrderCreatedFromRecurringOrderMessagePayloadImpl(order, recurringOrderRef);
    }

    /**
     * factory method for an instance of OrderCreatedFromRecurringOrderMessagePayloadBuilder
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessagePayloadBuilder of() {
        return new OrderCreatedFromRecurringOrderMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCreatedFromRecurringOrderMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessagePayloadBuilder of(
            final OrderCreatedFromRecurringOrderMessagePayload template) {
        OrderCreatedFromRecurringOrderMessagePayloadBuilder builder = new OrderCreatedFromRecurringOrderMessagePayloadBuilder();
        builder.order = template.getOrder();
        builder.recurringOrderRef = template.getRecurringOrderRef();
        return builder;
    }

}
