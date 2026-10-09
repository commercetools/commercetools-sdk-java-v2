
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemRecurringDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemRecurringDraft transactionItemRecurringDraft = TransactionItemRecurringDraft.builder()
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .connectorDeployment(connectorDeploymentBuilder -> connectorDeploymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemRecurringDraftBuilder implements Builder<TransactionItemRecurringDraft> {

    @Nullable
    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder amount(
            @Nullable final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder paymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @param builder function to build the paymentMethod value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder withPaymentMethod(
            Function<com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder, com.commercetools.checkout.models.common.PaymentMethodReference> builder) {
        this.paymentMethod = builder.apply(com.commercetools.checkout.models.common.PaymentMethodReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @param paymentMethod value to be set
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder paymentMethod(
            final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder connectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @param builder function to build the connectorDeployment value
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder withConnectorDeployment(
            Function<com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder, com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference> builder) {
        this.connectorDeployment = builder
                .apply(com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @param connectorDeployment value to be set
     * @return Builder
     */

    public TransactionItemRecurringDraftBuilder connectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item. If not present, the Connector resolves the amount from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @return amount
     */

    @Nullable
    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> to charge. The PaymentMethod must belong to the same customer as the Cart referenced by the Transaction.</p>
     * @return paymentMethod
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Reference to the connector deployment to use to execute the payment.</p>
     * @return connectorDeployment
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    /**
     * builds TransactionItemRecurringDraft with checking for non-null required values
     * @return TransactionItemRecurringDraft
     */
    public TransactionItemRecurringDraft build() {
        Objects.requireNonNull(paymentMethod, TransactionItemRecurringDraft.class + ": paymentMethod is missing");
        Objects.requireNonNull(connectorDeployment,
            TransactionItemRecurringDraft.class + ": connectorDeployment is missing");
        return new TransactionItemRecurringDraftImpl(amount, paymentMethod, connectorDeployment);
    }

    /**
     * builds TransactionItemRecurringDraft without checking for non-null required values
     * @return TransactionItemRecurringDraft
     */
    public TransactionItemRecurringDraft buildUnchecked() {
        return new TransactionItemRecurringDraftImpl(amount, paymentMethod, connectorDeployment);
    }

    /**
     * factory method for an instance of TransactionItemRecurringDraftBuilder
     * @return builder
     */
    public static TransactionItemRecurringDraftBuilder of() {
        return new TransactionItemRecurringDraftBuilder();
    }

    /**
     * create builder for TransactionItemRecurringDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemRecurringDraftBuilder of(final TransactionItemRecurringDraft template) {
        TransactionItemRecurringDraftBuilder builder = new TransactionItemRecurringDraftBuilder();
        builder.amount = template.getAmount();
        builder.paymentMethod = template.getPaymentMethod();
        builder.connectorDeployment = template.getConnectorDeployment();
        return builder;
    }

}
