
package com.commercetools.checkout.models.transaction;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionItemDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionItemDraft transactionItemDraft = TransactionItemDraft.builder()
 *             .paymentIntegration(paymentIntegrationBuilder -> paymentIntegrationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemDraftBuilder implements Builder<TransactionItemDraft> {

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration;

    @Nullable
    private com.commercetools.checkout.models.common.Amount amount;

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param builder function to build the paymentIntegration value
     * @return Builder
     */

    public TransactionItemDraftBuilder paymentIntegration(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder> builder) {
        this.paymentIntegration = builder
                .apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder
                        .of())
                .build();
        return this;
    }

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param builder function to build the paymentIntegration value
     * @return Builder
     */

    public TransactionItemDraftBuilder withPaymentIntegration(
            Function<com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder, com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier> builder) {
        this.paymentIntegration = builder.apply(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @param paymentIntegration value to be set
     * @return Builder
     */

    public TransactionItemDraftBuilder paymentIntegration(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemDraftBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionItemDraftBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TransactionItemDraftBuilder amount(@Nullable final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Resource Identifier of the <span>Payment Integration</span> to use to execute the payment.</p>
     * @return paymentIntegration
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationResourceIdentifier getPaymentIntegration() {
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
     * builds TransactionItemDraft with checking for non-null required values
     * @return TransactionItemDraft
     */
    public TransactionItemDraft build() {
        Objects.requireNonNull(paymentIntegration, TransactionItemDraft.class + ": paymentIntegration is missing");
        return new TransactionItemDraftImpl(paymentIntegration, amount);
    }

    /**
     * builds TransactionItemDraft without checking for non-null required values
     * @return TransactionItemDraft
     */
    public TransactionItemDraft buildUnchecked() {
        return new TransactionItemDraftImpl(paymentIntegration, amount);
    }

    /**
     * factory method for an instance of TransactionItemDraftBuilder
     * @return builder
     */
    public static TransactionItemDraftBuilder of() {
        return new TransactionItemDraftBuilder();
    }

    /**
     * create builder for TransactionItemDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionItemDraftBuilder of(final TransactionItemDraft template) {
        TransactionItemDraftBuilder builder = new TransactionItemDraftBuilder();
        builder.paymentIntegration = template.getPaymentIntegration();
        builder.amount = template.getAmount();
        return builder;
    }

}
