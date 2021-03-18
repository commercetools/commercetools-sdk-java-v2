
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAmountPlannedChangeBuilder {

    private String change;

    private com.commercetools.history.models.Money previousValue;

    private com.commercetools.history.models.Money nextValue;

    public ChangeAmountPlannedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAmountPlannedChangeBuilder previousValue(final com.commercetools.history.models.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAmountPlannedChangeBuilder nextValue(final com.commercetools.history.models.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Money getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Money getNextValue() {
        return this.nextValue;
    }

    public ChangeAmountPlannedChange build() {
        return new ChangeAmountPlannedChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAmountPlannedChangeBuilder of() {
        return new ChangeAmountPlannedChangeBuilder();
    }

    public static ChangeAmountPlannedChangeBuilder of(final ChangeAmountPlannedChange template) {
        ChangeAmountPlannedChangeBuilder builder = new ChangeAmountPlannedChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
