
package com.commercetools.history.models.change;

import java.util.*;

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
            final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
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
        Objects.requireNonNull(change);
        Objects.requireNonNull(catalogData);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
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
