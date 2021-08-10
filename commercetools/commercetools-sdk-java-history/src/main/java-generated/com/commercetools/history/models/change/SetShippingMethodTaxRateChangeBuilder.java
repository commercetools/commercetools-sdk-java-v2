
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingMethodTaxRateChangeBuilder implements Builder<SetShippingMethodTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    public SetShippingMethodTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingMethodTaxRateChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetShippingMethodTaxRateChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingMethodTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingMethodTaxRateChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(taxMode);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetShippingMethodTaxRateChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetShippingMethodTaxRateChange without checking for non null required values
     */
    public SetShippingMethodTaxRateChange buildUnchecked() {
        return new SetShippingMethodTaxRateChangeImpl(change, taxMode, nextValue, previousValue);
    }

    public static SetShippingMethodTaxRateChangeBuilder of() {
        return new SetShippingMethodTaxRateChangeBuilder();
    }

    public static SetShippingMethodTaxRateChangeBuilder of(final SetShippingMethodTaxRateChange template) {
        SetShippingMethodTaxRateChangeBuilder builder = new SetShippingMethodTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
