
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentChangeTransactionTimestampActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeTransactionTimestampAction paymentChangeTransactionTimestampAction = PaymentChangeTransactionTimestampAction.builder()
 *             .transactionId("{transactionId}")
 *             .timestamp(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeTransactionTimestampActionBuilder
        implements Builder<PaymentChangeTransactionTimestampAction> {

    private String transactionId;

    private java.time.ZonedDateTime timestamp;

    /**
     *  <p>Unique identifier of the Transaction.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentChangeTransactionTimestampActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>Timestamp of the Transaction as reported by the payment service.</p>
     * @param timestamp value to be set
     * @return Builder
     */

    public PaymentChangeTransactionTimestampActionBuilder timestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
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
     *  <p>Timestamp of the Transaction as reported by the payment service.</p>
     * @return timestamp
     */

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * builds PaymentChangeTransactionTimestampAction with checking for non-null required values
     * @return PaymentChangeTransactionTimestampAction
     */
    public PaymentChangeTransactionTimestampAction build() {
        Objects.requireNonNull(transactionId,
            PaymentChangeTransactionTimestampAction.class + ": transactionId is missing");
        Objects.requireNonNull(timestamp, PaymentChangeTransactionTimestampAction.class + ": timestamp is missing");
        return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
    }

    /**
     * builds PaymentChangeTransactionTimestampAction without checking for non-null required values
     * @return PaymentChangeTransactionTimestampAction
     */
    public PaymentChangeTransactionTimestampAction buildUnchecked() {
        return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
    }

    /**
     * factory method for an instance of PaymentChangeTransactionTimestampActionBuilder
     * @return builder
     */
    public static PaymentChangeTransactionTimestampActionBuilder of() {
        return new PaymentChangeTransactionTimestampActionBuilder();
    }

    /**
     * create builder for PaymentChangeTransactionTimestampAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeTransactionTimestampActionBuilder of(
            final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionBuilder builder = new PaymentChangeTransactionTimestampActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.timestamp = template.getTimestamp();
        return builder;
    }

}
