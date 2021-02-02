
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartAddPaymentActionBuilder {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public MyCartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public MyCartAddPaymentAction build() {
        return new MyCartAddPaymentActionImpl(payment);
    }

    public static MyCartAddPaymentActionBuilder of() {
        return new MyCartAddPaymentActionBuilder();
    }

    public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
