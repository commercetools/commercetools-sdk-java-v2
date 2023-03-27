
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetKeyAction standalonePriceSetKeyAction = StandalonePriceSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetKeyActionBuilder implements Builder<StandalonePriceSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public StandalonePriceSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds StandalonePriceSetKeyAction with checking for non-null required values
     * @return StandalonePriceSetKeyAction
     */
    public StandalonePriceSetKeyAction build() {
        return new StandalonePriceSetKeyActionImpl(key);
    }

    /**
     * builds StandalonePriceSetKeyAction without checking for non-null required values
     * @return StandalonePriceSetKeyAction
     */
    public StandalonePriceSetKeyAction buildUnchecked() {
        return new StandalonePriceSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of StandalonePriceSetKeyActionBuilder
     * @return builder
     */
    public static StandalonePriceSetKeyActionBuilder of() {
        return new StandalonePriceSetKeyActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetKeyActionBuilder of(final StandalonePriceSetKeyAction template) {
        StandalonePriceSetKeyActionBuilder builder = new StandalonePriceSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
