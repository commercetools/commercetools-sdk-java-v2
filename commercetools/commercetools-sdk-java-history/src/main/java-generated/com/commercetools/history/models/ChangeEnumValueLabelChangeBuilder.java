
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeEnumValueLabelChangeBuilder {

    private String change;

    private String fieldName;

    private String valueKey;

    private String previousValue;

    private String nextValue;

    public ChangeEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeEnumValueLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public ChangeEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
        return this;
    }

    public ChangeEnumValueLabelChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeEnumValueLabelChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getValueKey() {
        return this.valueKey;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public ChangeEnumValueLabelChange build() {
        return new ChangeEnumValueLabelChangeImpl(change, fieldName, valueKey, previousValue, nextValue);
    }

    public static ChangeEnumValueLabelChangeBuilder of() {
        return new ChangeEnumValueLabelChangeBuilder();
    }

    public static ChangeEnumValueLabelChangeBuilder of(final ChangeEnumValueLabelChange template) {
        ChangeEnumValueLabelChangeBuilder builder = new ChangeEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.valueKey = template.getValueKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
