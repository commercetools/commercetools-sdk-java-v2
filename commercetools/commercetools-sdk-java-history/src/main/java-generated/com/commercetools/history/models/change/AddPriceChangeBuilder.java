
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddPriceChangeBuilder implements Builder<AddPriceChange> {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price nextValue;

    public AddPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddPriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public AddPriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public AddPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    public AddPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
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

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    public AddPriceChange build() {
        Objects.requireNonNull(change, AddPriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, AddPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, AddPriceChange.class + ": priceId is missing");
        Objects.requireNonNull(nextValue, AddPriceChange.class + ": nextValue is missing");
        return new AddPriceChangeImpl(change, catalogData, priceId, nextValue);
    }

    /**
     * builds AddPriceChange without checking for non null required values
     */
    public AddPriceChange buildUnchecked() {
        return new AddPriceChangeImpl(change, catalogData, priceId, nextValue);
    }

    public static AddPriceChangeBuilder of() {
        return new AddPriceChangeBuilder();
    }

    public static AddPriceChangeBuilder of(final AddPriceChange template) {
        AddPriceChangeBuilder builder = new AddPriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
