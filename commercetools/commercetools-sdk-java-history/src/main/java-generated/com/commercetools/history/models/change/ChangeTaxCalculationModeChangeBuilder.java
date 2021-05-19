
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTaxCalculationModeChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.TaxCalculationMode previousValue;

    private com.commercetools.history.models.common.TaxCalculationMode nextValue;

    public ChangeTaxCalculationModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTaxCalculationModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxCalculationMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTaxCalculationModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxCalculationMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxCalculationMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TaxCalculationMode getNextValue() {
        return this.nextValue;
    }

    public ChangeTaxCalculationModeChange build() {
        return new ChangeTaxCalculationModeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeTaxCalculationModeChangeBuilder of() {
        return new ChangeTaxCalculationModeChangeBuilder();
    }

    public static ChangeTaxCalculationModeChangeBuilder of(final ChangeTaxCalculationModeChange template) {
        ChangeTaxCalculationModeChangeBuilder builder = new ChangeTaxCalculationModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
