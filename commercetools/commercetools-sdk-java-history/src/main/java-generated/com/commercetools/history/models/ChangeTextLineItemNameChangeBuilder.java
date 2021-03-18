
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTextLineItemNameChangeBuilder {

    private String change;

    private com.commercetools.history.models.TextLineItemValue textLineItem;

    private com.commercetools.history.models.LocalizedString nextValue;

    private com.commercetools.history.models.LocalizedString previousValue;

    public ChangeTextLineItemNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder textLineItem(
            final com.commercetools.history.models.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder nextValue(
            final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public ChangeTextLineItemNameChange build() {
        return new ChangeTextLineItemNameChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    public static ChangeTextLineItemNameChangeBuilder of() {
        return new ChangeTextLineItemNameChangeBuilder();
    }

    public static ChangeTextLineItemNameChangeBuilder of(final ChangeTextLineItemNameChange template) {
        ChangeTextLineItemNameChangeBuilder builder = new ChangeTextLineItemNameChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
