
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveVariantChangeBuilder implements Builder<RemoveVariantChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    public RemoveVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveVariantChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public RemoveVariantChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    public RemoveVariantChangeBuilder previousValue(
            final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveVariantChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    public RemoveVariantChangeBuilder nextValue(final com.commercetools.history.models.common.Variant nextValue) {
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

    public RemoveVariantChange build() {
        Objects.requireNonNull(change, RemoveVariantChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, RemoveVariantChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, RemoveVariantChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveVariantChange.class + ": nextValue is missing");
        return new RemoveVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds RemoveVariantChange without checking for non null required values
     */
    public RemoveVariantChange buildUnchecked() {
        return new RemoveVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static RemoveVariantChangeBuilder of() {
        return new RemoveVariantChangeBuilder();
    }

    public static RemoveVariantChangeBuilder of(final RemoveVariantChange template) {
        RemoveVariantChangeBuilder builder = new RemoveVariantChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
