
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemCustomFieldChangeBuilder implements Builder<SetCustomLineItemCustomFieldChange> {

    private String change;

    private String name;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetCustomLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SetCustomLineItemCustomFieldChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemCustomFieldChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetCustomLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetCustomLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customLineItem,
            SetCustomLineItemCustomFieldChange.class + ": customLineItem is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemCustomFieldChange.class + ": previousValue is missing");
        return new SetCustomLineItemCustomFieldChangeImpl(change, name, customLineItem, nextValue, previousValue);
    }

    /**
     * builds SetCustomLineItemCustomFieldChange without checking for non null required values
     */
    public SetCustomLineItemCustomFieldChange buildUnchecked() {
        return new SetCustomLineItemCustomFieldChangeImpl(change, name, customLineItem, nextValue, previousValue);
    }

    public static SetCustomLineItemCustomFieldChangeBuilder of() {
        return new SetCustomLineItemCustomFieldChangeBuilder();
    }

    public static SetCustomLineItemCustomFieldChangeBuilder of(final SetCustomLineItemCustomFieldChange template) {
        SetCustomLineItemCustomFieldChangeBuilder builder = new SetCustomLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customLineItem = template.getCustomLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
