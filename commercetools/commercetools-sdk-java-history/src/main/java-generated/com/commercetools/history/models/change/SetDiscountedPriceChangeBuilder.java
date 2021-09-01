
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDiscountedPriceChangeBuilder implements Builder<SetDiscountedPriceChange> {

    private String change;

    private String catalogData;

    private String variant;

    private String priceId;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    public SetDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDiscountedPriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetDiscountedPriceChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetDiscountedPriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public SetDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    public SetDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    public SetDiscountedPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getVariant() {
        return this.variant;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    public SetDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetDiscountedPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetDiscountedPriceChange.class + ": variant is missing");
        Objects.requireNonNull(priceId, SetDiscountedPriceChange.class + ": priceId is missing");
        Objects.requireNonNull(previousValue, SetDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDiscountedPriceChange.class + ": nextValue is missing");
        return new SetDiscountedPriceChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }

    /**
     * builds SetDiscountedPriceChange without checking for non null required values
     */
    public SetDiscountedPriceChange buildUnchecked() {
        return new SetDiscountedPriceChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }

    public static SetDiscountedPriceChangeBuilder of() {
        return new SetDiscountedPriceChangeBuilder();
    }

    public static SetDiscountedPriceChangeBuilder of(final SetDiscountedPriceChange template) {
        SetDiscountedPriceChangeBuilder builder = new SetDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
