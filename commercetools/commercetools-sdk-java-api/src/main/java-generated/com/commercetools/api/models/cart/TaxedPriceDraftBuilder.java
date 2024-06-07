
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedPriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPriceDraft taxedPriceDraft = TaxedPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxedPriceDraftBuilder implements Builder<TaxedPriceDraft> {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

    @Nullable
    private com.commercetools.api.models.common.TypedMoneyDraft totalTax;

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param builder function to build the totalNet value
     * @return Builder
     */

    public TaxedPriceDraftBuilder withTotalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @param totalNet value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */

    public TaxedPriceDraftBuilder withTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @param totalGross value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder taxPortions(final com.commercetools.api.models.cart.TaxPortionDraft... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder taxPortions(
            final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param taxPortions value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder plusTaxPortions(
            final com.commercetools.api.models.cart.TaxPortionDraft... taxPortions) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.addAll(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceDraftBuilder plusTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceDraftBuilder withTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceDraftBuilder addTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraft> builder) {
        return plusTaxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()));
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @param builder function to build the taxPortions value
     * @return Builder
     */

    public TaxedPriceDraftBuilder setTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraft> builder) {
        return taxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()));
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     * @param totalTax value to be set
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalTax(
            @Nullable final com.commercetools.api.models.common.TypedMoneyDraft totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     * @param builder function to build the totalTax value
     * @return Builder
     */

    public TaxedPriceDraftBuilder totalTax(
            Function<com.commercetools.api.models.common.TypedMoneyDraftBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoneyDraft>> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.TypedMoneyDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total net price of the Cart or Order.</p>
     * @return totalNet
     */

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    /**
     *  <p>Total gross price of the Cart or Order.</p>
     * @return totalGross
     */

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @return taxPortions
     */

    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions() {
        return this.taxPortions;
    }

    /**
     *  <p>Total tax applicable for the Cart or Order.</p>
     * @return totalTax
     */

    @Nullable
    public com.commercetools.api.models.common.TypedMoneyDraft getTotalTax() {
        return this.totalTax;
    }

    /**
     * builds TaxedPriceDraft with checking for non-null required values
     * @return TaxedPriceDraft
     */
    public TaxedPriceDraft build() {
        Objects.requireNonNull(totalNet, TaxedPriceDraft.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPriceDraft.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedPriceDraft.class + ": taxPortions is missing");
        return new TaxedPriceDraftImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * builds TaxedPriceDraft without checking for non-null required values
     * @return TaxedPriceDraft
     */
    public TaxedPriceDraft buildUnchecked() {
        return new TaxedPriceDraftImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * factory method for an instance of TaxedPriceDraftBuilder
     * @return builder
     */
    public static TaxedPriceDraftBuilder of() {
        return new TaxedPriceDraftBuilder();
    }

    /**
     * create builder for TaxedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxedPriceDraftBuilder of(final TaxedPriceDraft template) {
        TaxedPriceDraftBuilder builder = new TaxedPriceDraftBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
