
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetProductVariantKeyChangeBuilder implements Builder<SetProductVariantKeyChange> {

    private String change;

    private String catalogData;

    private String previousValue;

    private String nextValue;

    public SetProductVariantKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetProductVariantKeyChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetProductVariantKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetProductVariantKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetProductVariantKeyChange build() {
        Objects.requireNonNull(change, SetProductVariantKeyChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductVariantKeyChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductVariantKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductVariantKeyChange.class + ": nextValue is missing");
        return new SetProductVariantKeyChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductVariantKeyChange without checking for non null required values
     */
    public SetProductVariantKeyChange buildUnchecked() {
        return new SetProductVariantKeyChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetProductVariantKeyChangeBuilder of() {
        return new SetProductVariantKeyChangeBuilder();
    }

    public static SetProductVariantKeyChangeBuilder of(final SetProductVariantKeyChange template) {
        SetProductVariantKeyChangeBuilder builder = new SetProductVariantKeyChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
