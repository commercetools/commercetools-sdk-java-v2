
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedEnumValueLabelChangeBuilder implements Builder<ChangeLocalizedEnumValueLabelChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private String valueKey;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public ChangeLocalizedEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedEnumValueLabelChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
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

    public String getValueKey() {
        return this.valueKey;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public ChangeLocalizedEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangeLocalizedEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLocalizedEnumValueLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLocalizedEnumValueLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(valueKey, ChangeLocalizedEnumValueLabelChange.class + ": valueKey is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedEnumValueLabelChange.class + ": nextValue is missing");
        return new ChangeLocalizedEnumValueLabelChangeImpl(change, fieldName, attributeName, valueKey, previousValue,
            nextValue);
    }

    /**
     * builds ChangeLocalizedEnumValueLabelChange without checking for non null required values
     */
    public ChangeLocalizedEnumValueLabelChange buildUnchecked() {
        return new ChangeLocalizedEnumValueLabelChangeImpl(change, fieldName, attributeName, valueKey, previousValue,
            nextValue);
    }

    public static ChangeLocalizedEnumValueLabelChangeBuilder of() {
        return new ChangeLocalizedEnumValueLabelChangeBuilder();
    }

    public static ChangeLocalizedEnumValueLabelChangeBuilder of(final ChangeLocalizedEnumValueLabelChange template) {
        ChangeLocalizedEnumValueLabelChangeBuilder builder = new ChangeLocalizedEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
