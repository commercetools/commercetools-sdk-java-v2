
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCreatedMessagePayload recurringOrderCreatedMessagePayload = RecurringOrderCreatedMessagePayload.builder()
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCreatedMessagePayloadBuilder implements Builder<RecurringOrderCreatedMessagePayload> {

    private com.commercetools.api.models.recurring_order.RecurringOrder order;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder order(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param builder function to build the order value
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder withOrder(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrder> builder) {
        this.order = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param order value to be set
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder order(
            final com.commercetools.api.models.recurring_order.RecurringOrder order) {
        this.order = order;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @return order
     */

    public com.commercetools.api.models.recurring_order.RecurringOrder getOrder() {
        return this.order;
    }

    /**
     * builds RecurringOrderCreatedMessagePayload with checking for non-null required values
     * @return RecurringOrderCreatedMessagePayload
     */
    public RecurringOrderCreatedMessagePayload build() {
        Objects.requireNonNull(order, RecurringOrderCreatedMessagePayload.class + ": order is missing");
        return new RecurringOrderCreatedMessagePayloadImpl(order);
    }

    /**
     * builds RecurringOrderCreatedMessagePayload without checking for non-null required values
     * @return RecurringOrderCreatedMessagePayload
     */
    public RecurringOrderCreatedMessagePayload buildUnchecked() {
        return new RecurringOrderCreatedMessagePayloadImpl(order);
    }

    /**
     * factory method for an instance of RecurringOrderCreatedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCreatedMessagePayloadBuilder of() {
        return new RecurringOrderCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCreatedMessagePayloadBuilder of(final RecurringOrderCreatedMessagePayload template) {
        RecurringOrderCreatedMessagePayloadBuilder builder = new RecurringOrderCreatedMessagePayloadBuilder();
        builder.order = template.getOrder();
        return builder;
    }

}
