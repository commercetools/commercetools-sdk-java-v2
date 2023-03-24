
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedItemPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedItemPrice taxedItemPrice = TaxedItemPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedItemPriceBuilder implements Builder<TaxedItemPrice> {

    private com.commercetools.history.models.common.Money totalNet;

    private com.commercetools.history.models.common.Money totalGross;

    /**
     *
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedItemPriceBuilder totalNet(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param totalNet value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder totalNet(final com.commercetools.history.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedItemPriceBuilder totalGross(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param totalGross value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder totalGross(final com.commercetools.history.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.history.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.history.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    /**
     * builds TaxedItemPrice with checking for non-null required values
     * @return TaxedItemPrice
     */
    public TaxedItemPrice build() {
        Objects.requireNonNull(totalNet, TaxedItemPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPrice.class + ": totalGross is missing");
        return new TaxedItemPriceImpl(totalNet, totalGross);
    }

    /**
     * builds TaxedItemPrice without checking for non-null required values
     * @return TaxedItemPrice
     */
    public TaxedItemPrice buildUnchecked() {
        return new TaxedItemPriceImpl(totalNet, totalGross);
    }

    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
