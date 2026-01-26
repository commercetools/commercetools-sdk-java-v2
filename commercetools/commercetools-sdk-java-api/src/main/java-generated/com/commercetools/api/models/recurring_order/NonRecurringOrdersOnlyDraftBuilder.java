
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NonRecurringOrdersOnlyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonRecurringOrdersOnlyDraft nonRecurringOrdersOnlyDraft = NonRecurringOrdersOnlyDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NonRecurringOrdersOnlyDraftBuilder implements Builder<NonRecurringOrdersOnlyDraft> {

    /**
     * builds NonRecurringOrdersOnlyDraft with checking for non-null required values
     * @return NonRecurringOrdersOnlyDraft
     */
    public NonRecurringOrdersOnlyDraft build() {
        return new NonRecurringOrdersOnlyDraftImpl();
    }

    /**
     * builds NonRecurringOrdersOnlyDraft without checking for non-null required values
     * @return NonRecurringOrdersOnlyDraft
     */
    public NonRecurringOrdersOnlyDraft buildUnchecked() {
        return new NonRecurringOrdersOnlyDraftImpl();
    }

    /**
     * factory method for an instance of NonRecurringOrdersOnlyDraftBuilder
     * @return builder
     */
    public static NonRecurringOrdersOnlyDraftBuilder of() {
        return new NonRecurringOrdersOnlyDraftBuilder();
    }

    /**
     * create builder for NonRecurringOrdersOnlyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonRecurringOrdersOnlyDraftBuilder of(final NonRecurringOrdersOnlyDraft template) {
        NonRecurringOrdersOnlyDraftBuilder builder = new NonRecurringOrdersOnlyDraftBuilder();
        return builder;
    }

}
