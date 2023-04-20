
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
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public CartAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public CartAddPaymentActionBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifier> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     * @return Builder
     */

    public CartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds CartAddPaymentAction with checking for non-null required values
     * @return CartAddPaymentAction
     */
    public CartAddPaymentAction build() {
        Objects.requireNonNull(payment, CartAddPaymentAction.class + ": payment is missing");
        return new CartAddPaymentActionImpl(payment);
    }

    /**
     * builds CartAddPaymentAction without checking for non-null required values
     * @return CartAddPaymentAction
     */
    public CartAddPaymentAction buildUnchecked() {
        return new CartAddPaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of CartAddPaymentActionBuilder
     * @return builder
     */
    public static CartAddPaymentActionBuilder of() {
        return new CartAddPaymentActionBuilder();
    }

    /**
     * create builder for CartAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddPaymentActionBuilder of(final CartAddPaymentAction template) {
        CartAddPaymentActionBuilder builder = new CartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
