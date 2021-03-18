
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddPaymentChangeBuilder {

    private String change;

    private com.commercetools.history.models.PaymentInfo nextValue;

    private com.commercetools.history.models.PaymentInfo previousValue;

    public AddPaymentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddPaymentChangeBuilder nextValue(final com.commercetools.history.models.PaymentInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddPaymentChangeBuilder previousValue(final com.commercetools.history.models.PaymentInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.PaymentInfo getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.PaymentInfo getPreviousValue() {
        return this.previousValue;
    }

    public AddPaymentChange build() {
        return new AddPaymentChangeImpl(change, nextValue, previousValue);
    }

    public static AddPaymentChangeBuilder of() {
        return new AddPaymentChangeBuilder();
    }

    public static AddPaymentChangeBuilder of(final AddPaymentChange template) {
        AddPaymentChangeBuilder builder = new AddPaymentChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
