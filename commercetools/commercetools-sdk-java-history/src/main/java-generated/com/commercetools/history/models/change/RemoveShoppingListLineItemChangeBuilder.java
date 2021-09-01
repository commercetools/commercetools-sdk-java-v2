
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveShoppingListLineItemChangeBuilder implements Builder<RemoveShoppingListLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    public RemoveShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    public RemoveShoppingListLineItemChangeBuilder nextValue(
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

    public RemoveShoppingListLineItemChange build() {
        Objects.requireNonNull(change, RemoveShoppingListLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveShoppingListLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveShoppingListLineItemChange.class + ": nextValue is missing");
        return new RemoveShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveShoppingListLineItemChange without checking for non null required values
     */
    public RemoveShoppingListLineItemChange buildUnchecked() {
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
