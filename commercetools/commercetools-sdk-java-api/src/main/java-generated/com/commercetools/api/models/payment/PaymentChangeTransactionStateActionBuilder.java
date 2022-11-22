
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
     */

    public PaymentChangeTransactionStateActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>New TransactionState.</p>
     */

    public PaymentChangeTransactionStateActionBuilder state(
            final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    public PaymentChangeTransactionStateAction build() {
        Objects.requireNonNull(transactionId, PaymentChangeTransactionStateAction.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentChangeTransactionStateAction.class + ": state is missing");
        return new PaymentChangeTransactionStateActionImpl(transactionId, state);
    }

    /**
     * builds PaymentChangeTransactionStateAction without checking for non null required values
     */
    public PaymentChangeTransactionStateAction buildUnchecked() {
        return new PaymentChangeTransactionStateActionImpl(transactionId, state);
    }

    public static PaymentChangeTransactionStateActionBuilder of() {
        return new PaymentChangeTransactionStateActionBuilder();
    }

    public static PaymentChangeTransactionStateActionBuilder of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionBuilder builder = new PaymentChangeTransactionStateActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
