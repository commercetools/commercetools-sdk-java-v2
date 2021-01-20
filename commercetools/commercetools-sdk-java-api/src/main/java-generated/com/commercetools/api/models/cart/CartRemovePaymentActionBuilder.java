
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartRemovePaymentAction;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemovePaymentActionBuilder {

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
