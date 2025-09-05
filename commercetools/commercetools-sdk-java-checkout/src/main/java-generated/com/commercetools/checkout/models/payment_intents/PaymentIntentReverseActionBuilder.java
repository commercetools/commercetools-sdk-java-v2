
package com.commercetools.checkout.models.payment_intents;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentReverseActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentReverseAction paymentIntentReverseAction = PaymentIntentReverseAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentReverseActionBuilder implements Builder<PaymentIntentReverseAction> {

    @Nullable
    private String merchantReference;

    /**
     *  <p>A merchant-defined identifier associated with the <span>Payment</span> to track and reconcile the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntentAction" rel="nofollow">Payment Intent Action</a> on the merchant's side. For example, an invoice number.</p>
     * @param merchantReference value to be set
     * @return Builder
     */

    public PaymentIntentReverseActionBuilder merchantReference(@Nullable final String merchantReference) {
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
     * builds PaymentIntentReverseAction with checking for non-null required values
     * @return PaymentIntentReverseAction
     */
    public PaymentIntentReverseAction build() {
        return new PaymentIntentReverseActionImpl(merchantReference);
    }

    /**
     * builds PaymentIntentReverseAction without checking for non-null required values
     * @return PaymentIntentReverseAction
     */
    public PaymentIntentReverseAction buildUnchecked() {
        return new PaymentIntentReverseActionImpl(merchantReference);
    }

    /**
     * factory method for an instance of PaymentIntentReverseActionBuilder
     * @return builder
     */
    public static PaymentIntentReverseActionBuilder of() {
        return new PaymentIntentReverseActionBuilder();
    }

    /**
     * create builder for PaymentIntentReverseAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentReverseActionBuilder of(final PaymentIntentReverseAction template) {
        PaymentIntentReverseActionBuilder builder = new PaymentIntentReverseActionBuilder();
        builder.merchantReference = template.getMerchantReference();
        return builder;
    }

}
