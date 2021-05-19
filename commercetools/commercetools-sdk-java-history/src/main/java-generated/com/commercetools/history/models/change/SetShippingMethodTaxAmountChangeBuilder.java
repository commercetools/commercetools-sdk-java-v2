
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingMethodTaxAmountChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetShippingMethodTaxAmountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingMethodTaxAmountChange build() {
        return new SetShippingMethodTaxAmountChangeImpl(change, taxMode, nextValue, previousValue);
    }

    public static SetShippingMethodTaxAmountChangeBuilder of() {
        return new SetShippingMethodTaxAmountChangeBuilder();
    }

    public static SetShippingMethodTaxAmountChangeBuilder of(final SetShippingMethodTaxAmountChange template) {
        SetShippingMethodTaxAmountChangeBuilder builder = new SetShippingMethodTaxAmountChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
