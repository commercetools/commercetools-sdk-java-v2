
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedEnumValueOrderChangeBuilder implements Builder<ChangeLocalizedEnumValueOrderChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue;

    public ChangeLocalizedEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getPreviousValue() {
        return this.previousValue;
    }

    public ChangeLocalizedEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangeLocalizedEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLocalizedEnumValueOrderChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLocalizedEnumValueOrderChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedEnumValueOrderChange.class + ": previousValue is missing");
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeLocalizedEnumValueOrderChange without checking for non null required values
     */
    public ChangeLocalizedEnumValueOrderChange buildUnchecked() {
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    public static ChangeLocalizedEnumValueOrderChangeBuilder of() {
        return new ChangeLocalizedEnumValueOrderChangeBuilder();
    }

    public static ChangeLocalizedEnumValueOrderChangeBuilder of(final ChangeLocalizedEnumValueOrderChange template) {
        ChangeLocalizedEnumValueOrderChangeBuilder builder = new ChangeLocalizedEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
