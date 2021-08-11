
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemProductSlugChangeBuilder implements Builder<SetLineItemProductSlugChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public SetLineItemProductSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemProductSlugChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemProductSlugChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetLineItemProductSlugChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
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

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemProductSlugChange build() {
        Objects.requireNonNull(change, SetLineItemProductSlugChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemProductSlugChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemProductSlugChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetLineItemProductSlugChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemProductSlugChange.class + ": previousValue is missing");
        return new SetLineItemProductSlugChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetLineItemProductSlugChange without checking for non null required values
     */
    public SetLineItemProductSlugChange buildUnchecked() {
        return new SetLineItemProductSlugChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetLineItemProductSlugChangeBuilder of() {
        return new SetLineItemProductSlugChangeBuilder();
    }

    public static SetLineItemProductSlugChangeBuilder of(final SetLineItemProductSlugChange template) {
        SetLineItemProductSlugChangeBuilder builder = new SetLineItemProductSlugChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
