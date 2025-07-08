
package com.commercetools.api.models.recurring_order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderSetKeyAction recurringOrderSetKeyAction = RecurringOrderSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetKeyActionBuilder implements Builder<RecurringOrderSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurringOrderSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds RecurringOrderSetKeyAction with checking for non-null required values
     * @return RecurringOrderSetKeyAction
     */
    public RecurringOrderSetKeyAction build() {
        return new RecurringOrderSetKeyActionImpl(key);
    }

    /**
     * builds RecurringOrderSetKeyAction without checking for non-null required values
     * @return RecurringOrderSetKeyAction
     */
    public RecurringOrderSetKeyAction buildUnchecked() {
        return new RecurringOrderSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of RecurringOrderSetKeyActionBuilder
     * @return builder
     */
    public static RecurringOrderSetKeyActionBuilder of() {
        return new RecurringOrderSetKeyActionBuilder();
    }

    /**
     * create builder for RecurringOrderSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderSetKeyActionBuilder of(final RecurringOrderSetKeyAction template) {
        RecurringOrderSetKeyActionBuilder builder = new RecurringOrderSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
