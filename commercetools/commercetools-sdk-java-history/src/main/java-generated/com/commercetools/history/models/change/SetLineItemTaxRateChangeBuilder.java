
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemTaxRateChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    public SetLineItemTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemTaxRateChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemTaxRateChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemTaxRateChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public SetLineItemTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemTaxRateChangeBuilder previousValue(
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

    public SetLineItemTaxRateChange build() {
        return new SetLineItemTaxRateChangeImpl(change, lineItem, variant, taxMode, nextValue, previousValue);
    }

    public static SetLineItemTaxRateChangeBuilder of() {
        return new SetLineItemTaxRateChangeBuilder();
    }

    public static SetLineItemTaxRateChangeBuilder of(final SetLineItemTaxRateChange template) {
        SetLineItemTaxRateChangeBuilder builder = new SetLineItemTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
