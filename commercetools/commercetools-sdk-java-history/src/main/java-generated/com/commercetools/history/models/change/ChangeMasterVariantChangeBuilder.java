
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeMasterVariantChangeBuilder {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    public ChangeMasterVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeMasterVariantChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public ChangeMasterVariantChangeBuilder previousValue(
            final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeMasterVariantChangeBuilder nextValue(final com.commercetools.history.models.common.Variant nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.common.Variant getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Variant getNextValue() {
        return this.nextValue;
    }

    public ChangeMasterVariantChange build() {
        return new ChangeMasterVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static ChangeMasterVariantChangeBuilder of() {
        return new ChangeMasterVariantChangeBuilder();
    }

    public static ChangeMasterVariantChangeBuilder of(final ChangeMasterVariantChange template) {
        ChangeMasterVariantChangeBuilder builder = new ChangeMasterVariantChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
