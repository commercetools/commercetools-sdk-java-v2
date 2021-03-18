
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderTotalPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.Money nextValue;

    private com.commercetools.history.models.Money previousValue;

    public SetOrderTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderTotalPriceChangeBuilder previousValue(final com.commercetools.history.models.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTotalPriceChange build() {
        return new SetOrderTotalPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetOrderTotalPriceChangeBuilder of() {
        return new SetOrderTotalPriceChangeBuilder();
    }

    public static SetOrderTotalPriceChangeBuilder of(final SetOrderTotalPriceChange template) {
        SetOrderTotalPriceChangeBuilder builder = new SetOrderTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
