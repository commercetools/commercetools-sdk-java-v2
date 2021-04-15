
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceDraftBuilder {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;

    public TaxedPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
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
