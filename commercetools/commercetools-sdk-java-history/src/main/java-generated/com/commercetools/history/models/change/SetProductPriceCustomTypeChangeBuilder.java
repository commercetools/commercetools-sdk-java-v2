
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetProductPriceCustomTypeChangeBuilder implements Builder<SetProductPriceCustomTypeChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    public SetProductPriceCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetProductPriceCustomTypeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetProductPriceCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetProductPriceCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetProductPriceCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetProductPriceCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public SetProductPriceCustomTypeChange build() {
        Objects.requireNonNull(change, SetProductPriceCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductPriceCustomTypeChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductPriceCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductPriceCustomTypeChange.class + ": nextValue is missing");
        return new SetProductPriceCustomTypeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductPriceCustomTypeChange without checking for non null required values
     */
    public SetProductPriceCustomTypeChange buildUnchecked() {
        return new SetProductPriceCustomTypeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetProductPriceCustomTypeChangeBuilder of() {
        return new SetProductPriceCustomTypeChangeBuilder();
    }

    public static SetProductPriceCustomTypeChangeBuilder of(final SetProductPriceCustomTypeChange template) {
        SetProductPriceCustomTypeChangeBuilder builder = new SetProductPriceCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
