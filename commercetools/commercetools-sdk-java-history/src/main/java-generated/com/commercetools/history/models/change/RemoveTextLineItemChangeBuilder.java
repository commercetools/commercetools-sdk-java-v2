
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveTextLineItemChangeBuilder implements Builder<RemoveTextLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.TextLineItem previousValue;

    private com.commercetools.history.models.common.TextLineItem nextValue;

    public RemoveTextLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveTextLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    public RemoveTextLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.TextLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveTextLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    public RemoveTextLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TextLineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TextLineItem getNextValue() {
        return this.nextValue;
    }

    public RemoveTextLineItemChange build() {
        Objects.requireNonNull(change, RemoveTextLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveTextLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveTextLineItemChange.class + ": nextValue is missing");
        return new RemoveTextLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveTextLineItemChange without checking for non null required values
     */
    public RemoveTextLineItemChange buildUnchecked() {
        return new RemoveTextLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveTextLineItemChangeBuilder of() {
        return new RemoveTextLineItemChangeBuilder();
    }

    public static RemoveTextLineItemChangeBuilder of(final RemoveTextLineItemChange template) {
        RemoveTextLineItemChangeBuilder builder = new RemoveTextLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
