
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

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

    public AddTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
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
        Objects.requireNonNull(change, AddTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddTaxRateChange.class + ": nextValue is missing");
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
