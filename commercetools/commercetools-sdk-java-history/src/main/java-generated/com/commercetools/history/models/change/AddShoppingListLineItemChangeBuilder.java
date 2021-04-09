
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddShoppingListLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    public AddShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddShoppingListLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LineItem getNextValue() {
        return this.nextValue;
    }

    public AddShoppingListLineItemChange build() {
        return new AddShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static AddShoppingListLineItemChangeBuilder of() {
        return new AddShoppingListLineItemChangeBuilder();
    }

    public static AddShoppingListLineItemChangeBuilder of(final AddShoppingListLineItemChange template) {
        AddShoppingListLineItemChangeBuilder builder = new AddShoppingListLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
