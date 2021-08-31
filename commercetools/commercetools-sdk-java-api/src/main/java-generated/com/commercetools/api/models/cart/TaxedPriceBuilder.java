
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceBuilder implements Builder<TaxedPrice> {

    private com.commercetools.api.models.common.TypedMoney totalNet;

    private com.commercetools.api.models.common.TypedMoney totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;

    public TaxedPriceBuilder totalNet(final com.commercetools.api.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedPriceBuilder totalGross(final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public TaxedPriceBuilder taxPortions(final com.commercetools.api.models.cart.TaxPortion... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    public TaxedPriceBuilder withTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortionBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()).build());
        return this;
    }

    public TaxedPriceBuilder plusTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionBuilder, com.commercetools.api.models.cart.TaxPortionBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionBuilder.of()).build());
        return this;
    }

    public TaxedPriceBuilder taxPortions(
            final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions() {
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
