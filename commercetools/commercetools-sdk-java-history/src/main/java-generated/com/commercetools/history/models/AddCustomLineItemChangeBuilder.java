
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddCustomLineItemChangeBuilder {

    private String change;

    private com.commercetools.history.models.CustomLineItem nextValue;

    private com.commercetools.history.models.CustomLineItem previousValue;

    public AddCustomLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddCustomLineItemChangeBuilder nextValue(final com.commercetools.history.models.CustomLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddCustomLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.CustomLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.CustomLineItem getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.CustomLineItem getPreviousValue() {
        return this.previousValue;
    }

    public AddCustomLineItemChange build() {
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
