
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangePaymentStateChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.PaymentState nextValue;

    private com.commercetools.history.models.common.PaymentState previousValue;

    public ChangePaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangePaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.PaymentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangePaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.PaymentState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.PaymentState getPreviousValue() {
        return this.previousValue;
    }

    public ChangePaymentStateChange build() {
        return new ChangePaymentStateChangeImpl(change, nextValue, previousValue);
    }

    public static ChangePaymentStateChangeBuilder of() {
        return new ChangePaymentStateChangeBuilder();
    }

    public static ChangePaymentStateChangeBuilder of(final ChangePaymentStateChange template) {
        ChangePaymentStateChangeBuilder builder = new ChangePaymentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
