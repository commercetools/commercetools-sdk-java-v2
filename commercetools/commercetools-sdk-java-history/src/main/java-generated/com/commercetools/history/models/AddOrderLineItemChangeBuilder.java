
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddOrderLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.LineItem previousValue;

    private com.commercetools.history.models.LineItem nextValue;

    public AddOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddOrderLineItemChangeBuilder previousValue(final com.commercetools.history.models.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddOrderLineItemChangeBuilder nextValue(final com.commercetools.history.models.LineItem nextValue) {
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

    public AddOrderLineItemChange build() {
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    public static AddOrderLineItemChangeBuilder of() {
        return new AddOrderLineItemChangeBuilder();
    }

    public static AddOrderLineItemChangeBuilder of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeBuilder builder = new AddOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
