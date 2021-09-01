
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddPlainEnumValueChangeBuilder implements Builder<AddPlainEnumValueChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    public AddPlainEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddPlainEnumValueChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public AddPlainEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }

    public AddPlainEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    public AddPlainEnumValueChange build() {
        Objects.requireNonNull(change, AddPlainEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, AddPlainEnumValueChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, AddPlainEnumValueChange.class + ": nextValue is missing");
        return new AddPlainEnumValueChangeImpl(change, attributeName, nextValue);
    }

    /**
     * builds AddPlainEnumValueChange without checking for non null required values
     */
    public AddPlainEnumValueChange buildUnchecked() {
        return new AddPlainEnumValueChangeImpl(change, attributeName, nextValue);
    }

    public static AddPlainEnumValueChangeBuilder of() {
        return new AddPlainEnumValueChangeBuilder();
    }

    public static AddPlainEnumValueChangeBuilder of(final AddPlainEnumValueChange template) {
        AddPlainEnumValueChangeBuilder builder = new AddPlainEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
