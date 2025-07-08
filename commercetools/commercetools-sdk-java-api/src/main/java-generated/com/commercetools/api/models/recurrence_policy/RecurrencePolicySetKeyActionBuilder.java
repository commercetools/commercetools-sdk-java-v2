
package com.commercetools.api.models.recurrence_policy;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetKeyAction recurrencePolicySetKeyAction = RecurrencePolicySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicySetKeyActionBuilder implements Builder<RecurrencePolicySetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurrencePolicySetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds RecurrencePolicySetKeyAction with checking for non-null required values
     * @return RecurrencePolicySetKeyAction
     */
    public RecurrencePolicySetKeyAction build() {
        return new RecurrencePolicySetKeyActionImpl(key);
    }

    /**
     * builds RecurrencePolicySetKeyAction without checking for non-null required values
     * @return RecurrencePolicySetKeyAction
     */
    public RecurrencePolicySetKeyAction buildUnchecked() {
        return new RecurrencePolicySetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of RecurrencePolicySetKeyActionBuilder
     * @return builder
     */
    public static RecurrencePolicySetKeyActionBuilder of() {
        return new RecurrencePolicySetKeyActionBuilder();
    }

    /**
     * create builder for RecurrencePolicySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetKeyActionBuilder of(final RecurrencePolicySetKeyAction template) {
        RecurrencePolicySetKeyActionBuilder builder = new RecurrencePolicySetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
