
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetReturnPaymentStateChangeBuilder {

    private String change;

    private com.commercetools.history.models.ReturnPaymentState nextValue;

    private com.commercetools.history.models.ReturnPaymentState previousValue;

    public SetReturnPaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetReturnPaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.ReturnPaymentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetReturnPaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.ReturnPaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ReturnPaymentState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.ReturnPaymentState getPreviousValue() {
        return this.previousValue;
    }

    public SetReturnPaymentStateChange build() {
        return new SetReturnPaymentStateChangeImpl(change, nextValue, previousValue);
    }

    public static SetReturnPaymentStateChangeBuilder of() {
        return new SetReturnPaymentStateChangeBuilder();
    }

    public static SetReturnPaymentStateChangeBuilder of(final SetReturnPaymentStateChange template) {
        SetReturnPaymentStateChangeBuilder builder = new SetReturnPaymentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
