
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddVariantChangeBuilder {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.Variant previousValue;

    private com.commercetools.history.models.Variant nextValue;

    public AddVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddVariantChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public AddVariantChangeBuilder previousValue(final com.commercetools.history.models.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddVariantChangeBuilder nextValue(final com.commercetools.history.models.Variant nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.Variant getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Variant getNextValue() {
        return this.nextValue;
    }

    public AddVariantChange build() {
        return new AddVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static AddVariantChangeBuilder of() {
        return new AddVariantChangeBuilder();
    }

    public static AddVariantChangeBuilder of(final AddVariantChange template) {
        AddVariantChangeBuilder builder = new AddVariantChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
