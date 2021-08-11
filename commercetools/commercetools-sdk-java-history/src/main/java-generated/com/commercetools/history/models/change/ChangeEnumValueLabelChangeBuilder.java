
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeEnumValueLabelChangeBuilder implements Builder<ChangeEnumValueLabelChange> {

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
        Objects.requireNonNull(change, ChangeEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeEnumValueLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(valueKey, ChangeEnumValueLabelChange.class + ": valueKey is missing");
        Objects.requireNonNull(previousValue, ChangeEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeEnumValueLabelChange.class + ": nextValue is missing");
        return new ChangeEnumValueLabelChangeImpl(change, fieldName, valueKey, previousValue, nextValue);
    }

    /**
     * builds ChangeEnumValueLabelChange without checking for non null required values
     */
    public ChangeEnumValueLabelChange buildUnchecked() {
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
