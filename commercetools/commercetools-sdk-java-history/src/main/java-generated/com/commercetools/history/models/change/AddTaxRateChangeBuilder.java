
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddTaxRateChangeBuilder implements Builder<AddTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.TaxRate nextValue;

    public AddTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    public AddTaxRateChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(nextValue);
        return new AddTaxRateChangeImpl(change, nextValue);
    }

    /**
     * builds AddTaxRateChange without checking for non null required values
     */
    public AddTaxRateChange buildUnchecked() {
        return new AddTaxRateChangeImpl(change, nextValue);
    }

    public static AddTaxRateChangeBuilder of() {
        return new AddTaxRateChangeBuilder();
    }

    public static AddTaxRateChangeBuilder of(final AddTaxRateChange template) {
        AddTaxRateChangeBuilder builder = new AddTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
