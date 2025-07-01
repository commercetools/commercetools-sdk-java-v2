
package com.commercetools.api.models.payment_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetPaymentInterfaceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetPaymentInterfaceAction paymentMethodSetPaymentInterfaceAction = PaymentMethodSetPaymentInterfaceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetPaymentInterfaceActionBuilder implements Builder<PaymentMethodSetPaymentInterfaceAction> {

    @Nullable
    private String paymentInterface;

    /**
     *  <p>New payment service that processes the Payment—for example, a PSP. If empty, any existing value will be removed.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodSetPaymentInterfaceActionBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>New payment service that processes the Payment—for example, a PSP. If empty, any existing value will be removed.</p>
     * @return paymentInterface
     */

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     * builds PaymentMethodSetPaymentInterfaceAction with checking for non-null required values
     * @return PaymentMethodSetPaymentInterfaceAction
     */
    public PaymentMethodSetPaymentInterfaceAction build() {
        return new PaymentMethodSetPaymentInterfaceActionImpl(paymentInterface);
    }

    /**
     * builds PaymentMethodSetPaymentInterfaceAction without checking for non-null required values
     * @return PaymentMethodSetPaymentInterfaceAction
     */
    public PaymentMethodSetPaymentInterfaceAction buildUnchecked() {
        return new PaymentMethodSetPaymentInterfaceActionImpl(paymentInterface);
    }

    /**
     * factory method for an instance of PaymentMethodSetPaymentInterfaceActionBuilder
     * @return builder
     */
    public static PaymentMethodSetPaymentInterfaceActionBuilder of() {
        return new PaymentMethodSetPaymentInterfaceActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetPaymentInterfaceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetPaymentInterfaceActionBuilder of(
            final PaymentMethodSetPaymentInterfaceAction template) {
        PaymentMethodSetPaymentInterfaceActionBuilder builder = new PaymentMethodSetPaymentInterfaceActionBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        return builder;
    }

}
