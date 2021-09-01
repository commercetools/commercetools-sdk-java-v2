
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetImageLabelChangeBuilder implements Builder<SetImageLabelChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Image previousValue;

    private com.commercetools.history.models.common.Image nextValue;

    public SetImageLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetImageLabelChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetImageLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    public SetImageLabelChangeBuilder previousValue(final com.commercetools.history.models.common.Image previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetImageLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    public SetImageLabelChangeBuilder nextValue(final com.commercetools.history.models.common.Image nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.common.Image getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Image getNextValue() {
        return this.nextValue;
    }

    public SetImageLabelChange build() {
        Objects.requireNonNull(change, SetImageLabelChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetImageLabelChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetImageLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetImageLabelChange.class + ": nextValue is missing");
        return new SetImageLabelChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetImageLabelChange without checking for non null required values
     */
    public SetImageLabelChange buildUnchecked() {
        return new SetImageLabelChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetImageLabelChangeBuilder of() {
        return new SetImageLabelChangeBuilder();
    }

    public static SetImageLabelChangeBuilder of(final SetImageLabelChange template) {
        SetImageLabelChangeBuilder builder = new SetImageLabelChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
