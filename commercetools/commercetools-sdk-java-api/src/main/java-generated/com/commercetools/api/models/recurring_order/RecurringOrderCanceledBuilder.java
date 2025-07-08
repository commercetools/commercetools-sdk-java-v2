
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCanceledBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCanceled recurringOrderCanceled = RecurringOrderCanceled.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCanceledBuilder implements Builder<RecurringOrderCanceled> {

    @Nullable
    private String reason;

    /**
     *  <p>The reason for the cancelation.</p>
     * @param reason value to be set
     * @return Builder
     */

    public RecurringOrderCanceledBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>The reason for the cancelation.</p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     * builds RecurringOrderCanceled with checking for non-null required values
     * @return RecurringOrderCanceled
     */
    public RecurringOrderCanceled build() {
        return new RecurringOrderCanceledImpl(reason);
    }

    /**
     * builds RecurringOrderCanceled without checking for non-null required values
     * @return RecurringOrderCanceled
     */
    public RecurringOrderCanceled buildUnchecked() {
        return new RecurringOrderCanceledImpl(reason);
    }

    /**
     * factory method for an instance of RecurringOrderCanceledBuilder
     * @return builder
     */
    public static RecurringOrderCanceledBuilder of() {
        return new RecurringOrderCanceledBuilder();
    }

    /**
     * create builder for RecurringOrderCanceled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCanceledBuilder of(final RecurringOrderCanceled template) {
        RecurringOrderCanceledBuilder builder = new RecurringOrderCanceledBuilder();
        builder.reason = template.getReason();
        return builder;
    }

}
