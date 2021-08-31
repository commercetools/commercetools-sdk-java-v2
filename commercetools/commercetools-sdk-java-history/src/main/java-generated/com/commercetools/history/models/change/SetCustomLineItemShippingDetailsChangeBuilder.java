
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemShippingDetailsChangeBuilder
        implements Builder<SetCustomLineItemShippingDetailsChange> {

    private String change;

    private String customLineItemId;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    public SetCustomLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemShippingDetailsChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemShippingDetailsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemShippingDetailsChange build() {
        Objects.requireNonNull(change, SetCustomLineItemShippingDetailsChange.class + ": change is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemShippingDetailsChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemShippingDetailsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            SetCustomLineItemShippingDetailsChange.class + ": previousValue is missing");
        return new SetCustomLineItemShippingDetailsChangeImpl(change, customLineItemId, nextValue, previousValue);
    }

    /**
     * builds SetCustomLineItemShippingDetailsChange without checking for non null required values
     */
    public SetCustomLineItemShippingDetailsChange buildUnchecked() {
        return new SetCustomLineItemShippingDetailsChangeImpl(change, customLineItemId, nextValue, previousValue);
    }

    public static SetCustomLineItemShippingDetailsChangeBuilder of() {
        return new SetCustomLineItemShippingDetailsChangeBuilder();
    }

    public static SetCustomLineItemShippingDetailsChangeBuilder of(
            final SetCustomLineItemShippingDetailsChange template) {
        SetCustomLineItemShippingDetailsChangeBuilder builder = new SetCustomLineItemShippingDetailsChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
