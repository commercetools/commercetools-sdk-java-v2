
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingMethodChangeBuilder implements Builder<SetShippingMethodChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue;

    private com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue;

    public SetShippingMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingMethodChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingMethodChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ShippingMethodChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingMethodChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingMethodChange without checking for non null required values
     */
    public SetShippingMethodChange buildUnchecked() {
        return new SetShippingMethodChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingMethodChangeBuilder of() {
        return new SetShippingMethodChangeBuilder();
    }

    public static SetShippingMethodChangeBuilder of(final SetShippingMethodChange template) {
        SetShippingMethodChangeBuilder builder = new SetShippingMethodChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
