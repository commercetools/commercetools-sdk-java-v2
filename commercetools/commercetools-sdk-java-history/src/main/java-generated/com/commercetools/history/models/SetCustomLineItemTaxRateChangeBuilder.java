
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemTaxRateChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.TaxRate nextValue;

    private com.commercetools.history.models.TaxRate previousValue;

    public SetCustomLineItemTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder customLineItem(
            final com.commercetools.history.models.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder nextValue(final com.commercetools.history.models.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.history.models.TaxRate getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemTaxRateChange build() {
        return new SetCustomLineItemTaxRateChangeImpl(change, customLineItem, customLineItemId, nextValue,
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
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
