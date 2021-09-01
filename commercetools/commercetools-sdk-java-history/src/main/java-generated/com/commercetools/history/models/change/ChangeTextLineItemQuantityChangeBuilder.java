
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTextLineItemQuantityChangeBuilder implements Builder<ChangeTextLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private Integer previousValue;

    private Integer nextValue;

    public ChangeTextLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTextLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public ChangeTextLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, ChangeTextLineItemQuantityChange.class + ": textLineItem is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemQuantityChange.class + ": nextValue is missing");
        return new ChangeTextLineItemQuantityChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    /**
     * builds ChangeTextLineItemQuantityChange without checking for non null required values
     */
    public ChangeTextLineItemQuantityChange buildUnchecked() {
        return new ChangeTextLineItemQuantityChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    public static ChangeTextLineItemQuantityChangeBuilder of() {
        return new ChangeTextLineItemQuantityChangeBuilder();
    }

    public static ChangeTextLineItemQuantityChangeBuilder of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeBuilder builder = new ChangeTextLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
