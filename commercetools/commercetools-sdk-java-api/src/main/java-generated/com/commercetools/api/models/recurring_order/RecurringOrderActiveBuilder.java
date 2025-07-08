
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderActiveBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderActive recurringOrderActive = RecurringOrderActive.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderActiveBuilder implements Builder<RecurringOrderActive> {

    @Nullable
    private java.time.ZonedDateTime resumesAt;

    /**
     *  <p>If set, the Recurring Order will automatically resume at the date and time (UTC) specified.</p>
     * @param resumesAt value to be set
     * @return Builder
     */

    public RecurringOrderActiveBuilder resumesAt(@Nullable final java.time.ZonedDateTime resumesAt) {
        this.resumesAt = resumesAt;
        return this;
    }

    /**
     *  <p>If set, the Recurring Order will automatically resume at the date and time (UTC) specified.</p>
     * @return resumesAt
     */

    @Nullable
    public java.time.ZonedDateTime getResumesAt() {
        return this.resumesAt;
    }

    /**
     * builds RecurringOrderActive with checking for non-null required values
     * @return RecurringOrderActive
     */
    public RecurringOrderActive build() {
        return new RecurringOrderActiveImpl(resumesAt);
    }

    /**
     * builds RecurringOrderActive without checking for non-null required values
     * @return RecurringOrderActive
     */
    public RecurringOrderActive buildUnchecked() {
        return new RecurringOrderActiveImpl(resumesAt);
    }

    /**
     * factory method for an instance of RecurringOrderActiveBuilder
     * @return builder
     */
    public static RecurringOrderActiveBuilder of() {
        return new RecurringOrderActiveBuilder();
    }

    /**
     * create builder for RecurringOrderActive instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderActiveBuilder of(final RecurringOrderActive template) {
        RecurringOrderActiveBuilder builder = new RecurringOrderActiveBuilder();
        builder.resumesAt = template.getResumesAt();
        return builder;
    }

}
