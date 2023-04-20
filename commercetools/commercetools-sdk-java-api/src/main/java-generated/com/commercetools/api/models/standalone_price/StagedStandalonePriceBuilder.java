
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedStandalonePriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedStandalonePrice stagedStandalonePrice = StagedStandalonePrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedStandalonePriceBuilder implements Builder<StagedStandalonePrice> {

    private com.commercetools.api.models.common.TypedMoney value;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedStandalonePriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StagedStandalonePriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StagedStandalonePriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @param builder function to build the discounted value
     * @return Builder
     */

    public StagedStandalonePriceBuilder withDiscounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPrice> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @param discounted value to be set
     * @return Builder
     */

    public StagedStandalonePriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    /**
     *  <p>Money value of the StagedStandalonePrice.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Discounted price for the StagedStandalonePrice.</p>
     * @return discounted
     */

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     * builds StagedStandalonePrice with checking for non-null required values
     * @return StagedStandalonePrice
     */
    public StagedStandalonePrice build() {
        Objects.requireNonNull(value, StagedStandalonePrice.class + ": value is missing");
        return new StagedStandalonePriceImpl(value, discounted);
    }

    /**
     * builds StagedStandalonePrice without checking for non-null required values
     * @return StagedStandalonePrice
     */
    public StagedStandalonePrice buildUnchecked() {
        return new StagedStandalonePriceImpl(value, discounted);
    }

    /**
     * factory method for an instance of StagedStandalonePriceBuilder
     * @return builder
     */
    public static StagedStandalonePriceBuilder of() {
        return new StagedStandalonePriceBuilder();
    }

    /**
     * create builder for StagedStandalonePrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedStandalonePriceBuilder of(final StagedStandalonePrice template) {
        StagedStandalonePriceBuilder builder = new StagedStandalonePriceBuilder();
        builder.value = template.getValue();
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
