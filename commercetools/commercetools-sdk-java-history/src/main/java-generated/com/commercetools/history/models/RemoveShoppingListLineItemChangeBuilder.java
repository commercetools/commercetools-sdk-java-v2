
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveShoppingListLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.LineItem previousValue;

    private com.commercetools.history.models.LineItem nextValue;

    public RemoveShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.LineItem getNextValue() {
        return this.nextValue;
    }

    public RemoveShoppingListLineItemChange build() {
        return new RemoveShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveShoppingListLineItemChangeBuilder of() {
        return new RemoveShoppingListLineItemChangeBuilder();
    }

    public static RemoveShoppingListLineItemChangeBuilder of(final RemoveShoppingListLineItemChange template) {
        RemoveShoppingListLineItemChangeBuilder builder = new RemoveShoppingListLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
