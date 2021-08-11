
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderTotalTaxChangeBuilder implements Builder<SetOrderTotalTaxChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetOrderTotalTaxChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetOrderTotalTaxChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderTotalTaxChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetOrderTotalTaxChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTotalTaxChange build() {
        Objects.requireNonNull(change, SetOrderTotalTaxChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetOrderTotalTaxChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetOrderTotalTaxChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTotalTaxChange.class + ": previousValue is missing");
        return new SetOrderTotalTaxChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetOrderTotalTaxChange without checking for non null required values
     */
    public SetOrderTotalTaxChange buildUnchecked() {
        return new SetOrderTotalTaxChangeImpl(change, taxMode, nextValue, previousValue);
    }

    public static SetOrderTotalTaxChangeBuilder of() {
        return new SetOrderTotalTaxChangeBuilder();
    }

    public static SetOrderTotalTaxChangeBuilder of(final SetOrderTotalTaxChange template) {
        SetOrderTotalTaxChangeBuilder builder = new SetOrderTotalTaxChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
