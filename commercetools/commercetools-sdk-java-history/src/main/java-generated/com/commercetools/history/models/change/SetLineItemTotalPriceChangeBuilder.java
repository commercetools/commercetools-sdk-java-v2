
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemTotalPriceChangeBuilder implements Builder<SetLineItemTotalPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetLineItemTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetLineItemTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemTotalPriceChange build() {
        Objects.requireNonNull(change, SetLineItemTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemTotalPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(nextValue, SetLineItemTotalPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemTotalPriceChange.class + ": previousValue is missing");
        return new SetLineItemTotalPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    /**
     * builds SetLineItemTotalPriceChange without checking for non null required values
     */
    public SetLineItemTotalPriceChange buildUnchecked() {
        return new SetLineItemTotalPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    public static SetLineItemTotalPriceChangeBuilder of() {
        return new SetLineItemTotalPriceChangeBuilder();
    }

    public static SetLineItemTotalPriceChangeBuilder of(final SetLineItemTotalPriceChange template) {
        SetLineItemTotalPriceChangeBuilder builder = new SetLineItemTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
