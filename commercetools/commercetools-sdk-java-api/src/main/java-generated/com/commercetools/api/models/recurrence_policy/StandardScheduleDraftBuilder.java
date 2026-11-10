
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandardScheduleDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandardScheduleDraft standardScheduleDraft = StandardScheduleDraft.builder()
 *             .value(0.3)
 *             .intervalUnit(IntervalUnit.DAYS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandardScheduleDraftBuilder implements Builder<StandardScheduleDraft> {

    private Long value;

    private com.commercetools.api.models.recurrence_policy.IntervalUnit intervalUnit;

    /**
     *  <p>Number of intervals between orders.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandardScheduleDraftBuilder value(final Long value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Interval for this schedule.</p>
     * @param intervalUnit value to be set
     * @return Builder
     */

    public StandardScheduleDraftBuilder intervalUnit(
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
     *  <p>Interval for this schedule.</p>
     * @return intervalUnit
     */

    public com.commercetools.api.models.recurrence_policy.IntervalUnit getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * builds StandardScheduleDraft with checking for non-null required values
     * @return StandardScheduleDraft
     */
    public StandardScheduleDraft build() {
        Objects.requireNonNull(value, StandardScheduleDraft.class + ": value is missing");
        Objects.requireNonNull(intervalUnit, StandardScheduleDraft.class + ": intervalUnit is missing");
        return new StandardScheduleDraftImpl(value, intervalUnit);
    }

    /**
     * builds StandardScheduleDraft without checking for non-null required values
     * @return StandardScheduleDraft
     */
    public StandardScheduleDraft buildUnchecked() {
        return new StandardScheduleDraftImpl(value, intervalUnit);
    }

    /**
     * factory method for an instance of StandardScheduleDraftBuilder
     * @return builder
     */
    public static StandardScheduleDraftBuilder of() {
        return new StandardScheduleDraftBuilder();
    }

    /**
     * create builder for StandardScheduleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandardScheduleDraftBuilder of(final StandardScheduleDraft template) {
        StandardScheduleDraftBuilder builder = new StandardScheduleDraftBuilder();
        builder.value = template.getValue();
        builder.intervalUnit = template.getIntervalUnit();
        return builder;
    }

}
