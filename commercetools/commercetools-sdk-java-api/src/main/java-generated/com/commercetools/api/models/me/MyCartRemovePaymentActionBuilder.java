
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartRemovePaymentActionBuilder implements Builder<MyCartRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public MyCartRemovePaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public MyCartRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public MyCartRemovePaymentAction build() {
        Objects.requireNonNull(payment, MyCartRemovePaymentAction.class + ": payment is missing");
        return new MyCartRemovePaymentActionImpl(payment);
    }

    /**
     * builds MyCartRemovePaymentAction without checking for non null required values
     */
    public MyCartRemovePaymentAction buildUnchecked() {
        return new MyCartRemovePaymentActionImpl(payment);
    }

    public static MyCartRemovePaymentActionBuilder of() {
        return new MyCartRemovePaymentActionBuilder();
    }

    public static MyCartRemovePaymentActionBuilder of(final MyCartRemovePaymentAction template) {
        MyCartRemovePaymentActionBuilder builder = new MyCartRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
