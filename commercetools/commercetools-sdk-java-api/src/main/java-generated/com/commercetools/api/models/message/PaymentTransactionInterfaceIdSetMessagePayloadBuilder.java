
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentTransactionInterfaceIdSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransactionInterfaceIdSetMessagePayload paymentTransactionInterfaceIdSetMessagePayload = PaymentTransactionInterfaceIdSetMessagePayload.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentTransactionInterfaceIdSetMessagePayloadBuilder
        implements Builder<PaymentTransactionInterfaceIdSetMessagePayload> {

    private String transactionId;

    @Nullable
    private String newInterfaceId;

    @Nullable
    private String oldInterfaceId;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentTransactionInterfaceIdSetMessagePayloadBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param newInterfaceId value to be set
     * @return Builder
     */

    public PaymentTransactionInterfaceIdSetMessagePayloadBuilder newInterfaceId(@Nullable final String newInterfaceId) {
        this.newInterfaceId = newInterfaceId;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @param oldInterfaceId value to be set
     * @return Builder
     */

    public PaymentTransactionInterfaceIdSetMessagePayloadBuilder oldInterfaceId(@Nullable final String oldInterfaceId) {
        this.oldInterfaceId = oldInterfaceId;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) after <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return newInterfaceId
     */

    @Nullable
    public String getNewInterfaceId() {
        return this.newInterfaceId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetTransactionInterfaceIdAction" rel="nofollow">Set Transaction InterfaceId</a> update action.</p>
     * @return oldInterfaceId
     */

    @Nullable
    public String getOldInterfaceId() {
        return this.oldInterfaceId;
    }

    /**
     * builds PaymentTransactionInterfaceIdSetMessagePayload with checking for non-null required values
     * @return PaymentTransactionInterfaceIdSetMessagePayload
     */
    public PaymentTransactionInterfaceIdSetMessagePayload build() {
        Objects.requireNonNull(transactionId,
            PaymentTransactionInterfaceIdSetMessagePayload.class + ": transactionId is missing");
        return new PaymentTransactionInterfaceIdSetMessagePayloadImpl(transactionId, newInterfaceId, oldInterfaceId);
    }

    /**
     * builds PaymentTransactionInterfaceIdSetMessagePayload without checking for non-null required values
     * @return PaymentTransactionInterfaceIdSetMessagePayload
     */
    public PaymentTransactionInterfaceIdSetMessagePayload buildUnchecked() {
        return new PaymentTransactionInterfaceIdSetMessagePayloadImpl(transactionId, newInterfaceId, oldInterfaceId);
    }

    /**
     * factory method for an instance of PaymentTransactionInterfaceIdSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessagePayloadBuilder of() {
        return new PaymentTransactionInterfaceIdSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentTransactionInterfaceIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransactionInterfaceIdSetMessagePayloadBuilder of(
            final PaymentTransactionInterfaceIdSetMessagePayload template) {
        PaymentTransactionInterfaceIdSetMessagePayloadBuilder builder = new PaymentTransactionInterfaceIdSetMessagePayloadBuilder();
        builder.transactionId = template.getTransactionId();
        builder.newInterfaceId = template.getNewInterfaceId();
        builder.oldInterfaceId = template.getOldInterfaceId();
        return builder;
    }

}
