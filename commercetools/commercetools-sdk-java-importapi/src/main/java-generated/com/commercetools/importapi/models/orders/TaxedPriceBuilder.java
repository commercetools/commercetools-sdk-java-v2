
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

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

    private com.commercetools.importapi.models.common.Money totalNet;

    private com.commercetools.importapi.models.common.Money totalGross;

    private java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions;

    /**
     *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
     */

    public TaxedPriceBuilder totalNet(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.totalNet</code>.</p>
     */

    public TaxedPriceBuilder totalNet(final com.commercetools.importapi.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
     */

    public TaxedPriceBuilder totalGross(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.totalGross</code>.</p>
     */

    public TaxedPriceBuilder totalGross(final com.commercetools.importapi.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     */

    public TaxedPriceBuilder taxPortions(final com.commercetools.importapi.models.orders.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     */

    public TaxedPriceBuilder taxPortions(
            final java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     */

    public TaxedPriceBuilder plusTaxPortions(
            final com.commercetools.importapi.models.orders.TaxPortion... taxPortions) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.addAll(Arrays.asList(taxPortions));
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     */

    public TaxedPriceBuilder plusTaxPortions(
            Function<com.commercetools.importapi.models.orders.TaxPortionBuilder, com.commercetools.importapi.models.orders.TaxPortionBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.importapi.models.orders.TaxPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>TaxedPrice.taxPortions</code>.</p>
     */

    public TaxedPriceBuilder withTaxPortions(
            Function<com.commercetools.importapi.models.orders.TaxPortionBuilder, com.commercetools.importapi.models.orders.TaxPortionBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.importapi.models.orders.TaxPortionBuilder.of()).build());
        return this;
    }

    public com.commercetools.importapi.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.importapi.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public java.util.List<com.commercetools.importapi.models.orders.TaxPortion> getTaxPortions() {
        return this.taxPortions;
    }

    public TaxedPrice build() {
        Objects.requireNonNull(totalNet, TaxedPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPrice.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedPrice.class + ": taxPortions is missing");
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions);
    }

    /**
     * builds TaxedPrice without checking for non null required values
     */
    public TaxedPrice buildUnchecked() {
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions);
    }

    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        return builder;
    }

}
