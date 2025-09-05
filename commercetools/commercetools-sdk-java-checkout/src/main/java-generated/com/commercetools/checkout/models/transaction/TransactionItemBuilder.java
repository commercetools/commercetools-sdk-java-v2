
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItem transactionItem = TransactionItem.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemBuilder implements Builder<TransactionItem> {

    @Nullable
    private com.commercetools.checkout.models.payment.PaymentReference payment;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration;

    @Nullable
    private com.commercetools.checkout.models.common.Amount amount;

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public TransactionItemBuilder payment(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReferenceBuilder> builder) {
        this.payment = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public TransactionItemBuilder withPayment(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReference> builder) {
        this.payment = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @param payment value to be set
     * @return Builder
     */

    public TransactionItemBuilder payment(
            @Nullable final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param builder function to build the paymentIntegration value
     * @return Builder
     */

    public TransactionItemBuilder paymentIntegration(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder> builder) {
        this.paymentIntegration = builder
                .apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param builder function to build the paymentIntegration value
     * @return Builder
     */

    public TransactionItemBuilder withPaymentIntegration(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference> builder) {
        this.paymentIntegration = builder
                .apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param paymentIntegration value to be set
     * @return Builder
     */

    public TransactionItemBuilder paymentIntegration(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TransactionItemBuilder amount(@Nullable final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Reference to the <span>Payment</span> associated with the Transaction Item.</p>
     * @return payment
     */

    @Nullable
    public com.commercetools.checkout.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    /**
     *  <p>Reference to the <span>Payment Integration</span> to use to execute the payment.</p>
     * @return paymentIntegration
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference getPaymentIntegration() {
        return this.paymentIntegration;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @return amount
     */

    @Nullable
    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     * builds TransactionItem with checking for non-null required values
     * @return TransactionItem
     */
    public TransactionItem build() {
        Objects.requireNonNull(paymentIntegration, TransactionItem.class + ": paymentIntegration is missing");
        return new TransactionItemImpl(payment, paymentIntegration, amount);
    }

    /**
     * builds TransactionItem without checking for non-null required values
     * @return TransactionItem
     */
    public TransactionItem buildUnchecked() {
        return new TransactionItemImpl(payment, paymentIntegration, amount);
    }

    /**
     * factory method for an instance of TransactionItemBuilder
     * @return builder
     */
    public static TransactionItemBuilder of() {
        return new TransactionItemBuilder();
    }

    /**
     * create builder for TransactionItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemBuilder of(final TransactionItem template) {
        TransactionItemBuilder builder = new TransactionItemBuilder();
        builder.payment = template.getPayment();
        builder.paymentIntegration = template.getPaymentIntegration();
        builder.amount = template.getAmount();
        return builder;
    }

}
