
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandardScheduleBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandardSchedule standardSchedule = StandardSchedule.builder()
 *             .value(0.3)
 *             .intervalUnit(IntervalUnit.DAYS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandardScheduleBuilder implements Builder<StandardSchedule> {

    private Long value;

    private com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit;

    /**
     *  <p>Number of intervals between orders.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandardScheduleBuilder value(final Long value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Interval of this schedule.</p>
     * @param intervalUnit value to be set
     * @return Builder
     */

    public StandardScheduleBuilder intervalUnit(
            final com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }

    /**
     *  <p>Number of intervals between orders.</p>
     * @return value
     */

    public Long getValue() {
        return this.value;
    }

    /**
     *  <p>Interval of this schedule.</p>
     * @return intervalUnit
     */

    public com.commercetools.api.models.recurrence_policy.IntervalUnit getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * builds StandardSchedule with checking for non-null required values
     * @return StandardSchedule
     */
    public StandardSchedule build() {
        Objects.requireNonNull(value, StandardSchedule.class + ": value is missing");
        Objects.requireNonNull(intervalUnit, StandardSchedule.class + ": intervalUnit is missing");
        return new StandardScheduleImpl(value, intervalUnit);
    }

    /**
     * builds StandardSchedule without checking for non-null required values
     * @return StandardSchedule
     */
    public StandardSchedule buildUnchecked() {
        return new StandardScheduleImpl(value, intervalUnit);
    }

    /**
     * factory method for an instance of StandardScheduleBuilder
     * @return builder
     */
    public static StandardScheduleBuilder of() {
        return new StandardScheduleBuilder();
    }

    /**
     * create builder for StandardSchedule instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandardScheduleBuilder of(final StandardSchedule template) {
        StandardScheduleBuilder builder = new StandardScheduleBuilder();
        builder.value = template.getValue();
        builder.intervalUnit = template.getIntervalUnit();
        return builder;
    }

}
