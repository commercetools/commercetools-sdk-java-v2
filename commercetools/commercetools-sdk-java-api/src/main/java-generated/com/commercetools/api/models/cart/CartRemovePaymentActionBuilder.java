
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemovePaymentActionBuilder implements Builder<CartRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    public CartRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public CartRemovePaymentAction build() {
        Objects.requireNonNull(payment, CartRemovePaymentAction.class + ": payment is missing");
        return new CartRemovePaymentActionImpl(payment);
    }

    /**
     * builds CartRemovePaymentAction without checking for non null required values
     */
    public CartRemovePaymentAction buildUnchecked() {
        return new CartRemovePaymentActionImpl(payment);
    }

    public static CartRemovePaymentActionBuilder of() {
        return new CartRemovePaymentActionBuilder();
    }

    public static CartRemovePaymentActionBuilder of(final CartRemovePaymentAction template) {
        CartRemovePaymentActionBuilder builder = new CartRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
