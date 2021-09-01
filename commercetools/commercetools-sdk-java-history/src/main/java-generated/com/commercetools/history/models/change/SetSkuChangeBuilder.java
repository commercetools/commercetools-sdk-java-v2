
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSkuChangeBuilder implements Builder<SetSkuChange> {

    private String change;

    private String catalogData;

    private String previousValue;

    private String nextValue;

    public SetSkuChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSkuChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetSkuChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSkuChangeBuilder nextValue(final String nextValue) {
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

    public SetSkuChange build() {
        Objects.requireNonNull(change, SetSkuChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetSkuChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetSkuChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSkuChange.class + ": nextValue is missing");
        return new SetSkuChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetSkuChange without checking for non null required values
     */
    public SetSkuChange buildUnchecked() {
        return new SetSkuChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetSkuChangeBuilder of() {
        return new SetSkuChangeBuilder();
    }

    public static SetSkuChangeBuilder of(final SetSkuChange template) {
        SetSkuChangeBuilder builder = new SetSkuChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
