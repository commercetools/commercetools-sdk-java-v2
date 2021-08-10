
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveTaxRateChangeBuilder implements Builder<RemoveTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.TaxRate previousValue;

    private com.commercetools.history.models.common.TaxRate nextValue;

    public RemoveTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    public RemoveTaxRateChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveTaxRateChange without checking for non null required values
     */
    public RemoveTaxRateChange buildUnchecked() {
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
