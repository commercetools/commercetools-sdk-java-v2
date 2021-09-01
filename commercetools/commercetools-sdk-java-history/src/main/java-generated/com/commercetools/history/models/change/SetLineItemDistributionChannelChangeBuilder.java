
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemDistributionChannelChangeBuilder
        implements Builder<SetLineItemDistributionChannelChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.Reference nextValue;

    private com.commercetools.history.models.common.Reference previousValue;

    public SetLineItemDistributionChannelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetLineItemDistributionChannelChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
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

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemDistributionChannelChange build() {
        Objects.requireNonNull(change, SetLineItemDistributionChannelChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDistributionChannelChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDistributionChannelChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemDistributionChannelChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            SetLineItemDistributionChannelChange.class + ": previousValue is missing");
        return new SetLineItemDistributionChannelChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetLineItemDistributionChannelChange without checking for non null required values
     */
    public SetLineItemDistributionChannelChange buildUnchecked() {
        return new SetLineItemDistributionChannelChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetLineItemDistributionChannelChangeBuilder of() {
        return new SetLineItemDistributionChannelChangeBuilder();
    }

    public static SetLineItemDistributionChannelChangeBuilder of(final SetLineItemDistributionChannelChange template) {
        SetLineItemDistributionChannelChangeBuilder builder = new SetLineItemDistributionChannelChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
