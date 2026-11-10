
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
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedItemPriceBuilder implements Builder<TaxedItemPrice> {

    private com.commercetools.api.models.common.CentPrecisionMoney totalNet;

    private com.commercetools.api.models.common.CentPrecisionMoney totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

    @Nullable
    private com.commercetools.api.models.common.CentPrecisionMoney totalTax;

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedItemPriceBuilder totalNet(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedItemPriceBuilder withTotalNet(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @param totalNet value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder totalNet(final com.commercetools.api.models.common.CentPrecisionMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedItemPriceBuilder totalGross(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedItemPriceBuilder withTotalGross(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
     * @param totalGross value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder totalGross(final com.commercetools.api.models.common.CentPrecisionMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder taxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder taxPortions(
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

    public TaxedItemPriceBuilder plusTaxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
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

    public TaxedItemPriceBuilder plusTaxPortions(
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

    public TaxedItemPriceBuilder withTaxPortions(
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

    public TaxedItemPriceBuilder addTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortion> builder) {
        return plusTaxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()));
    }

    /**
     *  <p>Taxable portions added to the total net price.</p>
     *  <p>Calculated from the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRates</a>.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedItemPriceBuilder setTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortion> builder) {
        return taxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()));
    }

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param builder function to build the totalTax value
     * @return Builder
     */

    public TaxedItemPriceBuilder totalTax(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param builder function to build the totalTax value
     * @return Builder
     */

    public TaxedItemPriceBuilder withTotalTax(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @param totalTax value to be set
     * @return Builder
     */

    public TaxedItemPriceBuilder totalTax(
            @Nullable final com.commercetools.api.models.common.CentPrecisionMoney totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    /**
     *  <p>Total net amount of the Line Item or Custom Line Item.</p>
     * @return totalNet
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalNet() {
        return this.totalNet;
    }

    /**
     *  <p>Total gross amount of the Line Item or Custom Line Item.</p>
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
     *  <p>Total tax applicable for the Line Item or Custom Line Item. Automatically calculated as the difference between the <code>totalGross</code> and <code>totalNet</code> values.</p>
     * @return totalTax
     */

    @Nullable
    public com.commercetools.api.models.common.CentPrecisionMoney getTotalTax() {
        return this.totalTax;
    }

    /**
     * builds TaxedItemPrice with checking for non-null required values
     * @return TaxedItemPrice
     */
    public TaxedItemPrice build() {
        Objects.requireNonNull(totalNet, TaxedItemPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPrice.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedItemPrice.class + ": taxPortions is missing");
        return new TaxedItemPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * builds TaxedItemPrice without checking for non-null required values
     * @return TaxedItemPrice
     */
    public TaxedItemPrice buildUnchecked() {
        return new TaxedItemPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * factory method for an instance of TaxedItemPriceBuilder
     * @return builder
     */
    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    /**
     * create builder for TaxedItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
