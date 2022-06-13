
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetDiscountedPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetDiscountedPriceAction standalonePriceSetDiscountedPriceAction = StandalonePriceSetDiscountedPriceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetDiscountedPriceActionBuilder
        implements Builder<StandalonePriceSetDiscountedPriceAction> {

    @Nullable
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StandalonePriceSetDiscountedPriceActionBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StandalonePriceSetDiscountedPriceActionBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    public StandalonePriceSetDiscountedPriceAction build() {
        return new StandalonePriceSetDiscountedPriceActionImpl(discounted);
    }

    /**
     * builds StandalonePriceSetDiscountedPriceAction without checking for non null required values
     */
    public StandalonePriceSetDiscountedPriceAction buildUnchecked() {
        return new StandalonePriceSetDiscountedPriceActionImpl(discounted);
    }

    public static StandalonePriceSetDiscountedPriceActionBuilder of() {
        return new StandalonePriceSetDiscountedPriceActionBuilder();
    }

    public static StandalonePriceSetDiscountedPriceActionBuilder of(
            final StandalonePriceSetDiscountedPriceAction template) {
        StandalonePriceSetDiscountedPriceActionBuilder builder = new StandalonePriceSetDiscountedPriceActionBuilder();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
