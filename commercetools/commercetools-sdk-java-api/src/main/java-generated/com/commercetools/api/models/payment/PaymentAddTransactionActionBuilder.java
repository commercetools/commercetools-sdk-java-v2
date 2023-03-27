
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentAddTransactionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAddTransactionAction paymentAddTransactionAction = PaymentAddTransactionAction.builder()
 *             .transaction(transactionBuilder -> transactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentAddTransactionActionBuilder implements Builder<PaymentAddTransactionAction> {

    private com.commercetools.api.models.payment.TransactionDraft transaction;

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public PaymentAddTransactionActionBuilder transaction(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     * @param transaction value to be set
     * @return Builder
     */

    public PaymentAddTransactionActionBuilder transaction(
            final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     *  <p>Value to append to the <code>transactions</code> array.</p>
     * @return transaction
     */

    public com.commercetools.api.models.payment.TransactionDraft getTransaction() {
        return this.transaction;
    }

    /**
     * builds PaymentAddTransactionAction with checking for non-null required values
     * @return PaymentAddTransactionAction
     */
    public PaymentAddTransactionAction build() {
        Objects.requireNonNull(transaction, PaymentAddTransactionAction.class + ": transaction is missing");
        return new PaymentAddTransactionActionImpl(transaction);
    }

    /**
     * builds PaymentAddTransactionAction without checking for non-null required values
     * @return PaymentAddTransactionAction
     */
    public PaymentAddTransactionAction buildUnchecked() {
        return new PaymentAddTransactionActionImpl(transaction);
    }

    /**
     * factory method for an instance of PaymentAddTransactionActionBuilder
     * @return builder
     */
    public static PaymentAddTransactionActionBuilder of() {
        return new PaymentAddTransactionActionBuilder();
    }

    /**
     * create builder for PaymentAddTransactionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAddTransactionActionBuilder of(final PaymentAddTransactionAction template) {
        PaymentAddTransactionActionBuilder builder = new PaymentAddTransactionActionBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
