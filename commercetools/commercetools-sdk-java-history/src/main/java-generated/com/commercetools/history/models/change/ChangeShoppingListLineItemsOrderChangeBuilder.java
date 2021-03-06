
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeShoppingListLineItemsOrderChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue;

    private java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue;

    public ChangeShoppingListLineItemsOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.ShoppingListLineItemValue> getNextValue() {
        return this.nextValue;
    }

    public ChangeShoppingListLineItemsOrderChange build() {
        return new ChangeShoppingListLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeShoppingListLineItemsOrderChangeBuilder of() {
        return new ChangeShoppingListLineItemsOrderChangeBuilder();
    }

    public static ChangeShoppingListLineItemsOrderChangeBuilder of(
            final ChangeShoppingListLineItemsOrderChange template) {
        ChangeShoppingListLineItemsOrderChangeBuilder builder = new ChangeShoppingListLineItemsOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
