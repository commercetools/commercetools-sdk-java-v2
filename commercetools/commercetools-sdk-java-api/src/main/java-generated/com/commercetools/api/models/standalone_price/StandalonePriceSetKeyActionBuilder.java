
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
     */

    public StandalonePriceSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public StandalonePriceSetKeyAction build() {
        return new StandalonePriceSetKeyActionImpl(key);
    }

    /**
     * builds StandalonePriceSetKeyAction without checking for non null required values
     */
    public StandalonePriceSetKeyAction buildUnchecked() {
        return new StandalonePriceSetKeyActionImpl(key);
    }

    public static StandalonePriceSetKeyActionBuilder of() {
        return new StandalonePriceSetKeyActionBuilder();
    }

    public static StandalonePriceSetKeyActionBuilder of(final StandalonePriceSetKeyAction template) {
        StandalonePriceSetKeyActionBuilder builder = new StandalonePriceSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
