
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NonRecurringOrdersOnlyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonRecurringOrdersOnly nonRecurringOrdersOnly = NonRecurringOrdersOnly.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NonRecurringOrdersOnlyBuilder implements Builder<NonRecurringOrdersOnly> {

    /**
     * builds NonRecurringOrdersOnly with checking for non-null required values
     * @return NonRecurringOrdersOnly
     */
    public NonRecurringOrdersOnly build() {
        return new NonRecurringOrdersOnlyImpl();
    }

    /**
     * builds NonRecurringOrdersOnly without checking for non-null required values
     * @return NonRecurringOrdersOnly
     */
    public NonRecurringOrdersOnly buildUnchecked() {
        return new NonRecurringOrdersOnlyImpl();
    }

    /**
     * factory method for an instance of NonRecurringOrdersOnlyBuilder
     * @return builder
     */
    public static NonRecurringOrdersOnlyBuilder of() {
        return new NonRecurringOrdersOnlyBuilder();
    }

    /**
     * create builder for NonRecurringOrdersOnly instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonRecurringOrdersOnlyBuilder of(final NonRecurringOrdersOnly template) {
        NonRecurringOrdersOnlyBuilder builder = new NonRecurringOrdersOnlyBuilder();
        return builder;
    }

}
