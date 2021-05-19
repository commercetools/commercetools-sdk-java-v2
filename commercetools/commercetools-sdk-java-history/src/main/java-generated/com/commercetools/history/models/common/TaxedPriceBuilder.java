
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedPriceBuilder {

    private com.commercetools.history.models.common.Money totalNet;

    private com.commercetools.history.models.common.Money totalGross;

    public TaxedPriceBuilder totalNet(final com.commercetools.history.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedPriceBuilder totalGross(final com.commercetools.history.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.history.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.history.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public TaxedPrice build() {
        return new TaxedPriceImpl(totalNet, totalGross);
    }

    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
