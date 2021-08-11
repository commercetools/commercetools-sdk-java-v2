
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomShippingMethodChangeBuilder implements Builder<SetCustomShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue previousValue;

    public SetCustomShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomShippingMethodChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    public SetCustomShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomShippingMethodChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder, com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.CustomShippingMethodChangeValueBuilder.of())
                .build();
        return this;
    }

    public SetCustomShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.CustomShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.CustomShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.CustomShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomShippingMethodChange build() {
        Objects.requireNonNull(change, SetCustomShippingMethodChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetCustomShippingMethodChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomShippingMethodChange.class + ": previousValue is missing");
        return new SetCustomShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetCustomShippingMethodChange without checking for non null required values
     */
    public SetCustomShippingMethodChange buildUnchecked() {
        return new SetCustomShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    public static SetCustomShippingMethodChangeBuilder of() {
        return new SetCustomShippingMethodChangeBuilder();
    }

    public static SetCustomShippingMethodChangeBuilder of(final SetCustomShippingMethodChange template) {
        SetCustomShippingMethodChangeBuilder builder = new SetCustomShippingMethodChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
