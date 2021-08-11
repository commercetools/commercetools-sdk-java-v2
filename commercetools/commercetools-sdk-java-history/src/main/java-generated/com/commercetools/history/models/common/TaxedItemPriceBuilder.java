
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxedItemPriceBuilder implements Builder<TaxedItemPrice> {

    private com.commercetools.history.models.common.Money totalNet;

    private com.commercetools.history.models.common.Money totalGross;

    public TaxedItemPriceBuilder totalNet(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalNet = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceBuilder totalNet(final com.commercetools.history.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedItemPriceBuilder totalGross(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceBuilder totalGross(final com.commercetools.history.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public com.commercetools.history.models.common.Money getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.history.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public TaxedItemPrice build() {
        Objects.requireNonNull(totalNet, TaxedItemPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPrice.class + ": totalGross is missing");
        return new TaxedItemPriceImpl(totalNet, totalGross);
    }

    /**
     * builds TaxedItemPrice without checking for non null required values
     */
    public TaxedItemPrice buildUnchecked() {
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
