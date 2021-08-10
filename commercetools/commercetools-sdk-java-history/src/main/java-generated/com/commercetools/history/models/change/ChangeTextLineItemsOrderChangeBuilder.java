
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTextLineItemsOrderChangeBuilder implements Builder<ChangeTextLineItemsOrderChange> {

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
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
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
