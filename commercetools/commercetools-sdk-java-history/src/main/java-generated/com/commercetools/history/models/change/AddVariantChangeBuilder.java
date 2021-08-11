
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddVariantChangeBuilder implements Builder<AddVariantChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    public AddVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddVariantChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public AddVariantChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    public AddVariantChangeBuilder previousValue(final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddVariantChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    public AddVariantChangeBuilder nextValue(final com.commercetools.history.models.common.Variant nextValue) {
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

    public AddVariantChange build() {
        Objects.requireNonNull(change, AddVariantChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, AddVariantChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, AddVariantChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddVariantChange.class + ": nextValue is missing");
        return new AddVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds AddVariantChange without checking for non null required values
     */
    public AddVariantChange buildUnchecked() {
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
