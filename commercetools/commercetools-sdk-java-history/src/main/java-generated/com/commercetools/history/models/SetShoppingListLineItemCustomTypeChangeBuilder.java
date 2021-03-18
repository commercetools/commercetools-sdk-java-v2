
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShoppingListLineItemCustomTypeChangeBuilder {

    private String change;

    private com.commercetools.history.models.ShoppingListLineItemValue lineItem;

    private com.commercetools.history.models.CustomFields nextValue;

    private com.commercetools.history.models.CustomFields previousValue;

    public SetShoppingListLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder lineItem(
            final com.commercetools.history.models.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetShoppingListLineItemCustomTypeChange build() {
        return new SetShoppingListLineItemCustomTypeChangeImpl(change, lineItem, nextValue, previousValue);
    }

    public static SetShoppingListLineItemCustomTypeChangeBuilder of() {
        return new SetShoppingListLineItemCustomTypeChangeBuilder();
    }

    public static SetShoppingListLineItemCustomTypeChangeBuilder of(
            final SetShoppingListLineItemCustomTypeChange template) {
        SetShoppingListLineItemCustomTypeChangeBuilder builder = new SetShoppingListLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
