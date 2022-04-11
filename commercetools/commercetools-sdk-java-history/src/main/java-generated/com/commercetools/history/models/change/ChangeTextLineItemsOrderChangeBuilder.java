
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeTextLineItemsOrderChangeBuilder implements Builder<ChangeTextLineItemsOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> previousValue;

    private java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> nextValue;

    public ChangeTextLineItemsOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.TextLineItemValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.TextLineItemValue... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.TextLineItemValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.TextLineItemValue... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }

    public ChangeTextLineItemsOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.TextLineItemValue> getNextValue() {
        return this.nextValue;
    }

    public ChangeTextLineItemsOrderChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemsOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemsOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemsOrderChange.class + ": nextValue is missing");
        return new ChangeTextLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTextLineItemsOrderChange without checking for non null required values
     */
    public ChangeTextLineItemsOrderChange buildUnchecked() {
        return new ChangeTextLineItemsOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeTextLineItemsOrderChangeBuilder of() {
        return new ChangeTextLineItemsOrderChangeBuilder();
    }

    public static ChangeTextLineItemsOrderChangeBuilder of(final ChangeTextLineItemsOrderChange template) {
        ChangeTextLineItemsOrderChangeBuilder builder = new ChangeTextLineItemsOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
