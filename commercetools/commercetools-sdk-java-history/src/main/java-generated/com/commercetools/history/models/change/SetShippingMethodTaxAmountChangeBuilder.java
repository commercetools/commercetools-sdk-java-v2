
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetShippingMethodTaxAmountChangeBuilder implements Builder<SetShippingMethodTaxAmountChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue;

    public SetShippingMethodTaxAmountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of())
                .build();
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of())
                .build();
        return this;
    }

    public SetShippingMethodTaxAmountChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public SetShippingMethodTaxAmountChange build() {
        Objects.requireNonNull(change, SetShippingMethodTaxAmountChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetShippingMethodTaxAmountChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodTaxAmountChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodTaxAmountChange.class + ": previousValue is missing");
        return new SetShippingMethodTaxAmountChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetShippingMethodTaxAmountChange without checking for non null required values
     */
    public SetShippingMethodTaxAmountChange buildUnchecked() {
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
