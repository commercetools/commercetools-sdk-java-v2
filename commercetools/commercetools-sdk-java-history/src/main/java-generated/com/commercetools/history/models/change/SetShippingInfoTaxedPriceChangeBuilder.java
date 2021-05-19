
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingInfoTaxedPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.TaxedPrice nextValue;

    private com.commercetools.history.models.common.TaxedPrice previousValue;

    public SetShippingInfoTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingInfoTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxedPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingInfoTaxedPriceChange build() {
        return new SetShippingInfoTaxedPriceChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of() {
        return new SetShippingInfoTaxedPriceChangeBuilder();
    }

    public static SetShippingInfoTaxedPriceChangeBuilder of(final SetShippingInfoTaxedPriceChange template) {
        SetShippingInfoTaxedPriceChangeBuilder builder = new SetShippingInfoTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
