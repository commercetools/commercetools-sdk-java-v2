
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DayOfMonthScheduleDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DayOfMonthScheduleDraft dayOfMonthScheduleDraft = DayOfMonthScheduleDraft.builder()
 *             .day(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DayOfMonthScheduleDraftBuilder implements Builder<DayOfMonthScheduleDraft> {

    private Integer day;

    /**
     *  <p>The day of the month when the Recurring Order should be created. If the value is greater than the number of days in a given month, the order will be created on the last day of the month.</p>
     * @param day value to be set
     * @return Builder
     */

    public DayOfMonthScheduleDraftBuilder day(final Integer day) {
        this.day = day;
        return this;
    }

    /**
     *  <p>The day of the month when the Recurring Order should be created. If the value is greater than the number of days in a given month, the order will be created on the last day of the month.</p>
     * @return day
     */

    public Integer getDay() {
        return this.day;
    }

    /**
     * builds DayOfMonthScheduleDraft with checking for non-null required values
     * @return DayOfMonthScheduleDraft
     */
    public DayOfMonthScheduleDraft build() {
        Objects.requireNonNull(day, DayOfMonthScheduleDraft.class + ": day is missing");
        return new DayOfMonthScheduleDraftImpl(day);
    }

    /**
     * builds DayOfMonthScheduleDraft without checking for non-null required values
     * @return DayOfMonthScheduleDraft
     */
    public DayOfMonthScheduleDraft buildUnchecked() {
        return new DayOfMonthScheduleDraftImpl(day);
    }

    /**
     * factory method for an instance of DayOfMonthScheduleDraftBuilder
     * @return builder
     */
    public static DayOfMonthScheduleDraftBuilder of() {
        return new DayOfMonthScheduleDraftBuilder();
    }

    /**
     * create builder for DayOfMonthScheduleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DayOfMonthScheduleDraftBuilder of(final DayOfMonthScheduleDraft template) {
        DayOfMonthScheduleDraftBuilder builder = new DayOfMonthScheduleDraftBuilder();
        builder.day = template.getDay();
        return builder;
    }

}
