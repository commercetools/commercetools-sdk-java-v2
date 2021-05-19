
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingRateChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetShippingRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingRateChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingRateChange build() {
        return new SetShippingRateChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingRateChangeBuilder of() {
        return new SetShippingRateChangeBuilder();
    }

    public static SetShippingRateChangeBuilder of(final SetShippingRateChange template) {
        SetShippingRateChangeBuilder builder = new SetShippingRateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
