
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemProductSlugChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.LocalizedString nextValue;

    private com.commercetools.history.models.LocalizedString previousValue;

    public SetLineItemProductSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder lineItem(
            final com.commercetools.history.models.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder nextValue(
            final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemProductSlugChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemProductSlugChange build() {
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
