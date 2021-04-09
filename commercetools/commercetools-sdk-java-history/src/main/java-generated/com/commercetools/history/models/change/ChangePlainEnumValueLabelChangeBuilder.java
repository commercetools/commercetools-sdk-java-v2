
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePlainEnumValueLabelChangeBuilder {

    private String change;

    private String attributeName;

    private String valueKey;

    private String previousValue;

    private String nextValue;

    public ChangePlainEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
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

    public ChangePlainEnumValueLabelChange build() {
        return new ChangePlainEnumValueLabelChangeImpl(change, attributeName, valueKey, previousValue, nextValue);
    }

    public static ChangePlainEnumValueLabelChangeBuilder of() {
        return new ChangePlainEnumValueLabelChangeBuilder();
    }

    public static ChangePlainEnumValueLabelChangeBuilder of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeBuilder builder = new ChangePlainEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
