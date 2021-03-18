
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveOrderLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.LineItem previousValue;

    private com.commercetools.history.models.LineItem nextValue;

    public RemoveOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveOrderLineItemChangeBuilder nextValue(final com.commercetools.history.models.LineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.LineItem getNextValue() {
        return this.nextValue;
    }

    public RemoveOrderLineItemChange build() {
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
