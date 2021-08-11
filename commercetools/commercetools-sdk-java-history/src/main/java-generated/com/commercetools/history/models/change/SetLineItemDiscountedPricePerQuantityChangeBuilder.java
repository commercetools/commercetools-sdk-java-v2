
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemDiscountedPricePerQuantityChangeBuilder
        implements Builder<SetLineItemDiscountedPricePerQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    public SetLineItemDiscountedPricePerQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
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

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemDiscountedPricePerQuantityChange build() {
        Objects.requireNonNull(change, SetLineItemDiscountedPricePerQuantityChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDiscountedPricePerQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDiscountedPricePerQuantityChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDiscountedPricePerQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            SetLineItemDiscountedPricePerQuantityChange.class + ": previousValue is missing");
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetLineItemDiscountedPricePerQuantityChange without checking for non null required values
     */
    public SetLineItemDiscountedPricePerQuantityChange buildUnchecked() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of() {
        return new SetLineItemDiscountedPricePerQuantityChangeBuilder();
    }

    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        SetLineItemDiscountedPricePerQuantityChangeBuilder builder = new SetLineItemDiscountedPricePerQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
