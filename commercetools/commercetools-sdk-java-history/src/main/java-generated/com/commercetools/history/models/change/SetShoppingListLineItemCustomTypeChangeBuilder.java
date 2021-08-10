
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShoppingListLineItemCustomTypeChangeBuilder
        implements Builder<SetShoppingListLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetShoppingListLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShoppingListLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetShoppingListLineItemCustomTypeChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(lineItem);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetShoppingListLineItemCustomTypeChangeImpl(change, lineItem, nextValue, previousValue);
    }

    /**
     * builds SetShoppingListLineItemCustomTypeChange without checking for non null required values
     */
    public SetShoppingListLineItemCustomTypeChange buildUnchecked() {
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
