
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPrice taxedPrice = TaxedPrice.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedPriceBuilder implements Builder<TaxedPrice> {

    private com.commercetools.api.models.common.CentPrecisionMoney totalNet;

    private com.commercetools.api.models.common.CentPrecisionMoney totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

    @Nullable
    private com.commercetools.api.models.common.CentPrecisionMoney totalTax;

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedPriceBuilder totalNet(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedPriceBuilder withTotalNet(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param totalNet value to be set
     * @return Builder
     */

    public TaxedPriceBuilder totalNet(final com.commercetools.api.models.common.CentPrecisionMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedPriceBuilder totalGross(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedPriceBuilder withTotalGross(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param totalGross value to be set
     * @return Builder
     */

    public TaxedPriceBuilder totalGross(final com.commercetools.api.models.common.CentPrecisionMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceBuilder taxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceBuilder taxPortions(
            final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceBuilder plusTaxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.addAll(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceBuilder plusTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortionBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceBuilder withTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortionBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceBuilder addTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortion> builder) {
        return plusTaxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()));
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceBuilder setTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortion> builder) {
        return taxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()));
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param builder function to build the totalTax value
     * @return Builder
     */

    public TaxedPriceBuilder totalTax(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param builder function to build the totalTax value
     * @return Builder
     */

    public TaxedPriceBuilder withTotalTax(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param totalTax value to be set
     * @return Builder
     */

    public TaxedPriceBuilder totalTax(@Nullable final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @return totalNet
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalNet() {
        return this.totalNet;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @return totalGross
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalGross() {
        return this.totalGross;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @return taxPortions
     */

    public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions() {
        return this.taxPortions;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     *  <p>Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @return totalTax
     */

    @Nullable
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalTax() {
        return this.totalTax;
    }

    /**
     * builds TaxedPrice with checking for non-null required values
     * @return TaxedPrice
     */
    public TaxedPrice build() {
        Objects.requireNonNull(totalNet, TaxedPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPrice.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedPrice.class + ": taxPortions is missing");
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * builds TaxedPrice without checking for non-null required values
     * @return TaxedPrice
     */
    public TaxedPrice buildUnchecked() {
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * factory method for an instance of TaxedPriceBuilder
     * @return builder
     */
    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    /**
     * create builder for TaxedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
