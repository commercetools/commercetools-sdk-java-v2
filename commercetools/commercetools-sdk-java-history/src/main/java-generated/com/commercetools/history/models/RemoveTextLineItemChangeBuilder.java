
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveTextLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.TextLineItem previousValue;

    private com.commercetools.history.models.TextLineItem nextValue;

    public RemoveTextLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveTextLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.TextLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveTextLineItemChangeBuilder nextValue(final com.commercetools.history.models.TextLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.TextLineItem getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.TextLineItem getNextValue() {
        return this.nextValue;
    }

    public RemoveTextLineItemChange build() {
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
