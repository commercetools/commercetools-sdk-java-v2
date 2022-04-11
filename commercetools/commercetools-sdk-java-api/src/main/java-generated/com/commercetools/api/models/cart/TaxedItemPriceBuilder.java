
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxedItemPriceBuilder implements Builder<TaxedItemPrice> {

    private com.commercetools.api.models.common.TypedMoney totalNet;

    private com.commercetools.api.models.common.TypedMoney totalGross;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney totalTax;

    public TaxedItemPriceBuilder totalNet(final com.commercetools.api.models.common.TypedMoney totalNet) {
        this.totalNet = totalNet;
        return this;
    }

    public TaxedItemPriceBuilder totalNet(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalNet = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceBuilder totalGross(final com.commercetools.api.models.common.TypedMoney totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public TaxedItemPriceBuilder totalGross(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public TaxedItemPriceBuilder totalTax(@Nullable final com.commercetools.api.models.common.TypedMoney totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public TaxedItemPriceBuilder totalTax(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.totalTax = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalNet() {
        return this.totalNet;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalGross() {
        return this.totalGross;
    }

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getTotalTax() {
        return this.totalTax;
    }

    public TaxedItemPrice build() {
        Objects.requireNonNull(totalNet, TaxedItemPrice.class + ": totalNet is missing");
        Objects.requireNonNull(totalGross, TaxedItemPrice.class + ": totalGross is missing");
        return new TaxedItemPriceImpl(totalNet, totalGross, totalTax);
    }

    /**
     * builds TaxedItemPrice without checking for non null required values
     */
    public TaxedItemPrice buildUnchecked() {
        return new TaxedItemPriceImpl(totalNet, totalGross, totalTax);
    }

    public static TaxedItemPriceBuilder of() {
        return new TaxedItemPriceBuilder();
    }

    public static TaxedItemPriceBuilder of(final TaxedItemPrice template) {
        TaxedItemPriceBuilder builder = new TaxedItemPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.totalTax = template.getTotalTax();
        return builder;
    }

}
