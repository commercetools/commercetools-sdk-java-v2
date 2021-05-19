
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingInfoPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetShippingInfoPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingInfoPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingInfoPriceChangeBuilder previousValue(
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

    public SetShippingInfoPriceChange build() {
        return new SetShippingInfoPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingInfoPriceChangeBuilder of() {
        return new SetShippingInfoPriceChangeBuilder();
    }

    public static SetShippingInfoPriceChangeBuilder of(final SetShippingInfoPriceChange template) {
        SetShippingInfoPriceChangeBuilder builder = new SetShippingInfoPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
