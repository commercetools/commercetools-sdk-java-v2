
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemovePriceChangeBuilder {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.Price previousValue;

    private com.commercetools.history.models.Price nextValue;

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

    public RemovePriceChangeBuilder previousValue(final com.commercetools.history.models.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemovePriceChangeBuilder nextValue(final com.commercetools.history.models.Price nextValue) {
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

    public com.commercetools.history.models.Price getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Price getNextValue() {
        return this.nextValue;
    }

    public RemovePriceChange build() {
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
