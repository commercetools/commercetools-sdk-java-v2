
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTextLineItemCustomTypeChangeBuilder {

    private String change;

    private com.commercetools.history.models.TextLineItemValue textLineItem;

    private com.commercetools.history.models.CustomFields nextValue;

    private com.commercetools.history.models.CustomFields previousValue;

    public SetTextLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder textLineItem(
            final com.commercetools.history.models.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetTextLineItemCustomTypeChange build() {
        return new SetTextLineItemCustomTypeChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    public static SetTextLineItemCustomTypeChangeBuilder of() {
        return new SetTextLineItemCustomTypeChangeBuilder();
    }

    public static SetTextLineItemCustomTypeChangeBuilder of(final SetTextLineItemCustomTypeChange template) {
        SetTextLineItemCustomTypeChangeBuilder builder = new SetTextLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
