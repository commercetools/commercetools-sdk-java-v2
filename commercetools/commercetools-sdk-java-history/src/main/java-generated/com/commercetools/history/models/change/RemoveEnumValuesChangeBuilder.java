
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveEnumValuesChangeBuilder implements Builder<RemoveEnumValuesChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.change_value.EnumValue previousValue;

    public RemoveEnumValuesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveEnumValuesChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public RemoveEnumValuesChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }

    public RemoveEnumValuesChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.EnumValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.change_value.EnumValue getPreviousValue() {
        return this.previousValue;
    }

    public RemoveEnumValuesChange build() {
        Objects.requireNonNull(change, RemoveEnumValuesChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, RemoveEnumValuesChange.class + ": attributeName is missing");
        Objects.requireNonNull(previousValue, RemoveEnumValuesChange.class + ": previousValue is missing");
        return new RemoveEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    /**
     * builds RemoveEnumValuesChange without checking for non null required values
     */
    public RemoveEnumValuesChange buildUnchecked() {
        return new RemoveEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    public static RemoveEnumValuesChangeBuilder of() {
        return new RemoveEnumValuesChangeBuilder();
    }

    public static RemoveEnumValuesChangeBuilder of(final RemoveEnumValuesChange template) {
        RemoveEnumValuesChangeBuilder builder = new RemoveEnumValuesChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
