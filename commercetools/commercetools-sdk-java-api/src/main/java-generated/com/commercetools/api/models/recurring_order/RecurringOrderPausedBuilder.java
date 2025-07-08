
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderPausedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderPaused recurringOrderPaused = RecurringOrderPaused.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderPausedBuilder implements Builder<RecurringOrderPaused> {

    /**
     * builds RecurringOrderPaused with checking for non-null required values
     * @return RecurringOrderPaused
     */
    public RecurringOrderPaused build() {
        return new RecurringOrderPausedImpl();
    }

    /**
     * builds RecurringOrderPaused without checking for non-null required values
     * @return RecurringOrderPaused
     */
    public RecurringOrderPaused buildUnchecked() {
        return new RecurringOrderPausedImpl();
    }

    /**
     * factory method for an instance of RecurringOrderPausedBuilder
     * @return builder
     */
    public static RecurringOrderPausedBuilder of() {
        return new RecurringOrderPausedBuilder();
    }

    /**
     * create builder for RecurringOrderPaused instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderPausedBuilder of(final RecurringOrderPaused template) {
        RecurringOrderPausedBuilder builder = new RecurringOrderPausedBuilder();
        return builder;
    }

}
