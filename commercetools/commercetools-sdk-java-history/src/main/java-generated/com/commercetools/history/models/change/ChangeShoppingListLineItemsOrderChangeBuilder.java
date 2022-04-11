
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeShoppingListLineItemsOrderChangeBuilder implements Builder<ChangeShoppingListLineItemsOrderChange> {

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

    public ChangeShoppingListLineItemsOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
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

    public ChangeShoppingListLineItemsOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
        return this;
    }

    public ChangeShoppingListLineItemsOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of()).build());
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
        Objects.requireNonNull(change, ChangeShoppingListLineItemsOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ChangeShoppingListLineItemsOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShoppingListLineItemsOrderChange.class + ": nextValue is missing");
        return new ChangeShoppingListLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeShoppingListLineItemsOrderChange without checking for non null required values
     */
    public ChangeShoppingListLineItemsOrderChange buildUnchecked() {
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
