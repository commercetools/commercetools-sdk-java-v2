
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeQuantityChangeBuilder {

    private String change;

    private com.commercetools.history.models.change_value.InventoryQuantityValue nextValue;

    private com.commercetools.history.models.change_value.InventoryQuantityValue previousValue;

    public ChangeQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.InventoryQuantityValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeQuantityChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.InventoryQuantityValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.InventoryQuantityValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.change_value.InventoryQuantityValue getPreviousValue() {
        return this.previousValue;
    }

    public ChangeQuantityChange build() {
        return new ChangeQuantityChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeQuantityChangeBuilder of() {
        return new ChangeQuantityChangeBuilder();
    }

    public static ChangeQuantityChangeBuilder of(final ChangeQuantityChange template) {
        ChangeQuantityChangeBuilder builder = new ChangeQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
