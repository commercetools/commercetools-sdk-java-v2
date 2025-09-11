
package com.commercetools.checkout.models.payment_intents;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentCancelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentCancelAction paymentIntentCancelAction = PaymentIntentCancelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentCancelActionBuilder implements Builder<PaymentIntentCancelAction> {

    @Nullable
    private String merchantReference;

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     * @return Builder
     */

    public PaymentIntentCancelActionBuilder merchantReference(@Nullable final String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
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
     * builds PaymentIntentCancelAction with checking for non-null required values
     * @return PaymentIntentCancelAction
     */
    public PaymentIntentCancelAction build() {
        return new PaymentIntentCancelActionImpl(merchantReference);
    }

    /**
     * builds PaymentIntentCancelAction without checking for non-null required values
     * @return PaymentIntentCancelAction
     */
    public PaymentIntentCancelAction buildUnchecked() {
        return new PaymentIntentCancelActionImpl(merchantReference);
    }

    /**
     * factory method for an instance of PaymentIntentCancelActionBuilder
     * @return builder
     */
    public static PaymentIntentCancelActionBuilder of() {
        return new PaymentIntentCancelActionBuilder();
    }

    /**
     * create builder for PaymentIntentCancelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentCancelActionBuilder of(final PaymentIntentCancelAction template) {
        PaymentIntentCancelActionBuilder builder = new PaymentIntentCancelActionBuilder();
        builder.merchantReference = template.getMerchantReference();
        return builder;
    }

}
