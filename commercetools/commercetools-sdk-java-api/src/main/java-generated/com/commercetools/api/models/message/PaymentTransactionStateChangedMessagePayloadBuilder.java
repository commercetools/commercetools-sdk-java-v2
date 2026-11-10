
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentTransactionStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionStateChangedMessagePayload paymentTransactionStateChangedMessagePayload = PaymentTransactionStateChangedMessagePayload.builder()
 *             .transactionId("{transactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentTransactionStateChangedMessagePayloadBuilder
        implements Builder<PaymentTransactionStateChangedMessagePayload> {

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> changed.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentTransactionStateChangedMessagePayloadBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change Transaction State</a> update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public PaymentTransactionStateChangedMessagePayloadBuilder state(
            final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Unique identifier for the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a> for which the <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> changed.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">Transaction State</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentChangeTransactionStateAction" rel="nofollow">Change Transaction State</a> update action.</p>
     * @return state
     */

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    /**
     * builds PaymentTransactionStateChangedMessagePayload with checking for non-null required values
     * @return PaymentTransactionStateChangedMessagePayload
     */
    public PaymentTransactionStateChangedMessagePayload build() {
        Objects.requireNonNull(transactionId,
            PaymentTransactionStateChangedMessagePayload.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentTransactionStateChangedMessagePayload.class + ": state is missing");
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }

    /**
     * builds PaymentTransactionStateChangedMessagePayload without checking for non-null required values
     * @return PaymentTransactionStateChangedMessagePayload
     */
    public PaymentTransactionStateChangedMessagePayload buildUnchecked() {
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }

    /**
     * factory method for an instance of PaymentTransactionStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder of() {
        return new PaymentTransactionStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentTransactionStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionStateChangedMessagePayloadBuilder of(
            final PaymentTransactionStateChangedMessagePayload template) {
        PaymentTransactionStateChangedMessagePayloadBuilder builder = new PaymentTransactionStateChangedMessagePayloadBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
