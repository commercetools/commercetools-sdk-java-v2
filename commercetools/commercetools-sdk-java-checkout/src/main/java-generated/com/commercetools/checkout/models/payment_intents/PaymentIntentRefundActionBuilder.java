
package com.commercetools.checkout.models.payment_intents;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentRefundActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentRefundAction paymentIntentRefundAction = PaymentIntentRefundAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentRefundActionBuilder implements Builder<PaymentIntentRefundAction> {

    private com.commercetools.checkout.models.common.Amount amount;

    @Nullable
    private String transactionId;

    @Nullable
    private String merchantReference;

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentRefundActionBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentRefundActionBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @param amount value to be set
     * @return Builder
     */

    public PaymentIntentRefundActionBuilder amount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>The identifier of the capture transaction that is associated with the refund action.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentIntentRefundActionBuilder transactionId(@Nullable final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     * @return Builder
     */

    public PaymentIntentRefundActionBuilder merchantReference(@Nullable final String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
    }

    /**
     *  <p>Amount to be refunded. It must be less than or equal to the <span>captured</span> amount.</p>
     * @return amount
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>The identifier of the capture transaction that is associated with the refund action.</p>
     * @return transactionId
     */

    @Nullable
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @Nullable
    public String getMerchantReference() {
        return this.merchantReference;
    }

    /**
     * builds PaymentIntentRefundAction with checking for non-null required values
     * @return PaymentIntentRefundAction
     */
    public PaymentIntentRefundAction build() {
        Objects.requireNonNull(amount, PaymentIntentRefundAction.class + ": amount is missing");
        return new PaymentIntentRefundActionImpl(amount, transactionId, merchantReference);
    }

    /**
     * builds PaymentIntentRefundAction without checking for non-null required values
     * @return PaymentIntentRefundAction
     */
    public PaymentIntentRefundAction buildUnchecked() {
        return new PaymentIntentRefundActionImpl(amount, transactionId, merchantReference);
    }

    /**
     * factory method for an instance of PaymentIntentRefundActionBuilder
     * @return builder
     */
    public static PaymentIntentRefundActionBuilder of() {
        return new PaymentIntentRefundActionBuilder();
    }

    /**
     * create builder for PaymentIntentRefundAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentRefundActionBuilder of(final PaymentIntentRefundAction template) {
        PaymentIntentRefundActionBuilder builder = new PaymentIntentRefundActionBuilder();
        builder.amount = template.getAmount();
        builder.transactionId = template.getTransactionId();
        builder.merchantReference = template.getMerchantReference();
        return builder;
    }

}
