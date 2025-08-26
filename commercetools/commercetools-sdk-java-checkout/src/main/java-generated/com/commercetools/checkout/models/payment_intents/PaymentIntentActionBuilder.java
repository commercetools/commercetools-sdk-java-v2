
package com.commercetools.checkout.models.payment_intents;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentAction paymentIntentAction = PaymentIntentAction.builder()
 *             .action(PaymentIntentOperation.CAPTURE_PAYMENT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentActionBuilder implements Builder<PaymentIntentAction> {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action;

    @Nullable
    private com.commercetools.checkout.models.common.Amount amount;

    @Nullable
    private String merchantReference;

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     * @param action value to be set
     * @return Builder
     */

    public PaymentIntentActionBuilder action(
            final com.commercetools.checkout.models.payment_intents.PaymentIntentOperation action) {
        this.action = action;
        return this;
    }

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentActionBuilder amount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.AmountBuilder> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentIntentActionBuilder withAmount(
            Function<com.commercetools.checkout.models.common.AmountBuilder, com.commercetools.checkout.models.common.Amount> builder) {
        this.amount = builder.apply(com.commercetools.checkout.models.common.AmountBuilder.of());
        return this;
    }

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @param amount value to be set
     * @return Builder
     */

    public PaymentIntentActionBuilder amount(@Nullable final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>A merchant-defined identifier associated with the Payment to track and reconcile the Payment Intent Action on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     * @return Builder
     */

    public PaymentIntentActionBuilder merchantReference(@Nullable final String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
    }

    /**
     *  <p>Action to execute for the given <span>Payment</span>.</p>
     * @return action
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOperation getAction() {
        return this.action;
    }

    /**
     *  <p>Amount to be captured or refunded.</p>
     * @return amount
     */

    @Nullable
    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>A merchant-defined identifier associated with the Payment to track and reconcile the Payment Intent Action on the merchant's side. For example, an invoice number.</p>
     * @return merchantReference
     */

    @Nullable
    public String getMerchantReference() {
        return this.merchantReference;
    }

    /**
     * builds PaymentIntentAction with checking for non-null required values
     * @return PaymentIntentAction
     */
    public PaymentIntentAction build() {
        Objects.requireNonNull(action, PaymentIntentAction.class + ": action is missing");
        return new PaymentIntentActionImpl(action, amount, merchantReference);
    }

    /**
     * builds PaymentIntentAction without checking for non-null required values
     * @return PaymentIntentAction
     */
    public PaymentIntentAction buildUnchecked() {
        return new PaymentIntentActionImpl(action, amount, merchantReference);
    }

    /**
     * factory method for an instance of PaymentIntentActionBuilder
     * @return builder
     */
    public static PaymentIntentActionBuilder of() {
        return new PaymentIntentActionBuilder();
    }

    /**
     * create builder for PaymentIntentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentActionBuilder of(final PaymentIntentAction template) {
        PaymentIntentActionBuilder builder = new PaymentIntentActionBuilder();
        builder.action = template.getAction();
        builder.amount = template.getAmount();
        builder.merchantReference = template.getMerchantReference();
        return builder;
    }

}
