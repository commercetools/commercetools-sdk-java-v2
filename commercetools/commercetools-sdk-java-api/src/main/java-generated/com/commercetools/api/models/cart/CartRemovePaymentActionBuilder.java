
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemovePaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemovePaymentAction cartRemovePaymentAction = CartRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemovePaymentActionBuilder implements Builder<CartRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @return Builder
     */

    public CartRemovePaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @param payment
     * @return Builder
     */

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
