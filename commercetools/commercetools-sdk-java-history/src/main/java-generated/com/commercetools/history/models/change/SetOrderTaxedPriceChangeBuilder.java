
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderTaxedPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    public SetOrderTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTaxedPriceChange build() {
        return new SetOrderTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetOrderTaxedPriceChangeBuilder of() {
        return new SetOrderTaxedPriceChangeBuilder();
    }

    public static SetOrderTaxedPriceChangeBuilder of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeBuilder builder = new SetOrderTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
