
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderScheduleSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderScheduleSetMessagePayload recurringOrderScheduleSetMessagePayload = RecurringOrderScheduleSetMessagePayload.builder()
 *             .recurrencePolicySchedule(recurrencePolicyScheduleBuilder -> recurrencePolicyScheduleBuilder)
 *             .oldRecurrencePolicySchedule(oldRecurrencePolicyScheduleBuilder -> oldRecurrencePolicyScheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderScheduleSetMessagePayloadBuilder
        implements Builder<RecurringOrderScheduleSetMessagePayload> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule;

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     * @param recurrencePolicySchedule value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessagePayloadBuilder recurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule) {
        this.recurrencePolicySchedule = recurrencePolicySchedule;
        return this;
    }

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     * @param builder function to build the recurrencePolicySchedule value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessagePayloadBuilder recurrencePolicySchedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.recurrencePolicySchedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     * @param oldRecurrencePolicySchedule value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessagePayloadBuilder oldRecurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule) {
        this.oldRecurrencePolicySchedule = oldRecurrencePolicySchedule;
        return this;
    }

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     * @param builder function to build the oldRecurrencePolicySchedule value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessagePayloadBuilder oldRecurrencePolicySchedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.oldRecurrencePolicySchedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     * @return recurrencePolicySchedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getRecurrencePolicySchedule() {
        return this.recurrencePolicySchedule;
    }

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     * @return oldRecurrencePolicySchedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getOldRecurrencePolicySchedule() {
        return this.oldRecurrencePolicySchedule;
    }

    /**
     * builds RecurringOrderScheduleSetMessagePayload with checking for non-null required values
     * @return RecurringOrderScheduleSetMessagePayload
     */
    public RecurringOrderScheduleSetMessagePayload build() {
        Objects.requireNonNull(recurrencePolicySchedule,
            RecurringOrderScheduleSetMessagePayload.class + ": recurrencePolicySchedule is missing");
        Objects.requireNonNull(oldRecurrencePolicySchedule,
            RecurringOrderScheduleSetMessagePayload.class + ": oldRecurrencePolicySchedule is missing");
        return new RecurringOrderScheduleSetMessagePayloadImpl(recurrencePolicySchedule, oldRecurrencePolicySchedule);
    }

    /**
     * builds RecurringOrderScheduleSetMessagePayload without checking for non-null required values
     * @return RecurringOrderScheduleSetMessagePayload
     */
    public RecurringOrderScheduleSetMessagePayload buildUnchecked() {
        return new RecurringOrderScheduleSetMessagePayloadImpl(recurrencePolicySchedule, oldRecurrencePolicySchedule);
    }

    /**
     * factory method for an instance of RecurringOrderScheduleSetMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessagePayloadBuilder of() {
        return new RecurringOrderScheduleSetMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderScheduleSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessagePayloadBuilder of(
            final RecurringOrderScheduleSetMessagePayload template) {
        RecurringOrderScheduleSetMessagePayloadBuilder builder = new RecurringOrderScheduleSetMessagePayloadBuilder();
        builder.recurrencePolicySchedule = template.getRecurrencePolicySchedule();
        builder.oldRecurrencePolicySchedule = template.getOldRecurrencePolicySchedule();
        return builder;
    }

}
