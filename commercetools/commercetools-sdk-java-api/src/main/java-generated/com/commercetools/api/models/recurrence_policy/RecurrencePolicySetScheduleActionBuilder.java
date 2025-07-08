
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetScheduleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetScheduleAction recurrencePolicySetScheduleAction = RecurrencePolicySetScheduleAction.builder()
 *             .schedule(scheduleBuilder -> scheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetScheduleActionBuilder implements Builder<RecurrencePolicySetScheduleAction> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule;

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param schedule value to be set
     * @return Builder
     */

    public RecurrencePolicySetScheduleActionBuilder schedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param builder function to build the schedule value
     * @return Builder
     */

    public RecurrencePolicySetScheduleActionBuilder schedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft>> builder) {
        this.schedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @return schedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft getSchedule() {
        return this.schedule;
    }

    /**
     * builds RecurrencePolicySetScheduleAction with checking for non-null required values
     * @return RecurrencePolicySetScheduleAction
     */
    public RecurrencePolicySetScheduleAction build() {
        Objects.requireNonNull(schedule, RecurrencePolicySetScheduleAction.class + ": schedule is missing");
        return new RecurrencePolicySetScheduleActionImpl(schedule);
    }

    /**
     * builds RecurrencePolicySetScheduleAction without checking for non-null required values
     * @return RecurrencePolicySetScheduleAction
     */
    public RecurrencePolicySetScheduleAction buildUnchecked() {
        return new RecurrencePolicySetScheduleActionImpl(schedule);
    }

    /**
     * factory method for an instance of RecurrencePolicySetScheduleActionBuilder
     * @return builder
     */
    public static RecurrencePolicySetScheduleActionBuilder of() {
        return new RecurrencePolicySetScheduleActionBuilder();
    }

    /**
     * create builder for RecurrencePolicySetScheduleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetScheduleActionBuilder of(final RecurrencePolicySetScheduleAction template) {
        RecurrencePolicySetScheduleActionBuilder builder = new RecurrencePolicySetScheduleActionBuilder();
        builder.schedule = template.getSchedule();
        return builder;
    }

}
