
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddLocalizedEnumValueChangeBuilder implements Builder<AddLocalizedEnumValueChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.change_value.LocalizedEnumValue nextValue;

    public AddLocalizedEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddLocalizedEnumValueChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public AddLocalizedEnumValueChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public AddLocalizedEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of())
                .build();
        return this;
    }

    public AddLocalizedEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue nextValue) {
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

    public com.commercetools.history.models.change_value.LocalizedEnumValue getNextValue() {
        return this.nextValue;
    }

    public AddLocalizedEnumValueChange build() {
        Objects.requireNonNull(change, AddLocalizedEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, AddLocalizedEnumValueChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, AddLocalizedEnumValueChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, AddLocalizedEnumValueChange.class + ": nextValue is missing");
        return new AddLocalizedEnumValueChangeImpl(change, fieldName, attributeName, nextValue);
    }

    /**
     * builds AddLocalizedEnumValueChange without checking for non null required values
     */
    public AddLocalizedEnumValueChange buildUnchecked() {
        return new AddLocalizedEnumValueChangeImpl(change, fieldName, attributeName, nextValue);
    }

    public static AddLocalizedEnumValueChangeBuilder of() {
        return new AddLocalizedEnumValueChangeBuilder();
    }

    public static AddLocalizedEnumValueChangeBuilder of(final AddLocalizedEnumValueChange template) {
        AddLocalizedEnumValueChangeBuilder builder = new AddLocalizedEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
