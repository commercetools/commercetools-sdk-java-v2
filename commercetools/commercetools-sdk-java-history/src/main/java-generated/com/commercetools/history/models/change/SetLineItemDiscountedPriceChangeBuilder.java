
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemDiscountedPriceChangeBuilder implements Builder<SetLineItemDiscountedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.DiscountedLineItemPrice nextValue;

    private com.commercetools.history.models.common.DiscountedLineItemPrice previousValue;

    public SetLineItemDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    public SetLineItemDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice previousValue) {
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

    public com.commercetools.history.models.common.DiscountedLineItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.DiscountedLineItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetLineItemDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDiscountedPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDiscountedPriceChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDiscountedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemDiscountedPriceChange.class + ": previousValue is missing");
        return new SetLineItemDiscountedPriceChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetLineItemDiscountedPriceChange without checking for non null required values
     */
    public SetLineItemDiscountedPriceChange buildUnchecked() {
        return new SetLineItemDiscountedPriceChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetLineItemDiscountedPriceChangeBuilder of() {
        return new SetLineItemDiscountedPriceChangeBuilder();
    }

    public static SetLineItemDiscountedPriceChangeBuilder of(final SetLineItemDiscountedPriceChange template) {
        SetLineItemDiscountedPriceChangeBuilder builder = new SetLineItemDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
