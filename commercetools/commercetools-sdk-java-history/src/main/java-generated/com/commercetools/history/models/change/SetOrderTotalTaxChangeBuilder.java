
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderTotalTaxChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetOrderTotalTaxChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTotalTaxChange build() {
        return new SetOrderTotalTaxChangeImpl(change, taxMode, nextValue, previousValue);
    }

    public static SetOrderTotalTaxChangeBuilder of() {
        return new SetOrderTotalTaxChangeBuilder();
    }

    public static SetOrderTotalTaxChangeBuilder of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeBuilder builder = new SetOrderTotalTaxChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
