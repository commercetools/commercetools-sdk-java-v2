
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeShoppingListLineItemQuantityChangeBuilder
        implements Builder<ChangeShoppingListLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private Integer previousValue;

    private Integer nextValue;

    public ChangeShoppingListLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.lineItem = builder
                .apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of())
                .build();
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
        Objects.requireNonNull(change, ChangeShoppingListLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, ChangeShoppingListLineItemQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(previousValue,
            ChangeShoppingListLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShoppingListLineItemQuantityChange.class + ": nextValue is missing");
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * builds ChangeShoppingListLineItemQuantityChange without checking for non null required values
     */
    public ChangeShoppingListLineItemQuantityChange buildUnchecked() {
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
