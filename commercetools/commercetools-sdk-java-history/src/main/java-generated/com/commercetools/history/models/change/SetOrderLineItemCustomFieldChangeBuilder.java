
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetOrderLineItemCustomFieldChangeBuilder implements Builder<SetOrderLineItemCustomFieldChange> {

    private String change;

    private String customTypeId;

    private String name;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetOrderLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetOrderLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public String getName() {
        return this.name;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetOrderLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetOrderLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(customTypeId, SetOrderLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(name, SetOrderLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(variant, SetOrderLineItemCustomFieldChange.class + ": variant is missing");
        Objects.requireNonNull(lineItem, SetOrderLineItemCustomFieldChange.class + ": lineItem is missing");
        Objects.requireNonNull(nextValue, SetOrderLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderLineItemCustomFieldChange.class + ": previousValue is missing");
        return new SetOrderLineItemCustomFieldChangeImpl(change, customTypeId, name, variant, lineItem, nextValue,
            previousValue);
    }

    /**
     * builds SetOrderLineItemCustomFieldChange without checking for non null required values
     */
    public SetOrderLineItemCustomFieldChange buildUnchecked() {
        return new SetOrderLineItemCustomFieldChangeImpl(change, customTypeId, name, variant, lineItem, nextValue,
            previousValue);
    }

    public static SetOrderLineItemCustomFieldChangeBuilder of() {
        return new SetOrderLineItemCustomFieldChangeBuilder();
    }

    public static SetOrderLineItemCustomFieldChangeBuilder of(final SetOrderLineItemCustomFieldChange template) {
        SetOrderLineItemCustomFieldChangeBuilder builder = new SetOrderLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.customTypeId = template.getCustomTypeId();
        builder.name = template.getName();
        builder.variant = template.getVariant();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
