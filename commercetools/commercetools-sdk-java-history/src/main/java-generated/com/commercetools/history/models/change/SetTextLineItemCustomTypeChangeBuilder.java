
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTextLineItemCustomTypeChangeBuilder implements Builder<SetTextLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetTextLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetTextLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetTextLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetTextLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemCustomTypeChange.class + ": textLineItem is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemCustomTypeChange.class + ": previousValue is missing");
        return new SetTextLineItemCustomTypeChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    /**
     * builds SetTextLineItemCustomTypeChange without checking for non null required values
     */
    public SetTextLineItemCustomTypeChange buildUnchecked() {
        return new SetTextLineItemCustomTypeChangeImpl(change, textLineItem, nextValue, previousValue);
    }

    public static SetTextLineItemCustomTypeChangeBuilder of() {
        return new SetTextLineItemCustomTypeChangeBuilder();
    }

    public static SetTextLineItemCustomTypeChangeBuilder of(final SetTextLineItemCustomTypeChange template) {
        SetTextLineItemCustomTypeChangeBuilder builder = new SetTextLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
