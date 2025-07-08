
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetScheduleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetScheduleAction recurringOrderSetScheduleAction = RecurringOrderSetScheduleAction.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetScheduleActionBuilder implements Builder<RecurringOrderSetScheduleAction> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public RecurringOrderSetScheduleActionBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public RecurringOrderSetScheduleActionBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public RecurringOrderSetScheduleActionBuilder recurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return recurrencePolicy
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds RecurringOrderSetScheduleAction with checking for non-null required values
     * @return RecurringOrderSetScheduleAction
     */
    public RecurringOrderSetScheduleAction build() {
        Objects.requireNonNull(recurrencePolicy,
            RecurringOrderSetScheduleAction.class + ": recurrencePolicy is missing");
        return new RecurringOrderSetScheduleActionImpl(recurrencePolicy);
    }

    /**
     * builds RecurringOrderSetScheduleAction without checking for non-null required values
     * @return RecurringOrderSetScheduleAction
     */
    public RecurringOrderSetScheduleAction buildUnchecked() {
        return new RecurringOrderSetScheduleActionImpl(recurrencePolicy);
    }

    /**
     * factory method for an instance of RecurringOrderSetScheduleActionBuilder
     * @return builder
     */
    public static RecurringOrderSetScheduleActionBuilder of() {
        return new RecurringOrderSetScheduleActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetScheduleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetScheduleActionBuilder of(final RecurringOrderSetScheduleAction template) {
        RecurringOrderSetScheduleActionBuilder builder = new RecurringOrderSetScheduleActionBuilder();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
