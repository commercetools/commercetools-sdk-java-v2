
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
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCreatedMessagePayloadBuilder implements Builder<RecurringOrderCreatedMessagePayload> {

    private com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder recurringOrder(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrderBuilder> builder) {
        this.recurringOrder = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder withRecurringOrder(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrder> builder) {
        this.recurringOrder = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @param recurringOrder value to be set
     * @return Builder
     */

    public RecurringOrderCreatedMessagePayloadBuilder recurringOrder(
            final com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder) {
        this.recurringOrder = recurringOrder;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was created.</p>
     * @return recurringOrder
     */

    public com.commercetools.api.models.recurring_order.RecurringOrder getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     * builds RecurringOrderCreatedMessagePayload with checking for non-null required values
     * @return RecurringOrderCreatedMessagePayload
     */
    public RecurringOrderCreatedMessagePayload build() {
        Objects.requireNonNull(recurringOrder,
            RecurringOrderCreatedMessagePayload.class + ": recurringOrder is missing");
        return new RecurringOrderCreatedMessagePayloadImpl(recurringOrder);
    }

    /**
     * builds RecurringOrderCreatedMessagePayload without checking for non-null required values
     * @return RecurringOrderCreatedMessagePayload
     */
    public RecurringOrderCreatedMessagePayload buildUnchecked() {
        return new RecurringOrderCreatedMessagePayloadImpl(recurringOrder);
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
        builder.recurringOrder = template.getRecurringOrder();
        return builder;
    }

}
