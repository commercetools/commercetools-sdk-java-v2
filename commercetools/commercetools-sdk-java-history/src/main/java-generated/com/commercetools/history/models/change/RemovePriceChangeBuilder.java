
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemovePriceChangeBuilder implements Builder<RemovePriceChange> {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    public RemovePriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemovePriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public RemovePriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public RemovePriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    public RemovePriceChangeBuilder previousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemovePriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    public RemovePriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
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

    public RemovePriceChange build() {
        Objects.requireNonNull(change, RemovePriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, RemovePriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, RemovePriceChange.class + ": priceId is missing");
        Objects.requireNonNull(previousValue, RemovePriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemovePriceChange.class + ": nextValue is missing");
        return new RemovePriceChangeImpl(change, catalogData, priceId, previousValue, nextValue);
    }

    /**
     * builds RemovePriceChange without checking for non null required values
     */
    public RemovePriceChange buildUnchecked() {
        return new RemovePriceChangeImpl(change, catalogData, priceId, previousValue, nextValue);
    }

    public static RemovePriceChangeBuilder of() {
        return new RemovePriceChangeBuilder();
    }

    public static RemovePriceChangeBuilder of(final RemovePriceChange template) {
        RemovePriceChangeBuilder builder = new RemovePriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
