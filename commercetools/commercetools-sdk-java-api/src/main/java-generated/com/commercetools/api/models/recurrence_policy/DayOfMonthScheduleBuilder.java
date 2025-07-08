
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DayOfMonthScheduleBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DayOfMonthSchedule dayOfMonthSchedule = DayOfMonthSchedule.builder()
 *             .day(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DayOfMonthScheduleBuilder implements Builder<DayOfMonthSchedule> {

    private Integer day;

    /**
     *  <p>The day of the month when the Recurring Order is created. If the value is greater than the number of days in a given month, the order is created on the last day of the month.</p>
     * @param day value to be set
     * @return Builder
     */

    public DayOfMonthScheduleBuilder day(final Integer day) {
        this.day = day;
        return this;
    }

    /**
     *  <p>The day of the month when the Recurring Order is created. If the value is greater than the number of days in a given month, the order is created on the last day of the month.</p>
     * @return day
     */

    public Integer getDay() {
        return this.day;
    }

    /**
     * builds DayOfMonthSchedule with checking for non-null required values
     * @return DayOfMonthSchedule
     */
    public DayOfMonthSchedule build() {
        Objects.requireNonNull(day, DayOfMonthSchedule.class + ": day is missing");
        return new DayOfMonthScheduleImpl(day);
    }

    /**
     * builds DayOfMonthSchedule without checking for non-null required values
     * @return DayOfMonthSchedule
     */
    public DayOfMonthSchedule buildUnchecked() {
        return new DayOfMonthScheduleImpl(day);
    }

    /**
     * factory method for an instance of DayOfMonthScheduleBuilder
     * @return builder
     */
    public static DayOfMonthScheduleBuilder of() {
        return new DayOfMonthScheduleBuilder();
    }

    /**
     * create builder for DayOfMonthSchedule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DayOfMonthScheduleBuilder of(final DayOfMonthSchedule template) {
        DayOfMonthScheduleBuilder builder = new DayOfMonthScheduleBuilder();
        builder.day = template.getDay();
        return builder;
    }

}
