
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedItemPriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedItemPriceDraft taxedItemPriceDraft = TaxedItemPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedItemPriceDraftBuilder implements Builder<TaxedItemPriceDraft> {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder totalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder withTotalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param totalNet value to be set
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder withTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @param totalGross value to be set
     * @return Builder
     */

    public TaxedItemPriceDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @return totalNet
     */

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    /**
     *  <p>Draft object to store money in cent amounts for a specific currency.</p>
     * @return totalGross
     */

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    /**
     * builds TaxedItemPriceDraft with checking for non-null required values
     * @return TaxedItemPriceDraft
     */
    public TaxedItemPriceDraft build() {
        Objects.requireNonNull(totalNet, TaxedItemPriceDraft.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPriceDraft.class + ": totalGross is missing");
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    /**
     * builds TaxedItemPriceDraft without checking for non-null required values
     * @return TaxedItemPriceDraft
     */
    public TaxedItemPriceDraft buildUnchecked() {
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    /**
     * factory method for an instance of TaxedItemPriceDraftBuilder
     * @return builder
     */
    public static TaxedItemPriceDraftBuilder of() {
        return new TaxedItemPriceDraftBuilder();
    }

    /**
     * create builder for TaxedItemPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedItemPriceDraftBuilder of(final TaxedItemPriceDraft template) {
        TaxedItemPriceDraftBuilder builder = new TaxedItemPriceDraftBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
