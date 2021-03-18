
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddPriceChangeBuilder {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.Price nextValue;

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

    public AddPriceChangeBuilder nextValue(final com.commercetools.history.models.Price nextValue) {
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

    public com.commercetools.history.models.Price getNextValue() {
        return this.nextValue;
    }

    public AddPriceChange build() {
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
