
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemTaxRateChangeBuilder implements Builder<SetCustomLineItemTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    public SetCustomLineItemTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder previousValue(
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

    public SetCustomLineItemTaxRateChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemTaxRateChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemTaxRateChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(taxMode, SetCustomLineItemTaxRateChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTaxRateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTaxRateChange.class + ": previousValue is missing");
        return new SetCustomLineItemTaxRateChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue,
            previousValue);
    }

    /**
     * builds SetCustomLineItemTaxRateChange without checking for non null required values
     */
    public SetCustomLineItemTaxRateChange buildUnchecked() {
        return new SetCustomLineItemTaxRateChangeImpl(change, customLineItem, customLineItemId, taxMode, nextValue,
            previousValue);
    }

    public static SetCustomLineItemTaxRateChangeBuilder of() {
        return new SetCustomLineItemTaxRateChangeBuilder();
    }

    public static SetCustomLineItemTaxRateChangeBuilder of(final SetCustomLineItemTaxRateChange template) {
        SetCustomLineItemTaxRateChangeBuilder builder = new SetCustomLineItemTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
