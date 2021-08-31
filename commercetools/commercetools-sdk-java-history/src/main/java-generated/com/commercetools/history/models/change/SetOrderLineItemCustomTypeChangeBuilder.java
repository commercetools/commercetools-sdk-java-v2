
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderLineItemCustomTypeChangeBuilder implements Builder<SetOrderLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    public SetOrderLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetOrderLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetOrderLineItemCustomTypeChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetOrderLineItemCustomTypeChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetOrderLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderLineItemCustomTypeChange.class + ": previousValue is missing");
        return new SetOrderLineItemCustomTypeChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetOrderLineItemCustomTypeChange without checking for non null required values
     */
    public SetOrderLineItemCustomTypeChange buildUnchecked() {
        return new SetOrderLineItemCustomTypeChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetOrderLineItemCustomTypeChangeBuilder of() {
        return new SetOrderLineItemCustomTypeChangeBuilder();
    }

    public static SetOrderLineItemCustomTypeChangeBuilder of(final SetOrderLineItemCustomTypeChange template) {
        SetOrderLineItemCustomTypeChangeBuilder builder = new SetOrderLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
