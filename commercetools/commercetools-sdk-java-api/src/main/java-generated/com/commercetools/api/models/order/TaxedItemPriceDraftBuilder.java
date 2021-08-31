
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedItemPriceDraftBuilder implements Builder<TaxedItemPriceDraft> {

    private com.commercetools.api.models.common.Money totalNet;

    private com.commercetools.api.models.common.Money totalGross;

    public TaxedItemPriceDraftBuilder totalNet(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceDraftBuilder totalNet(final com.commercetools.api.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedItemPriceDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.api.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public TaxedItemPriceDraft build() {
        Objects.requireNonNull(totalNet, TaxedItemPriceDraft.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPriceDraft.class + ": totalGross is missing");
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    /**
     * builds TaxedItemPriceDraft without checking for non null required values
     */
    public TaxedItemPriceDraft buildUnchecked() {
        return new TaxedItemPriceDraftImpl(totalNet, totalGross);
    }

    public static TaxedItemPriceDraftBuilder of() {
        return new TaxedItemPriceDraftBuilder();
    }

    public static TaxedItemPriceDraftBuilder of(final TaxedItemPriceDraft template) {
        TaxedItemPriceDraftBuilder builder = new TaxedItemPriceDraftBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        return builder;
    }

}
