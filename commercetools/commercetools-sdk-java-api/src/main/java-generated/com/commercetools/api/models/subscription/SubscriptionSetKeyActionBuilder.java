
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
     */

    public SubscriptionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public SubscriptionSetKeyAction build() {
        return new SubscriptionSetKeyActionImpl(key);
    }

    /**
     * builds SubscriptionSetKeyAction without checking for non null required values
     */
    public SubscriptionSetKeyAction buildUnchecked() {
        return new SubscriptionSetKeyActionImpl(key);
    }

    public static SubscriptionSetKeyActionBuilder of() {
        return new SubscriptionSetKeyActionBuilder();
    }

    public static SubscriptionSetKeyActionBuilder of(final SubscriptionSetKeyAction template) {
        SubscriptionSetKeyActionBuilder builder = new SubscriptionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
