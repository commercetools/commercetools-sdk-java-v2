
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddShoppingListLineItemChangeBuilder implements Builder<AddShoppingListLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    public AddShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddShoppingListLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    public AddShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddShoppingListLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
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
        Objects.requireNonNull(change, AddShoppingListLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddShoppingListLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddShoppingListLineItemChange.class + ": nextValue is missing");
        return new AddShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddShoppingListLineItemChange without checking for non null required values
     */
    public AddShoppingListLineItemChange buildUnchecked() {
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
