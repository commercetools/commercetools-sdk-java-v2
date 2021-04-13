
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddEnumValueChangeBuilder {

    private String change;

    private String fieldName;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    public AddEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddEnumValueChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public AddEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    public AddEnumValueChange build() {
        return new AddEnumValueChangeImpl(change, fieldName, nextValue);
    }

    public static AddEnumValueChangeBuilder of() {
        return new AddEnumValueChangeBuilder();
    }

    public static AddEnumValueChangeBuilder of(final AddEnumValueChange template) {
        AddEnumValueChangeBuilder builder = new AddEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
