
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetPricesChangeBuilder {

    private String change;

    private String catalogData;

    private String variant;

    private java.util.List<com.commercetools.history.models.common.Price> previousValue;

    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    public SetPricesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetPricesChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetPricesChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetPricesChangeBuilder previousValue(final com.commercetools.history.models.common.Price... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetPricesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetPricesChangeBuilder nextValue(final com.commercetools.history.models.common.Price... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetPricesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
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

    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Price> getNextValue() {
        return this.nextValue;
    }

    public SetPricesChange build() {
        return new SetPricesChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    public static SetPricesChangeBuilder of() {
        return new SetPricesChangeBuilder();
    }

    public static SetPricesChangeBuilder of(final SetPricesChange template) {
        SetPricesChangeBuilder builder = new SetPricesChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
