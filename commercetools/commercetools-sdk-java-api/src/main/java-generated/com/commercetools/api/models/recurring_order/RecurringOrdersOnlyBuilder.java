
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrdersOnlyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrdersOnly recurringOrdersOnly = RecurringOrdersOnly.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrdersOnlyBuilder implements Builder<RecurringOrdersOnly> {

    /**
     * builds RecurringOrdersOnly with checking for non-null required values
     * @return RecurringOrdersOnly
     */
    public RecurringOrdersOnly build() {
        return new RecurringOrdersOnlyImpl();
    }

    /**
     * builds RecurringOrdersOnly without checking for non-null required values
     * @return RecurringOrdersOnly
     */
    public RecurringOrdersOnly buildUnchecked() {
        return new RecurringOrdersOnlyImpl();
    }

    /**
     * factory method for an instance of RecurringOrdersOnlyBuilder
     * @return builder
     */
    public static RecurringOrdersOnlyBuilder of() {
        return new RecurringOrdersOnlyBuilder();
    }

    /**
     * create builder for RecurringOrdersOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrdersOnlyBuilder of(final RecurringOrdersOnly template) {
        RecurringOrdersOnlyBuilder builder = new RecurringOrdersOnlyBuilder();
        return builder;
    }

}
