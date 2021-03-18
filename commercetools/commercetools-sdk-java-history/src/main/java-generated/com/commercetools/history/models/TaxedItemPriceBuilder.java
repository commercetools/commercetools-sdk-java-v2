
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedItemPriceBuilder {

    private com.commercetools.history.models.Money totalNet;

    private com.commercetools.history.models.Money totalGross;

    public TaxedItemPriceBuilder totalNet(final com.commercetools.history.models.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedItemPriceBuilder totalGross(final com.commercetools.history.models.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.history.models.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.history.models.Money getTotalGross() {
        return this.totalGross;
    }

    public TaxedItemPrice build() {
        return new TaxedItemPriceImpl(totalNet, totalGross);
    }

    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
