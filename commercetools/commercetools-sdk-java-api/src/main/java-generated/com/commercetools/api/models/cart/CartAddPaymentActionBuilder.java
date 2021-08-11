
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddPaymentActionBuilder implements Builder<CartAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public CartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public CartAddPaymentAction build() {
        Objects.requireNonNull(payment, CartAddPaymentAction.class + ": payment is missing");
        return new CartAddPaymentActionImpl(payment);
    }

    /**
     * builds CartAddPaymentAction without checking for non null required values
     */
    public CartAddPaymentAction buildUnchecked() {
        return new CartAddPaymentActionImpl(payment);
    }

    public static CartAddPaymentActionBuilder of() {
        return new CartAddPaymentActionBuilder();
    }

    public static CartAddPaymentActionBuilder of(final CartAddPaymentAction template) {
        CartAddPaymentActionBuilder builder = new CartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
