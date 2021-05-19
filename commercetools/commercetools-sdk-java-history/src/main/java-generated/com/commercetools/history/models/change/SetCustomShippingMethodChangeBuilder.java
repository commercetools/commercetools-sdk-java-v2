
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomShippingMethodChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.CustomShippingMethodChangeValue previousValue;

    public SetCustomShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
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
