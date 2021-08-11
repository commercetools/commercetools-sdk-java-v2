
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemCustomTypeChangeBuilder implements Builder<SetCustomLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetCustomLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetCustomLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemCustomTypeChange.class + ": customLineItem is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemCustomTypeChange.class + ": previousValue is missing");
        return new SetCustomLineItemCustomTypeChangeImpl(change, customLineItem, nextValue, previousValue);
    }

    /**
     * builds SetCustomLineItemCustomTypeChange without checking for non null required values
     */
    public SetCustomLineItemCustomTypeChange buildUnchecked() {
        return new SetCustomLineItemCustomTypeChangeImpl(change, customLineItem, nextValue, previousValue);
    }

    public static SetCustomLineItemCustomTypeChangeBuilder of() {
        return new SetCustomLineItemCustomTypeChangeBuilder();
    }

    public static SetCustomLineItemCustomTypeChangeBuilder of(final SetCustomLineItemCustomTypeChange template) {
        SetCustomLineItemCustomTypeChangeBuilder builder = new SetCustomLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
