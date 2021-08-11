
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePlainEnumValueOrderChangeBuilder implements Builder<ChangePlainEnumValueOrderChange> {

    private String change;

    private String attributeName;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue;

    public ChangePlainEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePlainEnumValueOrderChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangePlainEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangePlainEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangePlainEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.EnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangePlainEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getPreviousValue() {
        return this.previousValue;
    }

    public ChangePlainEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangePlainEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangePlainEnumValueOrderChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangePlainEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangePlainEnumValueOrderChange.class + ": previousValue is missing");
        return new ChangePlainEnumValueOrderChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangePlainEnumValueOrderChange without checking for non null required values
     */
    public ChangePlainEnumValueOrderChange buildUnchecked() {
        return new ChangePlainEnumValueOrderChangeImpl(change, attributeName, nextValue, previousValue);
    }

    public static ChangePlainEnumValueOrderChangeBuilder of() {
        return new ChangePlainEnumValueOrderChangeBuilder();
    }

    public static ChangePlainEnumValueOrderChangeBuilder of(final ChangePlainEnumValueOrderChange template) {
        ChangePlainEnumValueOrderChangeBuilder builder = new ChangePlainEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
