
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetTransactionInterfaceIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionInterfaceIdAction paymentSetTransactionInterfaceIdAction = PaymentSetTransactionInterfaceIdAction.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetTransactionInterfaceIdActionBuilder implements Builder<PaymentSetTransactionInterfaceIdAction> {

    private String transactionId;

    @Nullable
    private String interfaceId;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Transaction" rel="nofollow">Transaction</a>.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentSetTransactionInterfaceIdActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction. It must be unique across all transactions. If <code>interfaceId</code> is absent, this field will be removed from the specified Transaction, if it exists.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public PaymentSetTransactionInterfaceIdActionBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
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
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction. It must be unique across all transactions. If <code>interfaceId</code> is absent, this field will be removed from the specified Transaction, if it exists.</p>
     * @return interfaceId
     */

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     * builds PaymentSetTransactionInterfaceIdAction with checking for non-null required values
     * @return PaymentSetTransactionInterfaceIdAction
     */
    public PaymentSetTransactionInterfaceIdAction build() {
        Objects.requireNonNull(transactionId,
            PaymentSetTransactionInterfaceIdAction.class + ": transactionId is missing");
        return new PaymentSetTransactionInterfaceIdActionImpl(transactionId, interfaceId);
    }

    /**
     * builds PaymentSetTransactionInterfaceIdAction without checking for non-null required values
     * @return PaymentSetTransactionInterfaceIdAction
     */
    public PaymentSetTransactionInterfaceIdAction buildUnchecked() {
        return new PaymentSetTransactionInterfaceIdActionImpl(transactionId, interfaceId);
    }

    /**
     * factory method for an instance of PaymentSetTransactionInterfaceIdActionBuilder
     * @return builder
     */
    public static PaymentSetTransactionInterfaceIdActionBuilder of() {
        return new PaymentSetTransactionInterfaceIdActionBuilder();
    }

    /**
     * create builder for PaymentSetTransactionInterfaceIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionInterfaceIdActionBuilder of(
            final PaymentSetTransactionInterfaceIdAction template) {
        PaymentSetTransactionInterfaceIdActionBuilder builder = new PaymentSetTransactionInterfaceIdActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
