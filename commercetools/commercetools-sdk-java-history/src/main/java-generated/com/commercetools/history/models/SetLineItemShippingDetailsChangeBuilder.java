
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLineItemShippingDetailsChangeBuilder {

    private String change;

    private String lineItemId;

    private com.commercetools.history.models.ItemShippingDetails nextValue;

    private com.commercetools.history.models.ItemShippingDetails previousValue;

    public SetLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.history.models.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    public SetLineItemShippingDetailsChange build() {
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
