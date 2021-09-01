
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeQuantityChangeBuilder implements Builder<ChangeQuantityChange> {

    private String change;

    private com.commercetools.history.models.change_value.InventoryQuantityValue nextValue;

    private com.commercetools.history.models.change_value.InventoryQuantityValue previousValue;

    public ChangeQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeQuantityChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of())
                .build();
        return this;
    }

    public ChangeQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.InventoryQuantityValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeQuantityChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.InventoryQuantityValueBuilder, com.commercetools.history.models.change_value.InventoryQuantityValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.InventoryQuantityValueBuilder.of())
                .build();
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
        Objects.requireNonNull(change, ChangeQuantityChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeQuantityChange.class + ": previousValue is missing");
        return new ChangeQuantityChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeQuantityChange without checking for non null required values
     */
    public ChangeQuantityChange buildUnchecked() {
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
