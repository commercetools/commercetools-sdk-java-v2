
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemTotalPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.Money nextValue;

    private com.commercetools.history.models.Money previousValue;

    public SetCustomLineItemTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemTotalPriceChangeBuilder customLineItem(
            final com.commercetools.history.models.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemTotalPriceChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.Money previousValue) {
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

    public com.commercetools.history.models.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemTotalPriceChange build() {
        return new SetCustomLineItemTotalPriceChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    public static SetCustomLineItemTotalPriceChangeBuilder of() {
        return new SetCustomLineItemTotalPriceChangeBuilder();
    }

    public static SetCustomLineItemTotalPriceChangeBuilder of(final SetCustomLineItemTotalPriceChange template) {
        SetCustomLineItemTotalPriceChangeBuilder builder = new SetCustomLineItemTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
