
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemRecurringBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemRecurring transactionItemRecurring = TransactionItemRecurring.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemRecurringBuilder implements Builder<TransactionItemRecurring> {

    @Nullable
    private com.commercetools.checkout.models.common.Amount amount;

    @Nullable
    private com.commercetools.checkout.models.payment.PaymentReference payment;

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemRecurringBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemRecurringBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TransactionItemRecurringBuilder amount(
            @Nullable final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public TransactionItemRecurringBuilder payment(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReferenceBuilder> builder) {
        this.payment = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public TransactionItemRecurringBuilder withPayment(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReference> builder) {
        this.payment = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @param payment value to be set
     * @return Builder
     */

    public TransactionItemRecurringBuilder payment(
            @Nullable final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public TransactionItemRecurringBuilder paymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public TransactionItemRecurringBuilder withPaymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReference> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public TransactionItemRecurringBuilder paymentMethod(
            final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public TransactionItemRecurringBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public TransactionItemRecurringBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public TransactionItemRecurringBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
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
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     * @return payment
     */

    @Nullable
    public com.commercetools.checkout.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     * @return paymentMethod
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     * @return connectorDeployment
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     * builds TransactionItemRecurring with checking for non-null required values
     * @return TransactionItemRecurring
     */
    public TransactionItemRecurring build() {
        Objects.requireNonNull(paymentMethod, TransactionItemRecurring.class + ": paymentMethod is missing");
        Objects.requireNonNull(connectorDeployment,
            TransactionItemRecurring.class + ": connectorDeployment is missing");
        return new TransactionItemRecurringImpl(amount, payment, paymentMethod, connectorDeployment);
    }

    /**
     * builds TransactionItemRecurring without checking for non-null required values
     * @return TransactionItemRecurring
     */
    public TransactionItemRecurring buildUnchecked() {
        return new TransactionItemRecurringImpl(amount, payment, paymentMethod, connectorDeployment);
    }

    /**
     * factory method for an instance of TransactionItemRecurringBuilder
     * @return builder
     */
    public static TransactionItemRecurringBuilder of() {
        return new TransactionItemRecurringBuilder();
    }

    /**
     * create builder for TransactionItemRecurring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemRecurringBuilder of(final TransactionItemRecurring template) {
        TransactionItemRecurringBuilder builder = new TransactionItemRecurringBuilder();
        builder.amount = template.getAmount();
        builder.payment = template.getPayment();
        builder.paymentMethod = template.getPaymentMethod();
        builder.connectorDeployment = template.getConnectorDeployment();
        return builder;
    }

}
