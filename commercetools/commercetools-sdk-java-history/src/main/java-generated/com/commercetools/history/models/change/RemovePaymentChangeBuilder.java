
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemovePaymentChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.PaymentInfo nextValue;

    private com.commercetools.history.models.common.PaymentInfo previousValue;

    public RemovePaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemovePaymentChangeBuilder nextValue(final com.commercetools.history.models.common.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemovePaymentChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    public RemovePaymentChange build() {
        return new RemovePaymentChangeImpl(change, nextValue, previousValue);
    }

    public static RemovePaymentChangeBuilder of() {
        return new RemovePaymentChangeBuilder();
    }

    public static RemovePaymentChangeBuilder of(final RemovePaymentChange template) {
        RemovePaymentChangeBuilder builder = new RemovePaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
