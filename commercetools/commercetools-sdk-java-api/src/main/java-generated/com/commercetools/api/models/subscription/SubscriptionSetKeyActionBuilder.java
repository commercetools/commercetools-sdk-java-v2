
package com.commercetools.api.models.subscription;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetKeyAction subscriptionSetKeyAction = SubscriptionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetKeyActionBuilder implements Builder<SubscriptionSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public SubscriptionSetKeyActionBuilder key(@Nullable final String key) {
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
     * builds SubscriptionSetKeyAction with checking for non-null required values
     * @return SubscriptionSetKeyAction
     */
    public SubscriptionSetKeyAction build() {
        return new SubscriptionSetKeyActionImpl(key);
    }

    /**
     * builds SubscriptionSetKeyAction without checking for non-null required values
     * @return SubscriptionSetKeyAction
     */
    public SubscriptionSetKeyAction buildUnchecked() {
        return new SubscriptionSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of SubscriptionSetKeyActionBuilder
     * @return builder
     */
    public static SubscriptionSetKeyActionBuilder of() {
        return new SubscriptionSetKeyActionBuilder();
    }

    /**
     * create builder for SubscriptionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetKeyActionBuilder of(final SubscriptionSetKeyAction template) {
        SubscriptionSetKeyActionBuilder builder = new SubscriptionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
