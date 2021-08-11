
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddCustomLineItemChangeBuilder implements Builder<AddCustomLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.CustomLineItem nextValue;

    private com.commercetools.history.models.common.CustomLineItem previousValue;

    public AddCustomLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddCustomLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    public AddCustomLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddCustomLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    public AddCustomLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.CustomLineItem getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomLineItem getPreviousValue() {
        return this.previousValue;
    }

    public AddCustomLineItemChange build() {
        Objects.requireNonNull(change, AddCustomLineItemChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddCustomLineItemChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddCustomLineItemChange.class + ": previousValue is missing");
        return new AddCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddCustomLineItemChange without checking for non null required values
     */
    public AddCustomLineItemChange buildUnchecked() {
        return new AddCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    public static AddCustomLineItemChangeBuilder of() {
        return new AddCustomLineItemChangeBuilder();
    }

    public static AddCustomLineItemChangeBuilder of(final AddCustomLineItemChange template) {
        AddCustomLineItemChangeBuilder builder = new AddCustomLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
