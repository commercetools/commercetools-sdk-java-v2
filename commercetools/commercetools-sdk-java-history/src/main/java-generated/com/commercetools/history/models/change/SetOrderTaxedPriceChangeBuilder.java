
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderTaxedPriceChangeBuilder implements Builder<SetOrderTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    public SetOrderTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
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

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderTaxedPriceChange build() {
        Objects.requireNonNull(change, SetOrderTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetOrderTaxedPriceChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetOrderTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderTaxedPriceChange.class + ": previousValue is missing");
        return new SetOrderTaxedPriceChangeImpl(change, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetOrderTaxedPriceChange without checking for non null required values
     */
    public SetOrderTaxedPriceChange buildUnchecked() {
        return new SetOrderTaxedPriceChangeImpl(change, taxMode, nextValue, previousValue);
    }

    public static SetOrderTaxedPriceChangeBuilder of() {
        return new SetOrderTaxedPriceChangeBuilder();
    }

    public static SetOrderTaxedPriceChangeBuilder of(final SetOrderTaxedPriceChange template) {
        SetOrderTaxedPriceChangeBuilder builder = new SetOrderTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
