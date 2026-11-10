
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrdersOnlyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrdersOnlyDraft recurringOrdersOnlyDraft = RecurringOrdersOnlyDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrdersOnlyDraftBuilder implements Builder<RecurringOrdersOnlyDraft> {

    /**
     * builds RecurringOrdersOnlyDraft with checking for non-null required values
     * @return RecurringOrdersOnlyDraft
     */
    public RecurringOrdersOnlyDraft build() {
        return new RecurringOrdersOnlyDraftImpl();
    }

    /**
     * builds RecurringOrdersOnlyDraft without checking for non-null required values
     * @return RecurringOrdersOnlyDraft
     */
    public RecurringOrdersOnlyDraft buildUnchecked() {
        return new RecurringOrdersOnlyDraftImpl();
    }

    /**
     * factory method for an instance of RecurringOrdersOnlyDraftBuilder
     * @return builder
     */
    public static RecurringOrdersOnlyDraftBuilder of() {
        return new RecurringOrdersOnlyDraftBuilder();
    }

    /**
     * create builder for RecurringOrdersOnlyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrdersOnlyDraftBuilder of(final RecurringOrdersOnlyDraft template) {
        RecurringOrdersOnlyDraftBuilder builder = new RecurringOrdersOnlyDraftBuilder();
        return builder;
    }

}
