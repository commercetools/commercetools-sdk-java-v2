
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShoppingListLineItemCustomFieldChangeBuilder
        implements Builder<SetShoppingListLineItemCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetShoppingListLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShoppingListLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SetShoppingListLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    public SetShoppingListLineItemCustomFieldChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public SetShoppingListLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShoppingListLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetShoppingListLineItemCustomFieldChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(name);
        Objects.requireNonNull(customTypeId);
        Objects.requireNonNull(lineItem);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, name, customTypeId, lineItem, nextValue,
            previousValue);
    }

    /**
     * builds SetShoppingListLineItemCustomFieldChange without checking for non null required values
     */
    public SetShoppingListLineItemCustomFieldChange buildUnchecked() {
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, name, customTypeId, lineItem, nextValue,
            previousValue);
    }

    public static SetShoppingListLineItemCustomFieldChangeBuilder of() {
        return new SetShoppingListLineItemCustomFieldChangeBuilder();
    }

    public static SetShoppingListLineItemCustomFieldChangeBuilder of(
            final SetShoppingListLineItemCustomFieldChange template) {
        SetShoppingListLineItemCustomFieldChangeBuilder builder = new SetShoppingListLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
