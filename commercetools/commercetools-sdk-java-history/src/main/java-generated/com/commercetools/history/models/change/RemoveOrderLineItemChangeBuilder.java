
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveOrderLineItemChangeBuilder implements Builder<RemoveOrderLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    public RemoveOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveOrderLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    public RemoveOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveOrderLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    public RemoveOrderLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LineItem getNextValue() {
        return this.nextValue;
    }

    public RemoveOrderLineItemChange build() {
        Objects.requireNonNull(change, RemoveOrderLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveOrderLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveOrderLineItemChange.class + ": nextValue is missing");
        return new RemoveOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveOrderLineItemChange without checking for non null required values
     */
    public RemoveOrderLineItemChange buildUnchecked() {
        return new RemoveOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveOrderLineItemChangeBuilder of() {
        return new RemoveOrderLineItemChangeBuilder();
    }

    public static RemoveOrderLineItemChangeBuilder of(final RemoveOrderLineItemChange template) {
        RemoveOrderLineItemChangeBuilder builder = new RemoveOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
