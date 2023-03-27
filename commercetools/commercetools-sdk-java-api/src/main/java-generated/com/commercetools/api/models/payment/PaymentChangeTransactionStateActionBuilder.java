
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentChangeTransactionStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionStateAction paymentChangeTransactionStateAction = PaymentChangeTransactionStateAction.builder()
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeTransactionStateActionBuilder implements Builder<PaymentChangeTransactionStateAction> {

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentChangeTransactionStateActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>New TransactionState.</p>
     * @param state value to be set
     * @return Builder
     */

    public PaymentChangeTransactionStateActionBuilder state(
            final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>New TransactionState.</p>
     * @return state
     */

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    /**
     * builds PaymentChangeTransactionStateAction with checking for non-null required values
     * @return PaymentChangeTransactionStateAction
     */
    public PaymentChangeTransactionStateAction build() {
        Objects.requireNonNull(transactionId, PaymentChangeTransactionStateAction.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentChangeTransactionStateAction.class + ": state is missing");
        return new PaymentChangeTransactionStateActionImpl(transactionId, state);
    }

    /**
     * builds PaymentChangeTransactionStateAction without checking for non-null required values
     * @return PaymentChangeTransactionStateAction
     */
    public PaymentChangeTransactionStateAction buildUnchecked() {
        return new PaymentChangeTransactionStateActionImpl(transactionId, state);
    }

    /**
     * factory method for an instance of PaymentChangeTransactionStateActionBuilder
     * @return builder
     */
    public static PaymentChangeTransactionStateActionBuilder of() {
        return new PaymentChangeTransactionStateActionBuilder();
    }

    /**
     * create builder for PaymentChangeTransactionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeTransactionStateActionBuilder of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionBuilder builder = new PaymentChangeTransactionStateActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
