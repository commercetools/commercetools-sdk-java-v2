
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTextLineItemNameChangeBuilder implements Builder<ChangeTextLineItemNameChange> {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public ChangeTextLineItemNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeTextLineItemNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public ChangeTextLineItemNameChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemNameChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, ChangeTextLineItemNameChange.class + ": textLineItem is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemNameChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemNameChange.class + ": previousValue is missing");
        return new ChangeTextLineItemNameChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    /**
     * builds ChangeTextLineItemNameChange without checking for non null required values
     */
    public ChangeTextLineItemNameChange buildUnchecked() {
        return new ChangeTextLineItemNameChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    public static ChangeTextLineItemNameChangeBuilder of() {
        return new ChangeTextLineItemNameChangeBuilder();
    }

    public static ChangeTextLineItemNameChangeBuilder of(final ChangeTextLineItemNameChange template) {
        ChangeTextLineItemNameChangeBuilder builder = new ChangeTextLineItemNameChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
