
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTextLineItemQuantityChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private Integer previousValue;

    private Integer nextValue;

    public ChangeTextLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public ChangeTextLineItemQuantityChange build() {
        return new ChangeTextLineItemQuantityChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    public static ChangeTextLineItemQuantityChangeBuilder of() {
        return new ChangeTextLineItemQuantityChangeBuilder();
    }

    public static ChangeTextLineItemQuantityChangeBuilder of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeBuilder builder = new ChangeTextLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
