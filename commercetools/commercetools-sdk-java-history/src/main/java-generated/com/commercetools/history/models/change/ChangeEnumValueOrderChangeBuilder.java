
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeEnumValueOrderChangeBuilder {

    private String change;

    private String fieldName;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue;

    public ChangeEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeEnumValueOrderChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public ChangeEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.EnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getPreviousValue() {
        return this.previousValue;
    }

    public ChangeEnumValueOrderChange build() {
        return new ChangeEnumValueOrderChangeImpl(change, fieldName, nextValue, previousValue);
    }

    public static ChangeEnumValueOrderChangeBuilder of() {
        return new ChangeEnumValueOrderChangeBuilder();
    }

    public static ChangeEnumValueOrderChangeBuilder of(final ChangeEnumValueOrderChange template) {
        ChangeEnumValueOrderChangeBuilder builder = new ChangeEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
