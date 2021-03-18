
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemPriceChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString lineItem;

    private com.commercetools.history.models.Price nextValue;

    private com.commercetools.history.models.Price previousValue;

    public SetLineItemPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemPriceChangeBuilder lineItem(final com.commercetools.history.models.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemPriceChangeBuilder nextValue(final com.commercetools.history.models.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemPriceChangeBuilder previousValue(final com.commercetools.history.models.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.Price getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Price getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemPriceChange build() {
        return new SetLineItemPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    public static SetLineItemPriceChangeBuilder of() {
        return new SetLineItemPriceChangeBuilder();
    }

    public static SetLineItemPriceChangeBuilder of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeBuilder builder = new SetLineItemPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
