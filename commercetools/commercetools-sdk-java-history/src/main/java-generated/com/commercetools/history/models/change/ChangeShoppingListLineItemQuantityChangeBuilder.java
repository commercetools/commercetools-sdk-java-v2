
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeShoppingListLineItemQuantityChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private Integer previousValue;

    private Integer nextValue;

    public ChangeShoppingListLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public ChangeShoppingListLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeShoppingListLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public ChangeShoppingListLineItemQuantityChange build() {
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, lineItem, previousValue, nextValue);
    }

    public static ChangeShoppingListLineItemQuantityChangeBuilder of() {
        return new ChangeShoppingListLineItemQuantityChangeBuilder();
    }

    public static ChangeShoppingListLineItemQuantityChangeBuilder of(
            final ChangeShoppingListLineItemQuantityChange template) {
        ChangeShoppingListLineItemQuantityChangeBuilder builder = new ChangeShoppingListLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
