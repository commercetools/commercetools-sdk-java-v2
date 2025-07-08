
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetStartsAtActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetStartsAtAction recurringOrderSetStartsAtAction = RecurringOrderSetStartsAtAction.builder()
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetStartsAtActionBuilder implements Builder<RecurringOrderSetStartsAtAction> {

    private java.time.ZonedDateTime startsAt;

    /**
     *  <p>Date and time (UTC) the Recurring Order should be started. The date and time must be in the future.</p>
     * @param startsAt value to be set
     * @return Builder
     */

    public RecurringOrderSetStartsAtActionBuilder startsAt(final java.time.ZonedDateTime startsAt) {
        this.startsAt = startsAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order should be started. The date and time must be in the future.</p>
     * @return startsAt
     */

    public java.time.ZonedDateTime getStartsAt() {
        return this.startsAt;
    }

    /**
     * builds RecurringOrderSetStartsAtAction with checking for non-null required values
     * @return RecurringOrderSetStartsAtAction
     */
    public RecurringOrderSetStartsAtAction build() {
        Objects.requireNonNull(startsAt, RecurringOrderSetStartsAtAction.class + ": startsAt is missing");
        return new RecurringOrderSetStartsAtActionImpl(startsAt);
    }

    /**
     * builds RecurringOrderSetStartsAtAction without checking for non-null required values
     * @return RecurringOrderSetStartsAtAction
     */
    public RecurringOrderSetStartsAtAction buildUnchecked() {
        return new RecurringOrderSetStartsAtActionImpl(startsAt);
    }

    /**
     * factory method for an instance of RecurringOrderSetStartsAtActionBuilder
     * @return builder
     */
    public static RecurringOrderSetStartsAtActionBuilder of() {
        return new RecurringOrderSetStartsAtActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetStartsAtAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetStartsAtActionBuilder of(final RecurringOrderSetStartsAtAction template) {
        RecurringOrderSetStartsAtActionBuilder builder = new RecurringOrderSetStartsAtActionBuilder();
        builder.startsAt = template.getStartsAt();
        return builder;
    }

}
