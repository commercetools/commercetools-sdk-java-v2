
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePriceChangeBuilder {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    public ChangePriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public ChangePriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ChangePriceChangeBuilder previousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangePriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
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

    public ChangePriceChange build() {
        return new ChangePriceChangeImpl(change, catalogData, priceId, previousValue, nextValue);
    }

    public static ChangePriceChangeBuilder of() {
        return new ChangePriceChangeBuilder();
    }

    public static ChangePriceChangeBuilder of(final ChangePriceChange template) {
        ChangePriceChangeBuilder builder = new ChangePriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
