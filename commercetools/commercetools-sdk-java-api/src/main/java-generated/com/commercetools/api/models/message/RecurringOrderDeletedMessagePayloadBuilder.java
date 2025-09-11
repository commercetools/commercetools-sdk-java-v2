
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderDeletedMessagePayload recurringOrderDeletedMessagePayload = RecurringOrderDeletedMessagePayload.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderDeletedMessagePayloadBuilder implements Builder<RecurringOrderDeletedMessagePayload> {

    private com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringOrderDeletedMessagePayloadBuilder recurringOrder(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrderBuilder> builder) {
        this.recurringOrder = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringOrderDeletedMessagePayloadBuilder withRecurringOrder(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderBuilder, com.commercetools.api.models.recurring_order.RecurringOrder> builder) {
        this.recurringOrder = builder.apply(com.commercetools.api.models.recurring_order.RecurringOrderBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @param recurringOrder value to be set
     * @return Builder
     */

    public RecurringOrderDeletedMessagePayloadBuilder recurringOrder(
            final com.commercetools.api.models.recurring_order.RecurringOrder recurringOrder) {
        this.recurringOrder = recurringOrder;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> that was deleted.</p>
     * @return recurringOrder
     */

    public com.commercetools.api.models.recurring_order.RecurringOrder getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     * builds RecurringOrderDeletedMessagePayload with checking for non-null required values
     * @return RecurringOrderDeletedMessagePayload
     */
    public RecurringOrderDeletedMessagePayload build() {
        Objects.requireNonNull(recurringOrder,
            RecurringOrderDeletedMessagePayload.class + ": recurringOrder is missing");
        return new RecurringOrderDeletedMessagePayloadImpl(recurringOrder);
    }

    /**
     * builds RecurringOrderDeletedMessagePayload without checking for non-null required values
     * @return RecurringOrderDeletedMessagePayload
     */
    public RecurringOrderDeletedMessagePayload buildUnchecked() {
        return new RecurringOrderDeletedMessagePayloadImpl(recurringOrder);
    }

    /**
     * factory method for an instance of RecurringOrderDeletedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderDeletedMessagePayloadBuilder of() {
        return new RecurringOrderDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderDeletedMessagePayloadBuilder of(final RecurringOrderDeletedMessagePayload template) {
        RecurringOrderDeletedMessagePayloadBuilder builder = new RecurringOrderDeletedMessagePayloadBuilder();
        builder.recurringOrder = template.getRecurringOrder();
        return builder;
    }

}
