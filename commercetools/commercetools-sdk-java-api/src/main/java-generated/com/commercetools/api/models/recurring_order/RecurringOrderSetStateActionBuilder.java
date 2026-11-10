
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetStateAction recurringOrderSetStateAction = RecurringOrderSetStateAction.builder()
 *             .recurringOrderState(recurringOrderStateBuilder -> recurringOrderStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetStateActionBuilder implements Builder<RecurringOrderSetStateAction> {

    private com.commercetools.api.models.recurring_order.RecurringOrderStateDraft recurringOrderState;

    /**
     *  <p>New state of the RecurringOrder.</p>
     * @param recurringOrderState value to be set
     * @return Builder
     */

    public RecurringOrderSetStateActionBuilder recurringOrderState(
            final com.commercetools.api.models.recurring_order.RecurringOrderStateDraft recurringOrderState) {
        this.recurringOrderState = recurringOrderState;
        return this;
    }

    /**
     *  <p>New state of the RecurringOrder.</p>
     * @param builder function to build the recurringOrderState value
     * @return Builder
     */

    public RecurringOrderSetStateActionBuilder recurringOrderState(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderStateDraftBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderStateDraft>> builder) {
        this.recurringOrderState = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderStateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New state of the RecurringOrder.</p>
     * @return recurringOrderState
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderStateDraft getRecurringOrderState() {
        return this.recurringOrderState;
    }

    /**
     * builds RecurringOrderSetStateAction with checking for non-null required values
     * @return RecurringOrderSetStateAction
     */
    public RecurringOrderSetStateAction build() {
        Objects.requireNonNull(recurringOrderState,
            RecurringOrderSetStateAction.class + ": recurringOrderState is missing");
        return new RecurringOrderSetStateActionImpl(recurringOrderState);
    }

    /**
     * builds RecurringOrderSetStateAction without checking for non-null required values
     * @return RecurringOrderSetStateAction
     */
    public RecurringOrderSetStateAction buildUnchecked() {
        return new RecurringOrderSetStateActionImpl(recurringOrderState);
    }

    /**
     * factory method for an instance of RecurringOrderSetStateActionBuilder
     * @return builder
     */
    public static RecurringOrderSetStateActionBuilder of() {
        return new RecurringOrderSetStateActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetStateActionBuilder of(final RecurringOrderSetStateAction template) {
        RecurringOrderSetStateActionBuilder builder = new RecurringOrderSetStateActionBuilder();
        builder.recurringOrderState = template.getRecurringOrderState();
        return builder;
    }

}
