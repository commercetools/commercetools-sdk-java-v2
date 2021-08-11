
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetProductPriceCustomFieldChangeBuilder implements Builder<SetProductPriceCustomFieldChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    public SetProductPriceCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetProductPriceCustomFieldChangeBuilder nextValue(
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

    public SetProductPriceCustomFieldChange build() {
        Objects.requireNonNull(change, SetProductPriceCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductPriceCustomFieldChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductPriceCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductPriceCustomFieldChange.class + ": nextValue is missing");
        return new SetProductPriceCustomFieldChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductPriceCustomFieldChange without checking for non null required values
     */
    public SetProductPriceCustomFieldChange buildUnchecked() {
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
