
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderExpiredBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderExpired recurringOrderExpired = RecurringOrderExpired.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderExpiredBuilder implements Builder<RecurringOrderExpired> {

    /**
     * builds RecurringOrderExpired with checking for non-null required values
     * @return RecurringOrderExpired
     */
    public RecurringOrderExpired build() {
        return new RecurringOrderExpiredImpl();
    }

    /**
     * builds RecurringOrderExpired without checking for non-null required values
     * @return RecurringOrderExpired
     */
    public RecurringOrderExpired buildUnchecked() {
        return new RecurringOrderExpiredImpl();
    }

    /**
     * factory method for an instance of RecurringOrderExpiredBuilder
     * @return builder
     */
    public static RecurringOrderExpiredBuilder of() {
        return new RecurringOrderExpiredBuilder();
    }

    /**
     * create builder for RecurringOrderExpired instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderExpiredBuilder of(final RecurringOrderExpired template) {
        RecurringOrderExpiredBuilder builder = new RecurringOrderExpiredBuilder();
        return builder;
    }

}
