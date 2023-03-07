
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    private com.commercetools.api.models.common.CentPrecisionMoney totalNet;

    private com.commercetools.api.models.common.CentPrecisionMoney totalGross;

    @Nullable
    private com.commercetools.api.models.common.CentPrecisionMoney totalTax;

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     */

    public TaxedItemPriceBuilder totalNet(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     */

    public TaxedItemPriceBuilder totalNet(final com.commercetools.api.models.common.CentPrecisionMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     */

    public TaxedItemPriceBuilder totalGross(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     */

    public TaxedItemPriceBuilder totalGross(final com.commercetools.api.models.common.CentPrecisionMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     */

    public TaxedItemPriceBuilder totalTax(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     */

    public TaxedItemPriceBuilder totalTax(
            @Nullable final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalGross() {
        return this.totalGross;
    }

    @Nullable
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalTax() {
        return this.totalTax;
    }

    public TaxedItemPrice build() {
        Objects.requireNonNull(totalNet, TaxedItemPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPrice.class + ": totalGross is missing");
        return new TaxedItemPriceImpl(totalNet, totalGross, totalTax);
    }

    /**
     * builds TaxedItemPrice without checking for non null required values
     */
    public TaxedItemPrice buildUnchecked() {
        return new TaxedItemPriceImpl(totalNet, totalGross, totalTax);
    }

    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
