
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTextLineItemDescriptionChangeBuilder implements Builder<SetTextLineItemDescriptionChange> {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetTextLineItemDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetTextLineItemDescriptionChange build() {
        Objects.requireNonNull(change, SetTextLineItemDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemDescriptionChange.class + ": textLineItem is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemDescriptionChange.class + ": nextValue is missing");
        return new SetTextLineItemDescriptionChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    /**
     * builds SetTextLineItemDescriptionChange without checking for non null required values
     */
    public SetTextLineItemDescriptionChange buildUnchecked() {
        return new SetTextLineItemDescriptionChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    public static SetTextLineItemDescriptionChangeBuilder of() {
        return new SetTextLineItemDescriptionChangeBuilder();
    }

    public static SetTextLineItemDescriptionChangeBuilder of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeBuilder builder = new SetTextLineItemDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
