
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveTaxRateChangeBuilder {

    private String change;

    private com.commercetools.history.models.TaxRate previousValue;

    private com.commercetools.history.models.TaxRate nextValue;

    public RemoveTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveTaxRateChangeBuilder previousValue(final com.commercetools.history.models.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveTaxRateChangeBuilder nextValue(final com.commercetools.history.models.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.TaxRate getNextValue() {
        return this.nextValue;
    }

    public RemoveTaxRateChange build() {
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveTaxRateChangeBuilder of() {
        return new RemoveTaxRateChangeBuilder();
    }

    public static RemoveTaxRateChangeBuilder of(final RemoveTaxRateChange template) {
        RemoveTaxRateChangeBuilder builder = new RemoveTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
