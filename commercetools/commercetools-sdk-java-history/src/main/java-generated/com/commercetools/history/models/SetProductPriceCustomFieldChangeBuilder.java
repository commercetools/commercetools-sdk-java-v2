
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetProductPriceCustomFieldChangeBuilder {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.CustomFields previousValue;

    private com.commercetools.history.models.CustomFields nextValue;

    public SetProductPriceCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder previousValue(
            final com.commercetools.history.models.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder nextValue(
            final com.commercetools.history.models.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.CustomFields getNextValue() {
        return this.nextValue;
    }

    public SetProductPriceCustomFieldChange build() {
        return new SetProductPriceCustomFieldChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetProductPriceCustomFieldChangeBuilder of() {
        return new SetProductPriceCustomFieldChangeBuilder();
    }

    public static SetProductPriceCustomFieldChangeBuilder of(final SetProductPriceCustomFieldChange template) {
        SetProductPriceCustomFieldChangeBuilder builder = new SetProductPriceCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
