
package com.commercetools.api.models.payment_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetPaymentMethodStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetPaymentMethodStatusAction paymentMethodSetPaymentMethodStatusAction = PaymentMethodSetPaymentMethodStatusAction.builder()
 *             .paymentMethodStatus(PaymentMethodStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetPaymentMethodStatusActionBuilder
        implements Builder<PaymentMethodSetPaymentMethodStatusAction> {

    private com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus;

    /**
     *  <p>Value to set.</p>
     * @param paymentMethodStatus value to be set
     * @return Builder
     */

    public PaymentMethodSetPaymentMethodStatusActionBuilder paymentMethodStatus(
            final com.commercetools.api.models.payment_method.PaymentMethodStatus paymentMethodStatus) {
        this.paymentMethodStatus = paymentMethodStatus;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return paymentMethodStatus
     */

    public com.commercetools.api.models.payment_method.PaymentMethodStatus getPaymentMethodStatus() {
        return this.paymentMethodStatus;
    }

    /**
     * builds PaymentMethodSetPaymentMethodStatusAction with checking for non-null required values
     * @return PaymentMethodSetPaymentMethodStatusAction
     */
    public PaymentMethodSetPaymentMethodStatusAction build() {
        Objects.requireNonNull(paymentMethodStatus,
            PaymentMethodSetPaymentMethodStatusAction.class + ": paymentMethodStatus is missing");
        return new PaymentMethodSetPaymentMethodStatusActionImpl(paymentMethodStatus);
    }

    /**
     * builds PaymentMethodSetPaymentMethodStatusAction without checking for non-null required values
     * @return PaymentMethodSetPaymentMethodStatusAction
     */
    public PaymentMethodSetPaymentMethodStatusAction buildUnchecked() {
        return new PaymentMethodSetPaymentMethodStatusActionImpl(paymentMethodStatus);
    }

    /**
     * factory method for an instance of PaymentMethodSetPaymentMethodStatusActionBuilder
     * @return builder
     */
    public static PaymentMethodSetPaymentMethodStatusActionBuilder of() {
        return new PaymentMethodSetPaymentMethodStatusActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetPaymentMethodStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetPaymentMethodStatusActionBuilder of(
            final PaymentMethodSetPaymentMethodStatusAction template) {
        PaymentMethodSetPaymentMethodStatusActionBuilder builder = new PaymentMethodSetPaymentMethodStatusActionBuilder();
        builder.paymentMethodStatus = template.getPaymentMethodStatus();
        return builder;
    }

}
