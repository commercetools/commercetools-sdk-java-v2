
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemTaxAmountChangeBuilder implements Builder<SetLineItemTaxAmountChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    public SetLineItemTaxAmountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxAmountChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
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

    public SetLineItemTaxAmountChange build() {
        Objects.requireNonNull(change, SetLineItemTaxAmountChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemTaxAmountChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemTaxAmountChange.class + ": variant is missing");
        Objects.requireNonNull(taxMode, SetLineItemTaxAmountChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetLineItemTaxAmountChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemTaxAmountChange.class + ": previousValue is missing");
        return new SetLineItemTaxAmountChangeImpl(change, lineItem, variant, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetLineItemTaxAmountChange without checking for non null required values
     */
    public SetLineItemTaxAmountChange buildUnchecked() {
        return new SetLineItemTaxAmountChangeImpl(change, lineItem, variant, taxMode, nextValue, previousValue);
    }

    public static SetLineItemTaxAmountChangeBuilder of() {
        return new SetLineItemTaxAmountChangeBuilder();
    }

    public static SetLineItemTaxAmountChangeBuilder of(final SetLineItemTaxAmountChange template) {
        SetLineItemTaxAmountChangeBuilder builder = new SetLineItemTaxAmountChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
