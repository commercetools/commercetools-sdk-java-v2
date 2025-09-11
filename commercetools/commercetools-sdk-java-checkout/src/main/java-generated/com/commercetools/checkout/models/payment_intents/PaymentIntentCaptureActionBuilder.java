
package com.commercetools.checkout.models.payment_intents;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentCaptureActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentCaptureAction paymentIntentCaptureAction = PaymentIntentCaptureAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentCaptureActionBuilder implements Builder<PaymentIntentCaptureAction> {

    private com.commercetools.checkout.models.common.Amount amount;

    @Nullable
    private String merchantReference;

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentCaptureActionBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentCaptureActionBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @param amount value to be set
     * @return Builder
     */

    public PaymentIntentCaptureActionBuilder amount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     * @return Builder
     */

    public PaymentIntentCaptureActionBuilder merchantReference(@Nullable final String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
    }

    /**
     *  <p>Amount to be captured. It must be less than or equal to the <span>authorized</span> amount.</p>
     * @return amount
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
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
     * builds PaymentIntentCaptureAction with checking for non-null required values
     * @return PaymentIntentCaptureAction
     */
    public PaymentIntentCaptureAction build() {
        Objects.requireNonNull(amount, PaymentIntentCaptureAction.class + ": amount is missing");
        return new PaymentIntentCaptureActionImpl(amount, merchantReference);
    }

    /**
     * builds PaymentIntentCaptureAction without checking for non-null required values
     * @return PaymentIntentCaptureAction
     */
    public PaymentIntentCaptureAction buildUnchecked() {
        return new PaymentIntentCaptureActionImpl(amount, merchantReference);
    }

    /**
     * factory method for an instance of PaymentIntentCaptureActionBuilder
     * @return builder
     */
    public static PaymentIntentCaptureActionBuilder of() {
        return new PaymentIntentCaptureActionBuilder();
    }

    /**
     * create builder for PaymentIntentCaptureAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentCaptureActionBuilder of(final PaymentIntentCaptureAction template) {
        PaymentIntentCaptureActionBuilder builder = new PaymentIntentCaptureActionBuilder();
        builder.amount = template.getAmount();
        builder.merchantReference = template.getMerchantReference();
        return builder;
    }

}
