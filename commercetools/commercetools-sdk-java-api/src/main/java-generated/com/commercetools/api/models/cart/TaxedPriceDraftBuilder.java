
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxedPriceDraftBuilder implements Builder<TaxedPriceDraft> {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

    public TaxedPriceDraftBuilder totalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedPriceDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedPriceDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public TaxedPriceDraftBuilder taxPortions(final com.commercetools.api.models.cart.TaxPortionDraft... taxPortions) {
        this.taxPortions = new ArrayList<>(Arrays.asList(taxPortions));
        return this;
    }

    public TaxedPriceDraftBuilder taxPortions(
            final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    public TaxedPriceDraftBuilder plusTaxPortions(
            final com.commercetools.api.models.cart.TaxPortionDraft... taxPortions) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.addAll(Arrays.asList(taxPortions));
        return this;
    }

    public TaxedPriceDraftBuilder plusTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.taxPortions == null) {
            this.taxPortions = new ArrayList<>();
        }
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public TaxedPriceDraftBuilder withTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        this.taxPortions = new ArrayList<>();
        this.taxPortions.add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions() {
        return this.taxPortions;
    }

    public TaxedPriceDraft build() {
        Objects.requireNonNull(totalNet, TaxedPriceDraft.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedPriceDraft.class + ": totalGross is missing");
        Objects.requireNonNull(taxPortions, TaxedPriceDraft.class + ": taxPortions is missing");
        return new TaxedPriceDraftImpl(totalNet, totalGross, taxPortions);
    }

    /**
     * builds TaxedPriceDraft without checking for non null required values
     */
    public TaxedPriceDraft buildUnchecked() {
        return new TaxedPriceDraftImpl(totalNet, totalGross, taxPortions);
    }

    public static TaxedPriceDraftBuilder of() {
        return new TaxedPriceDraftBuilder();
    }

    public static TaxedPriceDraftBuilder of(final TaxedPriceDraft template) {
        TaxedPriceDraftBuilder builder = new TaxedPriceDraftBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        return builder;
    }

}
