
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemTaxedPriceChangeBuilder implements Builder<SetLineItemTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    public SetLineItemTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    public SetLineItemTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemTaxedPriceChange build() {
        Objects.requireNonNull(change, SetLineItemTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemTaxedPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, SetLineItemTaxedPriceChange.class + ": lineItemId is missing");
        Objects.requireNonNull(nextValue, SetLineItemTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemTaxedPriceChange.class + ": previousValue is missing");
        return new SetLineItemTaxedPriceChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    /**
     * builds SetLineItemTaxedPriceChange without checking for non null required values
     */
    public SetLineItemTaxedPriceChange buildUnchecked() {
        return new SetLineItemTaxedPriceChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    public static SetLineItemTaxedPriceChangeBuilder of() {
        return new SetLineItemTaxedPriceChangeBuilder();
    }

    public static SetLineItemTaxedPriceChangeBuilder of(final SetLineItemTaxedPriceChange template) {
        SetLineItemTaxedPriceChangeBuilder builder = new SetLineItemTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
