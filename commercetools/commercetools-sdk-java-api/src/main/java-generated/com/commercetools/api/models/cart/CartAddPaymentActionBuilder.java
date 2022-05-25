
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddPaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddPaymentAction cartAddPaymentAction = CartAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddPaymentActionBuilder implements Builder<CartAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *
     */

    public CartAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

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
