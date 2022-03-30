
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetAttributeChangeBuilder implements Builder<SetAttributeChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.change_value.AttributeValue previousValue;

    private com.commercetools.history.models.change_value.AttributeValue nextValue;

    public SetAttributeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAttributeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetAttributeChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.AttributeValueBuilder, com.commercetools.history.models.change_value.AttributeValueBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.AttributeValueBuilder.of())
                .build();
        return this;
    }

    public SetAttributeChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.AttributeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetAttributeChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.AttributeValueBuilder, com.commercetools.history.models.change_value.AttributeValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.AttributeValueBuilder.of())
                .build();
        return this;
    }

    public SetAttributeChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.AttributeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.change_value.AttributeValue getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.change_value.AttributeValue getNextValue() {
        return this.nextValue;
    }

    public SetAttributeChange build() {
        Objects.requireNonNull(change, SetAttributeChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetAttributeChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetAttributeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAttributeChange.class + ": nextValue is missing");
        return new SetAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetAttributeChange without checking for non null required values
     */
    public SetAttributeChange buildUnchecked() {
        return new SetAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetAttributeChangeBuilder of() {
        return new SetAttributeChangeBuilder();
    }

    public static SetAttributeChangeBuilder of(final SetAttributeChange template) {
        SetAttributeChangeBuilder builder = new SetAttributeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
