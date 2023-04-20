
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
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceActionBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraftBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceActionBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceDraftBuilder, com.commercetools.api.models.common.DiscountedPriceDraft> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StandalonePriceSetDiscountedPriceActionBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted() {
        return this.discounted;
    }

    /**
     * builds StandalonePriceSetDiscountedPriceAction with checking for non-null required values
     * @return StandalonePriceSetDiscountedPriceAction
     */
    public StandalonePriceSetDiscountedPriceAction build() {
        return new StandalonePriceSetDiscountedPriceActionImpl(discounted);
    }

    /**
     * builds StandalonePriceSetDiscountedPriceAction without checking for non-null required values
     * @return StandalonePriceSetDiscountedPriceAction
     */
    public StandalonePriceSetDiscountedPriceAction buildUnchecked() {
        return new StandalonePriceSetDiscountedPriceActionImpl(discounted);
    }

    /**
     * factory method for an instance of StandalonePriceSetDiscountedPriceActionBuilder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceActionBuilder of() {
        return new StandalonePriceSetDiscountedPriceActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetDiscountedPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetDiscountedPriceActionBuilder of(
            final StandalonePriceSetDiscountedPriceAction template) {
        StandalonePriceSetDiscountedPriceActionBuilder builder = new StandalonePriceSetDiscountedPriceActionBuilder();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
