
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemShippingDetailsChangeBuilder implements Builder<SetLineItemShippingDetailsChange> {

    private String change;

    private String lineItemId;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    public SetLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemShippingDetailsChange build() {
        Objects.requireNonNull(change, SetLineItemShippingDetailsChange.class + ": change is missing");
        Objects.requireNonNull(lineItemId, SetLineItemShippingDetailsChange.class + ": lineItemId is missing");
        Objects.requireNonNull(nextValue, SetLineItemShippingDetailsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemShippingDetailsChange.class + ": previousValue is missing");
        return new SetLineItemShippingDetailsChangeImpl(change, lineItemId, nextValue, previousValue);
    }

    /**
     * builds SetLineItemShippingDetailsChange without checking for non null required values
     */
    public SetLineItemShippingDetailsChange buildUnchecked() {
        return new SetLineItemShippingDetailsChangeImpl(change, lineItemId, nextValue, previousValue);
    }

    public static SetLineItemShippingDetailsChangeBuilder of() {
        return new SetLineItemShippingDetailsChangeBuilder();
    }

    public static SetLineItemShippingDetailsChangeBuilder of(final SetLineItemShippingDetailsChange template) {
        SetLineItemShippingDetailsChangeBuilder builder = new SetLineItemShippingDetailsChangeBuilder();
        builder.change = template.getChange();
        builder.lineItemId = template.getLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
