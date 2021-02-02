
package com.commercetools.importapi.models.orders;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceBuilder {

    private com.commercetools.importapi.models.common.Money totalNet;

    private com.commercetools.importapi.models.common.Money totalGross;

    private java.util.List<com.commercetools.importapi.models.orders.TaxPortion> taxPortions;

    public TaxedPriceBuilder totalNet(final com.commercetools.importapi.models.common.Money totalNet) {
        this.totalNet = totalNet;
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
