
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemTaxAmountChangeBuilder implements Builder<SetCustomLineItemTaxAmountChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    public SetCustomLineItemTaxAmountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemTaxAmountChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
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

    public SetCustomLineItemTaxAmountChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTaxAmountChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemTaxAmountChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemTaxAmountChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(taxMode, SetCustomLineItemTaxAmountChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTaxAmountChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTaxAmountChange.class + ": previousValue is missing");
        return new SetCustomLineItemTaxAmountChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue,
            previousValue);
    }

    /**
     * builds SetCustomLineItemTaxAmountChange without checking for non null required values
     */
    public SetCustomLineItemTaxAmountChange buildUnchecked() {
        return new SetCustomLineItemTaxAmountChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue,
            previousValue);
    }

    public static SetCustomLineItemTaxAmountChangeBuilder of() {
        return new SetCustomLineItemTaxAmountChangeBuilder();
    }

    public static SetCustomLineItemTaxAmountChangeBuilder of(final SetCustomLineItemTaxAmountChange template) {
        SetCustomLineItemTaxAmountChangeBuilder builder = new SetCustomLineItemTaxAmountChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
