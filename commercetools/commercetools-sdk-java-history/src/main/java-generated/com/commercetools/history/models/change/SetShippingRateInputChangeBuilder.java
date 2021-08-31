
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingRateInputChangeBuilder implements Builder<SetShippingRateInputChange> {

    private String change;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetShippingRateInputChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingRateInputChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingRateInputChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingRateInputChange build() {
        Objects.requireNonNull(change, SetShippingRateInputChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingRateInputChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingRateInputChange.class + ": previousValue is missing");
        return new SetShippingRateInputChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingRateInputChange without checking for non null required values
     */
    public SetShippingRateInputChange buildUnchecked() {
        return new SetShippingRateInputChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingRateInputChangeBuilder of() {
        return new SetShippingRateInputChangeBuilder();
    }

    public static SetShippingRateInputChangeBuilder of(final SetShippingRateInputChange template) {
        SetShippingRateInputChangeBuilder builder = new SetShippingRateInputChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
