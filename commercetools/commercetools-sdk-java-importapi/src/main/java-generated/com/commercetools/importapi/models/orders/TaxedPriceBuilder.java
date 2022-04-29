
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxedPriceBuilder implements Builder<TaxedPrice> {

    private com.commercetools.importapi.models.common.Money totalNet;

    private com.commercetools.importapi.models.common.Money totalGross;

    private java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions;

    @Nullable
    private com.commercetools.importapi.models.common.Money totalTax;

    public TaxedPriceBuilder totalNet(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedPriceBuilder totalNet(final com.commercetools.importapi.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedPriceBuilder totalGross(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedPriceBuilder totalGross(final com.commercetools.importapi.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public TaxedPriceBuilder taxPortions(final com.commercetools.importapi.models.orders.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    public TaxedPriceBuilder taxPortions(
            final java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    public TaxedPriceBuilder plusTaxPortions(
            final com.commercetools.importapi.models.orders.TaxPortion... taxPortions) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.addAll(Arrays.asList(taxPortions));
        return this;
    }

    public TaxedPriceBuilder plusTaxPortions(
            Function<com.commercetools.importapi.models.orders.TaxPortionBuilder, com.commercetools.importapi.models.orders.TaxPortionBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.importapi.models.orders.TaxPortionBuilder.of()).build());
        return this;
    }

    public TaxedPriceBuilder withTaxPortions(
            Function<com.commercetools.importapi.models.orders.TaxPortionBuilder, com.commercetools.importapi.models.orders.TaxPortionBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.importapi.models.orders.TaxPortionBuilder.of()).build());
        return this;
    }

    public TaxedPriceBuilder totalTax(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.totalTax = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedPriceBuilder totalTax(@Nullable final com.commercetools.importapi.models.common.Money totalTax) {
        this.totalTax = totalTax;
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

    @Nullable
    public com.commercetools.importapi.models.common.Money getTotalTax() {
        return this.totalTax;
    }

    public TaxedPrice build() {
        Objects.requireNonNull(totalNet, TaxedPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPrice.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedPrice.class + ": taxPortions is missing");
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    /**
     * builds TaxedPrice without checking for non null required values
     */
    public TaxedPrice buildUnchecked() {
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions, totalTax);
    }

    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
